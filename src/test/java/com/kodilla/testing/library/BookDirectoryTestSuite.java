package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    private List<Book> generateListOfBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testInHandsOfNoBooks(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user1 = new LibraryUser("John", "Krasinski", "1234");
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(listOfBooks);

        //When
        List<Book> noBooksInHand = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(listOfBooks.size(), noBooksInHand.size());
    }

    @Test
    public void testInHandsOfOneBook(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user2 = new LibraryUser("Jenna", "Fischer", "1243");
        List<Book> listOfBooks = new ArrayList<Book>();
        Book book1 = new Book("XSD", "sda", 1989);
        when(libraryDatabaseMock.listBooksInHandsOf(user2)).thenReturn(listOfBooks);

        //When
        List<Book> oneBookInHand = bookLibrary.listBooksInHandsOf(user2);

        //Then
        assertEquals(listOfBooks.size(), oneBookInHand.size());
    }

    @Test
    public void testInHandsOf5Books(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user3 = new LibraryUser("Rian", "Wilson", "3124");
        List<Book> listOfBooks = generateListOfBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(user3)).thenReturn(listOfBooks);

        //When
        List<Book> fiveBooksInHand = bookLibrary.listBooksInHandsOf(user3);

        //Then
        assertEquals(listOfBooks.size(), fiveBooksInHand.size());
    }
}
