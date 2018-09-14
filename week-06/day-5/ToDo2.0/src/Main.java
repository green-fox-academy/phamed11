import com.sun.tools.javac.comp.Todo;

public class Main {
  public static void main(String[] args) {


    String listName = "../../../assets/TodoList.txt";

    if (args.length == 0) {
      ToDo.message();
    } else if (args[0].equals("-l")) {
      if (ToDo.emptyList()) {
        System.out.println("No todos for today! :)");
      } else {
        ToDo.listMessage();
      }
    } else if (args[0].equals("-a")) {
      if (args.length == 1) {
        System.out.println("Unable to add: no task provided");
      } else {
        ToDo.addToList(args[1]);
        ToDo.listMessage();
      }
    } else if (args[0].equals("-r")) {
      try {
        if (args.length == 1) {
          System.out.println("Unable to remove: no index is provided");
        } else if (ToDo.sizeOfTheList(args[1])) {
          System.out.println("Unable to remove: index is out of bound");
        } else {
          ToDo.removeTask(args[1]);
          ToDo.listMessage();
        }
      } catch (NumberFormatException e) {
        System.out.println("Unable to remove: index is not a number");
      }
    } else if (args[0].equals("-c")) {
      try {
        if (args.length == 1) {
          System.out.println("Unable to check: no index provided");
        } else if (ToDo.sizeOfTheList(args[1])) {
          System.out.println("Unable to check: index is out of bound");
        } else {
          ToDo.checkTask(args[1]);
          ToDo.listMessage();
        }
      } catch (NumberFormatException e) {
        System.out.println("Unable to check: index is not a number");
      }
    } else {
      System.out.println("Unsupported argument");
    }
  }
}
