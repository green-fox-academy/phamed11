package com.greenfoxacademy;

public class Main {

    public static void main(String[] args) {

//        Reuse your BlogPost class
//        Create a Blog class which can
//            store a list of BlogPosts
//            add BlogPosts to the list
//            delete(int) one item at given index
//        update(int, BlogPost) one item at the given index and update it with another BlogPost

    BlogPost today = new BlogPost("Peter", "Today is a good day","what a fantastid day to wake up", "Sunday");
    BlogPost yesterday = new BlogPost("peter", "Nothing special", "its all boring", "Yesterday");
    BlogPost tomorrow = new BlogPost("Peter", "this is the title", "no text here", "tomorrow");
    BlogPost newShit = new BlogPost("peter", "best thing ever", "this post is better", "today");

    Blog myJournal = new Blog();
    myJournal.addBlogPost(tomorrow);
    myJournal.addBlogPost(today);
    myJournal.addBlogPost(yesterday);
    System.out.println(myJournal.numberOfBlogPosts());

    myJournal.deleteBlogPost(1);

    myJournal.update(1, newShit);

    myJournal.printMyBlogPosts();


    }
}
