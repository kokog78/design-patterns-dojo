package dojo.patterns.testresults;

import java.util.ArrayList;
import java.util.List;

public class Test implements TestNode {

	private String name;
	private long duration;
	private final List<Step> steps = new ArrayList<>();

	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public long getDuration() {
		return duration;
	}
	
	public void setDuration(long duration) {
		this.duration = duration;
	}
	
	public List<Step> getSteps() {
		return steps;
	}

	@Override
	public List<? extends TestNode> getChildren() {
		return steps;
	}
}
