package dojo.patterns.gameoflife;

import java.util.HashMap;
import java.util.Map;

public class Table {

	private final Map<Position, Cell> liveCellMap = new HashMap<>();
	
	public void setCell(int x, int y, boolean live) {
		Position position = getPosition(x, y);
		setCell(position, live);
	}
	
	public void setCell(Position position, boolean live) {
		if (live) {
			liveCellMap.put(position, createLiveCell(position));
		} else {
			liveCellMap.remove(position);
		}
	}
	
	public boolean isCellLive(int x, int y) {
		Position position = getPosition(x, y);
		Cell cell = liveCellMap.get(position);
		if (cell != null) {
			return cell.isLive();
		} else {
			return false;
		}
	}
	
	private Cell createLiveCell(Position position) {
		return new Cell(position, true);
	}
	
	private Position getPosition(int x, int y) {
		return new Position(x, y);
	}
}
