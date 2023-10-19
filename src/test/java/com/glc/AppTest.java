package com.glc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest 
{
    //Test case 1: Given that I visit the site, when I first start, I expect my list to be empty.

    @Test
    public void EmptyList()
    {
        //setup
        int list=0;
        //execute
        ReadList read =  new ReadList();
        int result = read.getBook();
        //assert
        assertEquals(list, result);
    }

    // Test Case 2: Given that I have an empty list, when I add the first book to my list,
    // ten I expect numberRead to return 1.

    @Test
    public void FirstBook()
    {
        //setup
        int list=1;
        //execute
        Book book1=new Book("The Hobbit by J.R.R", "Tolkein", 320, 1937);
        ReadList read=new ReadList("May 22, 1992",5);
        read.addBook(read,book1);   
        int result=read.numberRead();
        //assert
        assertEquals(list, result);    
    }

    //Test Case 3: Given that I have an empty list, when I add additional books to the list,
    // I expect the numberRead to return the total number of books in my list.

    @Test
    public void AddingBook(){
        //setup
        int list=2;
        //execute
        //adding book1 
        Book book1=new Book("The Hobbit by J.R.R", "Tolkein", 320, 1937);
        ReadList read=new ReadList("January 1, 2020",5);
        read.addBook(read,book1);
        //adding book 2
        Book book2=new Book("Alices Adventures in Wonderland", "Lewis Carroll", 544 , 1865);     
        ReadList read1=new ReadList("May 22, 1992",5); 
        read.addBook(read1,book2);   
        int result=read.numberRead();
        //assert
        assertEquals(list, result);  
    }

    // Test Case 4: Given that I have a book in my list, when I call removeBook("<title>") with 
    //"title" representing the title of my book that I want to delete, 
    //then when I call getBooks() the book I deleted should no longer be there.

    @Test
    public void RemoveBook(){
        //Setup
        int list=0;
        //Execute
        Book book1=new Book("The Hobbit by J.R.R", "Tolkein", 320, 1937);
        ReadList read=new ReadList("January 1, 2020",5);
        read.addBook(read,book1);
        read.DeleteBook("The Hobbit by J.R.R");
        int result=read.getBook();
        //Assert
        assertEquals(list, result);   
    }

    // Test Case 5: Given that I have an empty list, 
    // when I add a new book I expect getBooks() to return a list of books that includes the book I added.

    @Test
    public void ReturnBooks(){
        //setup
        int list=1;
        //Execute
        Book book1=new Book("The Hobbit by J.R.R", "Tolkein", 320, 1937);
        ReadList read=new ReadList("May 22, 1992",5);
        read.addBook(read,book1);
        int result = read.getBook();
        //Assert
        assertEquals(list, result);
    }

    //Test Case 6: Given when I call getBooksByRating(), 
    //I should return a list of books that all have that rating.

    @Test
    public void BookByRating(){
        //Setup
        int list=2;
        //Execute
        Book book1=new Book("The Hobbit by J.R.R", "Tolkein", 320, 1937);
        ReadList read=new ReadList("May 22, 1992",4);
        Book book2=new Book("The Hobbit by J.R.R", "Tolkein", 320, 1937);
        ReadList read2=new ReadList("May 22, 1992",5);
        read.addBook(read,book1);
        read.addBook(read2,book2);
        int result = read.getBookByRating(5);
        //Assert
        assertEquals(list, result);
    }


    
    




    



}
