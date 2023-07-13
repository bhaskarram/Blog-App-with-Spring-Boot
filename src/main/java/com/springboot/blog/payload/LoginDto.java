package com.springboot.blog.payload;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}
