import java.util.ArrayList;
import java.util.List;

public class ToDo {
  private List<Task> allTask;

  public ToDo() {
    allTask = new ArrayList<>();
  }

  public void add(Task task) {
    allTask.add(task);
  }

  public String toString() {
    return allTask.toString();
  }

}
