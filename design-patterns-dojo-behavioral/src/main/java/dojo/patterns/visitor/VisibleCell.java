package dojo.patterns.visitor;

import java.util.function.Consumer;

import dojo.patterns.gameoflife.Cell;
import dojo.patterns.gameoflife.Position;

public class VisibleCell extends Cell implements Consumer<Visitor> {

	public VisibleCell(Position position, boolean live) {
		super(position, live);
	}

	@Override
	public void accept(Visitor t) {
		// TODO metódus megírása
	}

}
