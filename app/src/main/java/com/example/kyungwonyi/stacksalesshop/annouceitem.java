package com.example.kyungwonyi.stacksalesshop;

public class annouceitem {

    String title;
    String content;


    public annouceitem(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "annouceitem{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
