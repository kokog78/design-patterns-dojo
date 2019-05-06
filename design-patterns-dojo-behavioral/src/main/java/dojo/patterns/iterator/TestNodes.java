package dojo.patterns.iterator;

import java.util.Iterator;

import dojo.patterns.testresults.TestNode;
import dojo.patterns.testresults.TestRun;

public class TestNodes implements Iterable<TestNode> {

	private final TestRun testRun;
	
	public TestNodes(TestRun testRun) {
		super();
		this.testRun = testRun;
	}

	@Override
	public Iterator<TestNode> iterator() {
		// TODO metódus megírása
		return null;
	}

}
