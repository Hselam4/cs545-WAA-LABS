package miu.edu.lab3Post.controller;

import miu.edu.lab3Post.domain.Post;
import miu.edu.lab3Post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping("/posts")
@RestController
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Post> getPostById(@PathVariable("id") long id) {
        return postService.getPostByID(id);

    }
}
