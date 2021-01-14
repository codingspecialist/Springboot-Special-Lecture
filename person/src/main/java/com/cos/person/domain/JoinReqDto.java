package com.cos.person.domain;

import lombok.Data;

@Data
public class JoinReqDto {
	private String username;
	private String password;
	private String phone;
}
