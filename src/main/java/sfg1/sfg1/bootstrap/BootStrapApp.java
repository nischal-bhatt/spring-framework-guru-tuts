package sfg1.sfg1.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import sfg1.sfg1.domain.Author;
import sfg1.sfg1.domain.Book;
import sfg1.sfg1.domain.Publisher;
import sfg1.sfg1.repositories.AuthorRepository;
import sfg1.sfg1.repositories.BookRepository;
import sfg1.sfg1.repositories.PublisherRepository;

@Component
public class BootStrapApp implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
	
	public BootStrapApp(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Publisher publisher = new Publisher();
		publisher.setName("SFG");
		publisher.setCity("ST PETERSBERG");
		publisher.setState("FL");
		
		publisherRepository.save(publisher);
		
		Author eric = new Author("eric","evans");
		Book ddd = new Book("domain driven design","123123");
		
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		ddd.setPublisher(publisher);
		publisher.getBooks().add(ddd);
		
		authorRepository.save(eric);
		bookRepository.save(ddd);
		publisherRepository.save(publisher);
		
		Author rod = new Author("Rod","Johnson");
		
		Book noEJB = new Book("J2EE","3939");
		
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		noEJB.setPublisher(publisher);
		publisher.getBooks().add(noEJB);
		
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		publisherRepository.save(publisher);
		

		System.out.println("number of books " + bookRepository.count());
	}

}
