package dojo.patterns.gameoflife;

public class Cell {

	private final Position position;
	private boolean live;
	
	public Cell(Position position, boolean live) {
		super();
		this.position = position;
		this.live = live;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public boolean isLive() {
		return live;
	}
	
	public void setLive(boolean live) {
		this.live = live;
	}
}
