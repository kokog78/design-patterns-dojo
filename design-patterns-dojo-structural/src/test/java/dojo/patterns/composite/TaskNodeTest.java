package dojo.patterns.composite;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import dojo.patterns.composite.Task;
import dojo.patterns.composite.TaskList;

public class TaskNodeTest {
	
	@Test
	public void should_format_task_with_description() throws Exception {
		String result = toJson(new Task("abc"));
		assertThat(result).isEqualTo("{\"description\":\"abc\"}");
	}
	
	@Test
	public void should_format_empty_task_list() throws Exception {
		String result = toJson(new TaskList());
		assertThat(result).isEqualTo("{\"tasks\":[]}");
	}
	
	@Test
	public void should_format_task_list_with_tasks() throws Exception {
		String result = toJson(new TaskList(new Task("abc"), new Task("def")));
		assertThat(result).isEqualTo("{\"tasks\":[{\"description\":\"abc\"},{\"description\":\"def\"}]}");
	}
	
	@Test
	public void should_format_complex_task_list() throws Exception {
		TaskList tasks = new TaskList(new Task("abc"));
		addTaskListToTaskList(tasks, new TaskList(new Task("def")));
		String result = toJson(tasks);
		assertThat(result).isEqualTo("{\"tasks\":[{\"description\":\"abc\"},{\"tasks\":[{\"description\":\"def\"}]}]}");
	}
	
	private String toJson(Task task) {
		// TODO toJson metódus meghívása
		return null;
	}

	private String toJson(TaskList tasks) {
		// TODO toJson metódus meghívása
		return null;
	}
	
	private void addTaskListToTaskList(TaskList parent, TaskList child) {
		// TODO gyerekelem hozzáadása a szülőhöz
	}
}
