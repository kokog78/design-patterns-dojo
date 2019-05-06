package dojo.patterns.gameoflife;


import java.util.Iterator;

public class Neighbours implements Iterable<Cell> {

	private final Table table;
	private final Position position;
	
	public Neighbours(Table table, Position position) {
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
