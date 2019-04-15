package dojo.patterns.composit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class JsonFormatterTest {

	private JsonFormatter formatter = new JsonFormatter();
	
	@Test
	public void should_format_task() throws Exception {
		String result = format(new Task("abc"));
		assertThat(result).isEqualTo("{\"description\":\"abc\"}");
	}
	
	@Test
	public void should_format_task_list() throws Exception {
		String result = format(new TaskList(new Task("abc"), new Task("def")));
		assertThat(result).isEqualTo("{\"tasks\":[{\"description\":\"abc\"},{\"description\":\"def\"}]}");
	}
	
	private String format(Task task) {
		// TODO formatter meghívása
		return null;
	}

	private String format(TaskList tasks) {
		// TODO formatter meghívása
		return null;
	}
}
