package com.greenfoxacademy;

public class Main {
  public static void main(String[] args) {

//    Create a PostIt class that has
//        a backgroundColor
//        a text on it
//        a textColor
//        Create a few example post-it objects:
//    an orange with blue text: "Idea 1"
//    a pink with black text: "Awesome"
//    a yellow with green text: "Superb!"
    PostIt orange = new PostIt();
    PostIt pink = new PostIt();
    PostIt yellow = new PostIt();
    orange.PostIt("red", "Awesome", "black");
    pink.PostIt("pink", "Nothing here", "black");
    yellow.PostIt("Yellow", "What the fuck", "black");

    yellow.BackGroundColor();




  }
}
