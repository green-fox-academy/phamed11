package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.models.Post;

import java.util.List;

public interface PostService {

  void savePost(Post post);

  Post findPostById(Long id);

  void deletePostById(Long id);

  List<Post> AllPosts();
}
