package com.moa.common.exception;

public class NoContentException extends RuntimeException{
    public NoContentException(String message) {
        super(message + "가(이) 없습니다.");
    }
}
