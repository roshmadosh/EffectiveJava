package effectivejava.ch2.builder;


/**
 *	An example of a class with many parameters of the same type, and that would benefit from using the builder pattern.
 */
public class Athlete {
	private final double height; // required
	private final double bodyWeight;  // required
	private final double bench;  // rest are optional
	private final double squat;
	private final double deadlift;

	public static class Builder {
		private final double height;
		private final double bodyWeight;

		// optional attributes need default values
		private double bench = 0;
		private double squat = 0;
		private double deadlift = 0;

		// mandatory attributes initialized in builder's constructor
		public Builder(double height, double bodyWeight) {
			this.height = height;
			this.bodyWeight = bodyWeight;
		}

		public Builder bench(double amount) {
			bench = amount;
			return this;
		}
		
		public Builder squat(double amount) {
			squat = amount;
			return this;
		}

		public Builder deadlift(double amount) {
			deadlift = amount;
			return this;
		}

		public Athlete build() {
			return new Athlete(this);
		}
	}

	private Athlete(Builder builder) {
		this.height = builder.height;
		this.bodyWeight = builder.bodyWeight;
		this.bench = builder.bench;
		this.squat = builder.squat;
		this.deadlift = builder.deadlift;
	}

	@Override
	public String toString() {
		return "Athlete [height=" + height + ", bodyWeight=" + bodyWeight + ", bench=" + bench + ", squat=" + squat
				+ ", deadlift=" + deadlift + "]";
	}

}
