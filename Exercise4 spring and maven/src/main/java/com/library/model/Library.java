package com.library.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Library {

    private List<String> books;
    private Set<String> authors;
    private Map<String, String> departments;
    private Properties libraryInfo;

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public void setAuthors(Set<String> authors) {
        this.authors = authors;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public void setLibraryInfo(Properties libraryInfo) {
        this.libraryInfo = libraryInfo;
    }

    public void display() {

        System.out.println("Books:");
        books.forEach(System.out::println);

        System.out.println("\nAuthors:");
        authors.forEach(System.out::println);

        System.out.println("\nDepartments:");
        departments.forEach((k, v) ->
                System.out.println(k + " : " + v));

        System.out.println("\nLibrary Info:");
        libraryInfo.forEach((k, v) ->
                System.out.println(k + " = " + v));
    }
}