package dojo.patterns.testresults;

import java.util.List;

public interface TestNode {

	public String getName();
	
	public long getDuration();
	
	public List<? extends TestNode> getChildren();
	
}
