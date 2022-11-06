package edu.miu.demo.controller;

import edu.miu.demo.domain.Post;
import edu.miu.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    @Autowired
    PostService postService;
    @GetMapping
    public List<Post> getAll(){
        return postService.findAll();
    }
    @GetMapping("/{id}")
    public Post getById(@PathVariable("id") long id){
        return postService.findById(id);
    }
    @PostMapping
    public void create(@RequestBody Post post){
        postService.save(post);
    }
    @PutMapping("/{id}")
    public void change( @PathVariable("id") long id,@RequestBody Post post){
        postService.update(id,post);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") long id){
        postService.delete(id);
    }

}
