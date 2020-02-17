package com.springproject.demo.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String addressLine1;
    private String city;
    private String state;
    private String zip;
    
    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book> book = new HashSet<>();


    public Publisher() {
    }


    public Publisher(long id, String name, String addressLine1, String city, String state, String zip, Set<Book> book) {
	this.id = id;
	this.name = name;
	this.addressLine1 = addressLine1;
	this.city = city;
	this.state = state;
	this.zip = zip;
	this.book = book;
    }


    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getAddressLine1() {
        return addressLine1;
    }


    public String getCity() {
        return city;
    }


    public String getState() {
        return state;
    }


    public String getZip() {
        return zip;
    }


    public Set<Book> getBook() {
        return book;
    }


    public void setId(long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public void setState(String state) {
        this.state = state;
    }


    public void setZip(String zip) {
        this.zip = zip;
    }


    public void setBook(Set<Book> book) {
        this.book = book;
    }


    @Override
    public String toString() {
	return "Publisher [id=" + id + ", name=" + name + ", addressLine1=" + addressLine1 + ", city=" + city
		+ ", state=" + state + ", zip=" + zip +  "]";
    }


    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((addressLine1 == null) ? 0 : addressLine1.hashCode());
	result = prime * result + ((book == null) ? 0 : book.hashCode());
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((state == null) ? 0 : state.hashCode());
	result = prime * result + ((zip == null) ? 0 : zip.hashCode());
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
	Publisher other = (Publisher) obj;
	if (addressLine1 == null) {
	    if (other.addressLine1 != null)
		return false;
	} else if (!addressLine1.equals(other.addressLine1))
	    return false;
	if (book == null) {
	    if (other.book != null)
		return false;
	} else if (!book.equals(other.book))
	    return false;
	if (city == null) {
	    if (other.city != null)
		return false;
	} else if (!city.equals(other.city))
	    return false;
	if (id != other.id)
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	if (state == null) {
	    if (other.state != null)
		return false;
	} else if (!state.equals(other.state))
	    return false;
	if (zip == null) {
	    if (other.zip != null)
		return false;
	} else if (!zip.equals(other.zip))
	    return false;
	return true;
    }


    
   
    
    
}
