package dojo.patterns.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class GameOfLife {

	private final Table table = new Table();
	
	public void run() {
		Set<Position> diedCells = new HashSet<>();
		Set<Position> freeCells = new HashSet<>();
		collectPositions(diedCells, freeCells);
		placeNewbornCells(freeCells);
		removeDiedCells(diedCells);
	}
	
	private void collectPositions(Set<Position> diedCells, Set<Position> freeCells) {
		// TODO az elpusztuló cellák pozícióinak összegyűjtése a diedCells halmazba
		// TODO (ha egy élő cellának NEM 2 vagy 3 szomszédja van, elpusztul)
		// TODO a szabad cellák pozícióinak összegyűjtése a freeCells halmazba
	}
	
	private void placeNewbornCells(Set<Position> freeCells) {
		// TODO a freeCells halmaz vizsgálata
		// TODO (ha egy cellának pontosan 3 szomszédja van, akkor oda születni fog)
	}
	
	private void removeDiedCells(Set<Position> diedCells) {
		// TODO a diedCells halmaz pozícióin elpusztulnak a cellák
	}
	
}
