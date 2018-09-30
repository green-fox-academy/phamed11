package com.greenfoxacademy.redditclone;

import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditcloneApplication implements CommandLineRunner {

  private PostService postService;

  @Autowired
  public RedditcloneApplication(PostService postService) {
    this.postService = postService;
  }

  public static void main(String[] args) {
    SpringApplication.run(RedditcloneApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    postService.savePost(new Post("Index", "https://index.hu", 40));
    postService.savePost(new Post("NFL", "https://nfl.com", 20));
    postService.savePost(new Post("CNN", "https://cnn.com", 22));
    postService.savePost(new Post("Facebook ", "https://facebook.com", 3));
    postService.savePost(new Post("Szanalmas.hu", "https://szanalmas.hu", 33));


  }
}
