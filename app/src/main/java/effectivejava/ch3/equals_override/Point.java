package effectivejava.ch3.equals_override;


public class Point {
	
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {

		// self-comparison
		if (this == obj)
			return true;

		// pre-cast check, implicit null-check (i.e. null instanceof X is always false)
		if (!(obj instanceof Point)) {
			return false;
		}

		// cast and "essential" fields comparison
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;

		return true;
	}




}
