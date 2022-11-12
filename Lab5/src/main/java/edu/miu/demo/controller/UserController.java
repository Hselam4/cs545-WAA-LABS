package edu.miu.demo.controller;

import edu.miu.demo.domain.Post;
import edu.miu.demo.domain.User;
import edu.miu.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping
    public List<User> getAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") long id){
        return userService.findById(id);
    }
    @PostMapping
    public void create(@RequestBody User user){
        userService.save(user);
    }
    @GetMapping("/{id}/posts")
    public List<Post> getPosts(@PathVariable long id){
        return userService.findPosts(id);
    }
    @PostMapping("/{id}/posts")
    public void addPost(@PathVariable("id") long id, @RequestBody Post post){
        userService.addPost(id, post);
    }
    @GetMapping("/filter/{n}")
    public List<User> findUserByPostsGreaterThan(@PathVariable int n) {
        return userService.findUserByPostsGreaterThan(n);
    }

}
