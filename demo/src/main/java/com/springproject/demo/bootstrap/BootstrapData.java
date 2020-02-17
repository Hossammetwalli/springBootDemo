package com.springproject.demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springproject.demo.domain.Author;
import com.springproject.demo.domain.Book;
import com.springproject.demo.domain.Publisher;
import com.springproject.demo.repositories.AuthorRepositories;
import com.springproject.demo.repositories.BookRepositries;
import com.springproject.demo.repositories.PublisherRepositories;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepositories authorRepositries;
    private final BookRepositries bookRepositries;
    private final PublisherRepositories publisherRepositories;
  
    
    
    
    
    public BootstrapData(AuthorRepositories authorRepositries, BookRepositries bookRepositries,PublisherRepositories publisherrepositries) {
	this.authorRepositries = authorRepositries;
	this.bookRepositries = bookRepositries;
	this.publisherRepositories = publisherrepositries;
    }




    @Override
    public void run(String... args) throws Exception {
	
	
	
//	Publisher publisher = new Publisher();
//	publisher.setName("Alexei");
//	publisher.setCity("NY");
//	publisher.setState("NY");

	
	
	Author john = new Author("John", "Melis");
	Book sss = new Book("Domain", "555555");
	john.getBooks().add(sss);
	sss.getAuthor().add(john);
//	sss.setPublisher(publisher);
//	publisher.getBook().add(sss);
	
		
	authorRepositries.save(john);
	bookRepositries.save(sss);
//	publisherRepositories.save(publisher);
	
	
	
	Author Sam = new Author("Sam", "Metwalli");
	Book love = new Book("Love Sectrets", "666666");
	
	john.getBooks().add(love);
	love.getAuthor().add(Sam);
//	love.setPublisher(publisher);
//	publisher.getBook().add(love);
	
	authorRepositries.save(Sam);
	bookRepositries.save(love);
//	publisherRepositories.save(publisher);
	
	System.out.println("Start in bootstrap");
	System.out.println("number of books: " + bookRepositries.count());
	System.out.println("publisher count : " + publisherRepositories.count());
//	System.out.println("publisher book : " + publisher.getBook().size());
    }

}
