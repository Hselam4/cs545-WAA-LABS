package miu.edu.lab3Post.service;

import miu.edu.lab3Post.domain.Post;
import miu.edu.lab3Post.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PostServiceImpli implements PostService{
    @Autowired
    PostRepo postRepository;

    @Override
    public List<Post> getAll() {
        return postRepository.getAll();
    }

    @Override
    public Optional<Post> getPostByID(long id) {
        return postRepository.getPostByID(id);
    }

}
