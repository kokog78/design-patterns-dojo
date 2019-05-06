package dojo.patterns.testresults;

import java.util.ArrayList;
import java.util.List;

public class Specification implements TestNode {

	private String name;
	private long duration;
	private String className;
	private final List<Test> tests = new ArrayList<>();
	
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
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public List<Test> getTests() {
		return tests;
	}
	
	@Override
	public List<? extends TestNode> getChildren() {
		return tests;
	}

}
