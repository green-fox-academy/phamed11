import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

  public static void message() {
    System.out.println("Command Line Todo application");
    System.out.println("=============================");
    System.out.println();
    System.out.println("Command line arguments:");
    System.out.println(" -l   Lists all the tasks\n" +
        " -a   Adds a new task\n" +
        " -r   Removes an task\n" +
        " -c   Completes an task");
  }

  public static boolean emptyList(String path) {
    List<String> allLines = toList(path);
    if (allLines.size() > 0) {
      return false; // not empty
    }
    return true; // empty
  }


  public static List<String> toList(String path) {
    Path myPath = Paths.get(path);
    List<String> allLines = new ArrayList<>();
    try {
      allLines = Files.readAllLines(myPath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return allLines;
  }

  public static void listMessage(String path) {
    List<String> allLines = toList(path);

    for (int i = 0; i < allLines.size(); i++) {
      System.out.println(i + 1 + allLines.get(i));
    }
  }

}
