package effectivejava.ch2.builder;

import java.util.EnumSet;
import java.util.Set;
import java.util.Objects;

/**
 *	An example of the builder pattern applied to inherited classes.
 */
public abstract class SponsoredAthlete {
	public enum Sponsor { NIKE, ADIDAS, REEBOK, PUMA };
	Set<Sponsor> sponsors;

	// generic type with a recursive-type parameter (i.e. subclasses are expected to extend SponsoredAthlete.Builder, so that T refers to the subclass type)
	abstract static class Builder<T extends Builder<T>> {
		EnumSet<Sponsor> sponsors = EnumSet.noneOf(Sponsor.class);

		// if we returned this, we would have to cast to type T. To prevent this, force builder subclasses to implement a self method that returns itself.
		public T addSponsor(Sponsor sponsor) {
			sponsors.add(Objects.requireNonNull(sponsor));
			return self();
		}

		// overrides expected to be public, and returns an instance of itself using a private constructor with its builder as a parameter.
		abstract SponsoredAthlete build();

		protected abstract T self();
	}

	// subclasses will make call to super, which will run the code below
	SponsoredAthlete(Builder<?> builder) {
		sponsors = builder.sponsors.clone();
	}


	// below methods are for printing objects to stdout, and not a required part of the builder pattern implementation.
	@Override
	public String toString() {
		return "SponsoredAthlete [sponsors=" + sponsors + "]";
	}

	public Set<Sponsor> getSponsors() {
		return sponsors;
	}
}
