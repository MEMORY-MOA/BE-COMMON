package com.moa.common.controller;

import com.moa.common.controller.mapper.PostDtoMapper;
import com.moa.common.controller.request.PostRequest;
import com.moa.common.controller.response.PostResponse;
import com.moa.common.dto.PostDto;
import com.moa.common.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    private final PostDtoMapper postDtoMapper;

    /**
     * 글작성
     * @param postRequest
     * @return id, title, content
     */
    @GetMapping
    public PostResponse createPost(@RequestBody @Valid PostRequest postRequest) {
        PostDto postDto = postService.createPost(postDtoMapper.fromRequest(postRequest));
        return postDtoMapper.toResponse(postDto);
    }
}
