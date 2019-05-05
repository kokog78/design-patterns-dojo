package dojo.patterns.iterator;

import java.util.HashSet;
import java.util.Set;

import dojo.patterns.gameoflife.Cell;
import dojo.patterns.gameoflife.Position;

public class GameOfLife {

	private final NormalTable table = new NormalTable();
	
	public void run() {
		Set<Position> diedCells = new HashSet<>();
		Set<Position> freeCells = new HashSet<>();
		collectPositions(diedCells, freeCells);
		placeNewbornCells(freeCells);
		removeDiedCells(diedCells);
	}
	
	private void collectPositions(Set<Position> diedCells, Set<Position> freeCells, Position position) {
		// TODO position-t add hozzá diedCells-hez, ha meghalna
		// TODO freeCells-hez add hozzá position üres szomszédjait
	}
	
	private int getNumberOfLiveNeighbours(Position position) {
		// TODO az adott cella élő szomszédjainak összeszámolása
		return 0;
	}

	private void collectPositions(Set<Position> diedCells, Set<Position> freeCells) {
		for (Cell liveCell : table.liveCells()) {
			collectPositions(diedCells, freeCells, liveCell.getPosition());
		}
	}
	
	private void placeNewbornCells(Set<Position> freeCells) {
		for (Position position : freeCells) {
			if (getNumberOfLiveNeighbours(position) == 3) {
				table.setCell(position, true);
			}
		}
	}
	
	private void removeDiedCells(Set<Position> diedCells) {
		for (Position position : diedCells) {
			table.setCell(position, false);
		}
	}
	
}
