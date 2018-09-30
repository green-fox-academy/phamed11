package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

  private PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }
  
  @Override
  public void savePost(Post post) {
    postRepository.save(post);
  }

  @Override
  public Post findPostById(Long id) {
    return postRepository.findById(id).get();
  }

  @Override
  public void deletePostById(Long id) {
    postRepository.deleteById(id);
  }

  @Override
  public List<Post> AllPosts() {
    return postRepository.findAllByOrOrderByIdIdAsc();
  }

}
