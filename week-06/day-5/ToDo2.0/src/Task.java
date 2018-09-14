public class Task {
  private String name;
  private boolean isDone;

  public Task(String name) {
    this.name = name;
    isDone = false;
  }

  public String getName() {
    return name;
  }

  public void setDone() {
    isDone = true;
  }

  public boolean isDone() {
    return isDone;
  }

  public String toString() {
//    return String.format("The %s task " + "is %s", name, (isDone ? "done!" : "not done!"));
    return String.format(" - " + "%s", (isDone ? "[X] " + getName() : "[ ] " + getName()));
  }
}
