package com.example.training202208springboot.domain.response;

import lombok.Value;

/** エラーレスポンスの内容. */
@Value
public class ErrorResponse {
  String errorCode;
  String message;
}
