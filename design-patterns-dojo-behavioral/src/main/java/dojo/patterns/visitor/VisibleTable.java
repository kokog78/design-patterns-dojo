package dojo.patterns.visitor;

import java.util.function.Consumer;

import dojo.patterns.gameoflife.AbstractTable;
import dojo.patterns.gameoflife.Position;

public class VisibleTable extends AbstractTable<VisibleCell> implements Consumer<Visitor> {

	@Override
	public void accept(Visitor t) {
		// TODO metódus megírása
	}
	
	@Override
	protected VisibleCell createLiveCell(Position position) {
		return new VisibleCell(position, true);
	}

}
