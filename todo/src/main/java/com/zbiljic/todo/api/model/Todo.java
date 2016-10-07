package com.zbiljic.todo.api.model;

import java.io.Serializable;
import java.util.Objects;

public class Todo implements Serializable, Cloneable {

  private int id;

  private String title;

  private String content;

  private boolean completed;

  public Todo() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Todo withId(int id) {
    setId(id);
    return this;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Todo withTitle(String title) {
    setTitle(title);
    return this;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Todo withContent(String content) {
    setContent(content);
    return this;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  public Todo withCompleted(boolean completed) {
    setCompleted(completed);
    return this;
  }

  @Override
  public String toString() {
    return "Todo{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", content='" + content + '\'' +
        ", completed=" + completed +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Todo todo = (Todo) o;
    return id == todo.id &&
        completed == todo.completed &&
        Objects.equals(title, todo.title) &&
        Objects.equals(content, todo.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, content, completed);
  }

  @Override
  public Todo clone() {
    try {
      return (Todo) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new IllegalStateException(
          "Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
    }
  }
}
