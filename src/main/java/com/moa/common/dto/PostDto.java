package com.moa.common.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PostDto {
    private Long id;
    private String title;
    private String content;

    @Builder
    public PostDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
