package com.moa.common.service;

import com.moa.common.controller.mapper.PostMapper;
import com.moa.common.dto.PostDto;
import com.moa.common.entity.Post;
import com.moa.common.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 이름 규칙 : Create / Read / Update / Delete
*/
@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor // @Autowired 필드인젝션으로 주입 + 생성자 사용 -> 변수를 바꾸거나 테스트코드의 작성이 어려워 스프링 4.3부터는 권장하지 않는다고 한다.)
public class PostService {

    private final PostRepository postRepository;
    private final PostMapper postMapper;

    /* 게시글 생성 */
    @Transactional
    public PostDto createPost(PostDto postDto) {
        return postMapper.toDto(
                postRepository.save(
                        Post.builder()
                                .title(postDto.getTitle())
                                .content(postDto.getContent())
                                .build()
                )
        );
    }
}
