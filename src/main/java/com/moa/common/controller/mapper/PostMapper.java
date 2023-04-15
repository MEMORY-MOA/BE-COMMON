package com.moa.common.controller.mapper;

import com.moa.common.dto.PostDto;
import com.moa.common.entity.Post;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PostMapper {
    PostDto toDto(Post post);
    Post toEntity(PostDto postDto);
}
