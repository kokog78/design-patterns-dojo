package dojo.patterns.composite;

import java.util.ArrayList;
import java.util.List;

// TODO TaskNode interfész implementálása
public class TaskList {

	// TODO generikus típus megváltoztatása TaskNode-ra
	private List<Task> tasks;
	
	public TaskList(Task ... tasks) {
		this.tasks = new ArrayList<>();
		for (Task task : tasks) {
			this.tasks.add(task);
		}
	}
	
	public void addTask(Task task) {
		tasks.add(task);
	}
	
	public List<Task> getTasks() {
		return tasks;
	}
	
}
