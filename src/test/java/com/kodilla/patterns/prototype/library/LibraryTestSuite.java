package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static java.time.LocalDate.now;

public class LibraryTestSuite {
    @Test
    public void  testGetBooks(){

        Library library = new Library("City Hall Library");
        library.books.add(new Book("AA","BB", LocalDate.now().minusDays(10)));
        library.books.add(new Book("AB","BA", LocalDate.now().minusDays(9)));
        library.books.add(new Book("BB","AA", LocalDate.now().minusDays(8)));
        library.books.add(new Book("BA","AB", LocalDate.now().minusDays(7)));
        Book addedBook = new Book("BB","BB", LocalDate.now().minusDays(7));
        library.books.add(addedBook);

        System.out.println(library.getBooks());
        //System.out.println(library.getName());

        Library clonedLibrary=null;

        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Another City Hall Library");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepCloned = null;
        try {
            deepCloned = library.deepCopy();
            deepCloned.setName("Yet Another City Hall Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(addedBook);
        System.out.println(clonedLibrary.getBooks());
        Assert.assertEquals(4,clonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(),clonedLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(),deepCloned.getBooks());






    }
}
