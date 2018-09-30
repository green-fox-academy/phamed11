package com.greenfoxacademy.redditclone.controllers;

import com.greenfoxacademy.redditclone.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

  private PostService postService;

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("allposts", postService.AllPosts());
    return "index";
  }


  @GetMapping("/upvote/{id}")
  public String upVoting(@PathVariable(value = "id") Long id) {
  postService.upVotingByIdSave(id);
    return "redirect:/";
  }

  @GetMapping("/downvote/{id}")
  public String downVoting(@PathVariable(value = "id") Long id) {
    postService.downVotingByIdSave(id);
    return "redirect:/";
  }

}

