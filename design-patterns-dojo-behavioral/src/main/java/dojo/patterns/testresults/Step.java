package dojo.patterns.testresults;

import java.util.ArrayList;
import java.util.List;

public class Step implements TestNode {

	private String namespace;
	private String shortName;
	private long duration;
	private boolean success;
	private final List<Step> steps = new ArrayList<>();
	
	@Override
	public String getName() {
		if (namespace == null) {
			return shortName;
		} else {
			return namespace + ": " + shortName;
		}
	}
	
	public String getShortName() {
		return shortName;
	}
	
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@Override
	public long getDuration() {
		return duration;
	}
	
	public void setDuration(long duration) {
		this.duration = duration;
	}
	
	public boolean isSuccess() {
		return success;
	}
	
	public void setSuccess(boolean success) {
		this.success = success;
	}

	public List<Step> getSteps() {
		return steps;
	}

}
