package com.springboot.blog.payload;

import com.springboot.blog.entity.Comment;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class PostDto {
    private Long id;
    @NotEmpty
    @Size(min =2,message = "Post title should have at least 2 ")
    private String title;

    @NotEmpty
    @Size(min=10, message = "Post description should have atleast 10 characters")
    private String description;

    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}
