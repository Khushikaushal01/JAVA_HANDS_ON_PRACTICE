package com.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("--- Testing Constructor Injection ---");
        BookService constructorService = (BookService) context.getBean("bookServiceConstructor");
        constructorService.manageBooks();

        System.out.println("\n--- Testing Setter Injection ---");
        BookService setterService = (BookService) context.getBean("bookServiceSetter");
        setterService.manageBooks();

        context.close();
    }
}
