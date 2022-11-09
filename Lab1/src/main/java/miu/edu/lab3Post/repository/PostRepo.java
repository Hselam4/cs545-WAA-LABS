package miu.edu.lab3Post.repository;

import miu.edu.lab3Post.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepo {
    public List<Post> getAll();
    public Optional<Post> getPostByID(long id);

}
