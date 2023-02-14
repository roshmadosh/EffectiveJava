package effectivejava.ch2.builder;

public class BasketballPlayer extends SponsoredAthlete {
  
	private final int wingspan;
	private final double standingVertical;

	public static class Builder extends SponsoredAthlete.Builder<Builder> {
		private final int wingspan;

		private double standingVertical = 0.0;

		public Builder(int wingspanInInches) {
			this.wingspan = wingspanInInches;
		}

		public Builder standingVertical(double heightInInches) {
			standingVertical = heightInInches;
			return this;
		}

		@Override
		public SponsoredAthlete build() {
			return new BasketballPlayer(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
		
	}

	private	BasketballPlayer(Builder builder) {
		super(builder);
		this.wingspan = builder.wingspan;
		this.standingVertical = builder.standingVertical;
	}


}
