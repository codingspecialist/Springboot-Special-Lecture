package com.cos.person.domain;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class UpdateReqDto {
	@NotBlank(message = "password를 입력하지 않았습니다.")
	private String password;
	private String phone;
}
