package dojo.patterns.iterator;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import dojo.patterns.testresults.Specification;
import dojo.patterns.testresults.Step;
import dojo.patterns.testresults.TestRun;

public class StepNameCollectorTest {

	private StepNameCollector collector = new StepNameCollector();
	
	@Test
	public void should_collect_failed_step_names() throws Exception {
		TestRun testRun = testRun(
				specification("spec1",
						test("test11",
								step("ns1", "step111", true),
								step("ns2", "step112", false,
										step("ns3", "step1121", false)
								)
						),
						test("test12",
								step("ns3", "step121", false)
						)
				),
				specification("spec2",
						test("test21",
								step("ns3", "step211", true)
						),
						test("test22",
								step("ns1", "step221", true),
								step("ns2", "step222", false,
										step("ns3", "step2221", true)
								)
						)
				)
		);
		List<String> result = collector.collectFailedStepNames(testRun);
		assertThat(result).containsExactly("ns2: step112", "ns3: step1121", "ns3: step121", "ns2: step222");
	}
	
	private TestRun testRun(Specification ... specifications) {
		TestRun testRun = new TestRun();
		for (Specification specification : specifications) {
			testRun.getSpecifications().add(specification);
		}
		return testRun;
	}
	
	private Specification specification(String name, dojo.patterns.testresults.Test ... tests) {
		Specification specification = new Specification();
		specification.setName(name);
		for (dojo.patterns.testresults.Test test : tests) {
			specification.getTests().add(test);
		}
		return specification;
	}
	
	private dojo.patterns.testresults.Test test(String name, Step ... steps) {
		dojo.patterns.testresults.Test test = new dojo.patterns.testresults.Test();
		test.setName(name);
		for (Step step : steps) {
			test.getSteps().add(step);
		}
		return test;
	}
	
	private Step step(String namespace, String shortName, boolean success, Step ... steps) {
		Step result = new Step();
		result.setNamespace(namespace);
		result.setShortName(shortName);
		result.setSuccess(success);
		for (Step step : steps) {
			result.getSteps().add(step);
		}
		return result;
	}
	
}
