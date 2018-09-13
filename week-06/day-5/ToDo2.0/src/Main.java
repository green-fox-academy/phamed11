import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    ToDo toDo = new ToDo();
    Task one = new Task("walk the dog");
    Task one2 = new Task("drink beer");
    Task one3 = new Task("watch tv");

    toDo.add(one);
    toDo.add(one2);
    toDo.add(one3);

    one.setDone();

    System.out.println(toDo);

  }
}
