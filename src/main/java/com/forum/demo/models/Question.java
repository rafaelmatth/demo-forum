package com.forum.demo.models;

import com.forum.demo.models.enums.StatusQuestionEnum;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Question {

    private Long id;
    private String title;
    private String message;
    private LocalDateTime creationDate = LocalDateTime.now();
    private StatusQuestionEnum status = StatusQuestionEnum.NOT_ANSWERED;
    private User author;
    private Course course;
    private List<Answer> answers = new ArrayList<>();

    public Question(String title, String message, Course course){
        this.title = title;
        this.message = message;
        this.course = course;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Question other = (Question) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime creationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public StatusQuestionEnum getStatus() {
        return status;
    }

    public void setStatus(StatusQuestionEnum status) {
        this.status = status;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

}
