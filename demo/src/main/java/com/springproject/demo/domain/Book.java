package com.springproject.demo.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String tittle;
    private String isbn;
    
    @ManyToOne
    private Publisher publisher;
    
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> author = new HashSet<>();
    
   

    public Book() {
    }

    public Book(String tittle, String isbn) {
	this.tittle = tittle;
	this.isbn = isbn;
	
    }
    
    
    

   

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getTittle() {
	return tittle;
    }

    public String getIsbn() {
	return isbn;
    }

    public Set<Author> getAuthor() {
	return author;
    }

    public void setTittle(String tittle) {
	this.tittle = tittle;
    }

    public void setIsbn(String isbn) {
	this.isbn = isbn;
    }

    public void setAuthor(Set<Author> author) {
	this.author = author;
    }

    
    
    
    
  

    @Override
    public String toString() {
	return "Book [id=" + id + ", tittle=" + tittle + ", isbn=" + isbn + ", publisher=" + publisher + ", author="
		+ author + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
	result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
	result = prime * result + ((tittle == null) ? 0 : tittle.hashCode());
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
	Book other = (Book) obj;
	if (author == null) {
	    if (other.author != null)
		return false;
	} else if (!author.equals(other.author))
	    return false;
	if (id != other.id)
	    return false;
	if (isbn == null) {
	    if (other.isbn != null)
		return false;
	} else if (!isbn.equals(other.isbn))
	    return false;
	if (publisher == null) {
	    if (other.publisher != null)
		return false;
	} else if (!publisher.equals(other.publisher))
	    return false;
	if (tittle == null) {
	    if (other.tittle != null)
		return false;
	} else if (!tittle.equals(other.tittle))
	    return false;
	return true;
    }

    

}
