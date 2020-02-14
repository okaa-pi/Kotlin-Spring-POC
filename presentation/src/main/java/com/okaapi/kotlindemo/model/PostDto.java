package com.okaapi.kotlindemo.model;

public class PostDto {

    private String title;

    private String content;

    public PostDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
