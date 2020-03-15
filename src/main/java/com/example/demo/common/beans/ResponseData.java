package com.example.demo.common.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseData<T> {
	private String status;
	private String message;
	private T data;
}