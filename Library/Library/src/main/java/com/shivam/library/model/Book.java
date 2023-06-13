package com.shivam.library.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Book {
    @Id
    private long bookId;
    private String bookName;
    private double plagPer;
    private long authorId;
    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name= "authorId", insertable = false, updatable = false, referencedColumnName = "authorId")
    @JsonBackReference(value="book_ref")
    private Author author;
    private long managerId;
    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name= "managerId", insertable = false, updatable = false, referencedColumnName = "managerId")
    @JsonBackReference(value="man_ref")
    private Management management;
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPlagPer() {
		return plagPer;
	}
	public void setPlagPer(double plagPer) {
		this.plagPer = plagPer;
	}
	public long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public long getManagerId() {
		return managerId;
	}
	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}
	public Management getManagement() {
		return management;
	}
	public void setManagement(Management management) {
		this.management = management;
	}
    
    
}