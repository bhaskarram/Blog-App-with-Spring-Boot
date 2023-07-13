package com.springboot.blog.payload;

import jdk.jfr.Timespan;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JWTAuthResponse {
    private String accessToken;
    private String tokenType="Bearer";
}
