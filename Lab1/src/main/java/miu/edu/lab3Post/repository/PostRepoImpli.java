package miu.edu.lab3Post.repository;

import miu.edu.lab3Post.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@Repository
public class PostRepoImpli implements PostRepo{
    List<Post> PostsList = new ArrayList<>(Arrays.asList(
            new Post(111, "Nature", "The earth has music for those who listen.", "George Santayana"),
            new Post(222, "Family", "Family is not an important thing. It's everything.", "chael J. Fox"),
            new Post(333, "Knowledge", "Knowledge is power. Information is liberating. Education is the premise of progress, in every society, in every family.", "Kofi Annan"),
            new Post(444, "Peace", "Peace is the beauty of life. It is sunshine. It is the smile of a child, the love of a mother, the joy of a father, the togetherness of a family. It is the advancement of man, the victory of a just cause, the triumph of truth.","Menachem Begin"),
            new Post(555, "Health", "To enjoy good health, to bring true happiness to one's family, to bring peace to all, one must first discipline and control one's own mind. If a man can control his mind he can find the way to Enlightenment, and all wisdom and virtue will naturally come to him.", "Buddha"),
            new Post(777, "Relaxation", "Nothing is better than going home to family and eating good food and relaxing.", "Irina Shayk")
    ));




    @Override
    public List<Post> getAll() {
        return PostsList;
    }

    @Override
    public Optional<Post> getPostByID(long id) {
        return PostsList.stream().filter(x->x.getId()==id).findFirst();
    }


}
