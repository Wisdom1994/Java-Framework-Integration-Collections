package com.frame.integration.springbootmybatis.entity;

import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer userId;
    private String userName;
    private String password;
    private String phone;
}
