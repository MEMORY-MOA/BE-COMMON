package com.moa.common.entity;

import com.moa.common.exception.NoContentException;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "title", nullable = false, length = 10) // name의 경우에는 매번 빨간 줄이 뜨지만 괜찮음
    private String title;

    @Column(name = "content", length = 200)
    private String content;

    @Builder
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void changeTitle(String title) {
        if (title != null) this.title = title;
        else throw new NoContentException("제목");
    }
}
