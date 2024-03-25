package com.r2s.javabackend09.dto.request;

import lombok.Data;

@Data
public class AuthRequest {
	private String username;
	private String password;
}
