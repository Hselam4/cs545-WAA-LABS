package miu.edu.lab3Post.service;

import miu.edu.lab3Post.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    public List<Post> getAll();
    public Optional<Post> getPostByID(long id);

}
