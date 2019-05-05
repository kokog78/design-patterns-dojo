package dojo.patterns.iterator;

import dojo.patterns.gameoflife.AbstractTable;
import dojo.patterns.gameoflife.Cell;
import dojo.patterns.gameoflife.Position;

public class NormalTable extends AbstractTable<Cell> {
	
	@Override
	protected Cell createLiveCell(Position position) {
		return new Cell(position, true);
	}
	
}
