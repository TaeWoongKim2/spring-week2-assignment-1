package com.codesoom.assignment.models;

/**
 * id와 할 일을 저장하는 클래스
 *
 * @author developerOlive
 * @version 1.0.0 21/01/30
 */

public class Task {
    private Long id;
    private  String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "Task - title : " + title;
    }

}
