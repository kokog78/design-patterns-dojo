package dojo.patterns.iterator;

import java.util.Iterator;

import dojo.patterns.gameoflife.Cell;
import dojo.patterns.gameoflife.Position;

public class Neighbours implements Iterable<Cell> {

	private final NormalTable table;
	private final Position position;
	
	public Neighbours(NormalTable table, Position position) {
		super();
		this.table = table;
		this.position = position;
	}
	
	@Override
	public Iterator<Cell> iterator() {
		// TODO metódus megírása
		return null;
	}

}
