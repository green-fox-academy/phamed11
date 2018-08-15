package com.greenfoxacademy;

public class Main {

    public static void main(String[] args) {
//        Create a BlogPost class that has
//            an authorName
//            a title
//            a text
//            a publicationDate
//            Create a few blog post objects:
//        "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//        Lorem ipsum dolor sit amet.
//        "Wait but why" titled by Tim Urban posted at "2010.10.10."
//        A popular long-form, stick-figure-illustrated blog about almost everything.
//        "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
//        When I asked to take his picture outside one of IBM’s New York City offices,
//            he told me that he wasn’t really into the whole organizer profile thing.
        BlogPost first = new BlogPost();
        first.publicationDate = "2002.05.3.";
        first.title = "My pity journal";
        first.authorsName = "Mr. Nobody";
        first.text = "Today I woke up badly, there was a monster under my bed.";

        first.posts();
      System.out.println();

        BlogPost second = new BlogPost();
        second.publicationDate = "2012.03.22";
        second.title = "Its not normal";
        second.authorsName = "Mr. Nobody";
        second.text = "I cannot sleep after last nights fiasko";

        second.posts();







    }
}
