package com.samdevit.efittingku.api;

public class Post {

    private String id , title , image1 , image2;

    public Post(String id, String title, String image1, String image2) {
        this.id = id;
        this.title = title;
        this.image1 = image1;
        this.image1 = image2;
    }

    public String getUserId() {
        return id;
    }

    public String getId() {
        return title;
    }

    public String getTitle() {
        return image1;
    }

    public String getBody() {
        return image2;
    }
}
