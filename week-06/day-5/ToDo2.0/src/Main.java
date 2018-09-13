
public class Main {
  public static void main(String[] args) {


    String listName = "../../../assets/TodoList.txt";

    if (args.length == 0) {
      ToDo.message();
    } else if (args[0].equals("-l")) {
      if (ToDo.emptyList(listName)) {
        System.out.println("No todos for today! :)");
      } else {
        ToDo.listMessage(listName);
      }

    }
  }
}
