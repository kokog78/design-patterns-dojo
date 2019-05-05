package dojo.patterns.gameoflife;

public class Position {

	private final int x, y;

	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public int hashCode() {
		return x*y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Position) {
			Position pos = (Position)obj;
			return pos.x == x && pos.y == y;
		}
		return false;
	}
	
}
