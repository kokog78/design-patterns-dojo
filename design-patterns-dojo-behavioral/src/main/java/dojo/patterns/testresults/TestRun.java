package dojo.patterns.testresults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestRun implements TestNode {

	private Date startDate;
	private Date endDate;
	private final List<Specification> specifications = new ArrayList<>();
	
	@Override
	public String getName() {
		return "Test Run";
	}

	@Override
	public long getDuration() {
		return endDate.getTime() - startDate.getTime();
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public List<Specification> getSpecifications() {
		return specifications;
	}

	@Override
	public List<? extends TestNode> getChildren() {
		return specifications;
	}
}
