package miu.edu.lab3Post.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Post {
    long id;
    String title;
    String content;
    String author;

}
