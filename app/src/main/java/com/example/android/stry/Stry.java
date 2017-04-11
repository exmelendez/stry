package com.example.android.stry;

public class Stry {

    private String title, idea_desc, content;


    //Constructor
    public Stry(String title, String idea_desc, String content) {
        this.title = title;
        this.idea_desc = idea_desc;
        this.content = content;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public String getIdea_desc() {
        return idea_desc;
    }

    public String getContent() {
        return content;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setIdea_desc(String idea_desc) {
        this.idea_desc = idea_desc;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
