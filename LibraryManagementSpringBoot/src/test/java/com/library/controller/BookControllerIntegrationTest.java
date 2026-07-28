package com.library.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.library.entity.Book;
import com.library.repository.BookRepository;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private BookRepository bookRepository;

    private String getBaseUrl() {
        return "http://localhost:" + port + "/api/books";
    }

    @BeforeEach
    public void setUp() {
        bookRepository.deleteAll();
        bookRepository.save(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        bookRepository.save(new Book("To Kill a Mockingbird", "Harper Lee", "9780446310789"));
        bookRepository.save(new Book("1984", "George Orwell", "9780451524935"));
    }

    @Test
    public void testGetAllBooks() {
        ResponseEntity<Book[]> response = restTemplate.getForEntity(getBaseUrl(), Book[].class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(3, response.getBody().length);
    }

    @Test
    public void testGetBookById() {
        ResponseEntity<Book[]> allResponse = restTemplate.getForEntity(getBaseUrl(), Book[].class);
        Book targetBook = allResponse.getBody()[0];
        
        ResponseEntity<Book> response = restTemplate.getForEntity(getBaseUrl() + "/" + targetBook.getId(), Book.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals("The Great Gatsby", response.getBody().getTitle());
    }

    @Test
    public void testCreateBook() {
        Book newBook = new Book("Animal Farm", "George Orwell", "9780451526342");
        ResponseEntity<Book> response = restTemplate.postForEntity(getBaseUrl(), newBook, Book.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertNotNull(response.getBody().getId());
        assertEquals("Animal Farm", response.getBody().getTitle());
    }

    @Test
    public void testUpdateBook() {
        ResponseEntity<Book[]> allResponse = restTemplate.getForEntity(getBaseUrl(), Book[].class);
        Book targetBook = allResponse.getBody()[0];

        Book updatedDetails = new Book("The Great Gatsby (Special Edition)", "F. Scott Fitzgerald", "9780743273565");
        HttpEntity<Book> entity = new HttpEntity<>(updatedDetails);
        ResponseEntity<Book> response = restTemplate.exchange(getBaseUrl() + "/" + targetBook.getId(), HttpMethod.PUT, entity, Book.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals("The Great Gatsby (Special Edition)", response.getBody().getTitle());
    }

    @Test
    public void testDeleteBook() {
        ResponseEntity<Book[]> allResponse = restTemplate.getForEntity(getBaseUrl(), Book[].class);
        Book targetBook = allResponse.getBody()[2];

        ResponseEntity<Void> response = restTemplate.exchange(getBaseUrl() + "/" + targetBook.getId(), HttpMethod.DELETE, null, Void.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());

        ResponseEntity<Book> checkResponse = restTemplate.getForEntity(getBaseUrl() + "/" + targetBook.getId(), Book.class);
        assertEquals(HttpStatus.NOT_FOUND, checkResponse.getStatusCode());
    }
}
