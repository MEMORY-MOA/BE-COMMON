package com.moa.common.controller.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostRequest {
    @NotBlank // ""도 불가능하게 하기 위함
    private String title;
    private String content;
}
