import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;

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

  public static boolean emptyList() {
    List<String> allLines = toList();
    if (allLines.size() > 0) {
      return false; // not empty
    }
    return true; // empty
  }

  public static ArrayList addToList(String toAdd) {
    ArrayList<String> toList = new ArrayList<>();
    try {
      List<String> allLines = toList();
      if (allLines.size() == 0) {
        toList.add(" - [ ] " + toAdd);
      } else {
        toList.add(" - [ ] " + toAdd);
      }
      Files.write(getPath(), toList, APPEND);
    } catch (IOException e) {
      System.out.println("Cannot write file");
    }
    return toList;
  }

  public static List<String> toList() {
    List<String> allLines = new ArrayList<>();
    try {
      allLines = Files.readAllLines(getPath());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return allLines;
  }

  public static void listMessage() {
    List<String> allLines = toList();

    for (int i = 0; i < allLines.size(); i++) {
      System.out.println(i + 1 + allLines.get(i));
    }
  }

  public static Path getPath() {
    Path myPath = Paths.get("../../../assets/TodoList.txt");
    return myPath;
  }

  public static void removeTask(String number) {
    int toRemove = Integer.parseInt(number);
    try {
      List<String> allLines = Files.readAllLines(getPath());
      allLines.remove(toRemove - 1);
      Files.write(getPath(), allLines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static boolean sizeOfTheList(String number) {
    int size = 0;
    int args1 = Integer.parseInt(number);
      List<String> allLines = toList();
      size = allLines.size();
    return args1 > size;
  }

  public static void checkTask(String number) {
    List<String> modifiedText = new ArrayList<>();
    int numToCheck = Integer.parseInt(number);
    try {
      List<String> allLines = toList();
      for (int i = 0; i < allLines.size(); i++) {
        if (i == numToCheck - 1) {
          allLines.set(i, " - [X] " + allLines.get(i).split("] ")[1]);
          modifiedText.add(allLines.get(i));
        } else {
          modifiedText.add(allLines.get(i));
        }
      }
      Files.write(getPath(), modifiedText);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
