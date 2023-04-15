package com.moa.common.controller.mapper;

import com.moa.common.controller.request.PostRequest;
import com.moa.common.controller.response.PostResponse;
import com.moa.common.dto.PostDto;
import com.moa.common.entity.Post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostDtoMapper {
    PostDto fromRequest(PostRequest postDto);
    PostResponse toResponse(PostDto postDto);
}
