package nl.leerlijnmeetkunde.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    @Column(length = 100000)
    private String content;
    private LocalDateTime date;

    protected Post() {}

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.date = LocalDateTime.now();
    }
}
