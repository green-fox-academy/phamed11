package com.greenfoxacademy;

import java.util.ArrayList;

public class Blog {
  ArrayList<BlogPost> blog = new ArrayList<>();
  String name;

  public Blog() {
    this.name = name;
  }

  public void addBlogPost(BlogPost name) {
    blog.add(name);
  }

  public void deleteBlogPost(int index) {
    blog.remove(index);
  }

  public String numberOfBlogPosts() {
    return "My blog has " + blog.size() + " blogposts.";
  }

  public ArrayList<BlogPost> update(int index, BlogPost post) {
    blog.set(index, post);
    return blog;
  }

  public void printMyBlogPosts() {
    for (int i = 0; i < blog.size(); i++) {
      blog.get(i).posts();
      System.out.println();
    }
  }

}
