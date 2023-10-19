package com.glc;

import java.util.ArrayList;
import java.util.List;

public class ReadList {

    List<ReadList>read;
    String dateRead;
    int rating;

    public ReadList(){
        read=new ArrayList<>();
    }

    public ReadList(String dateRead,int rating){
        read=new ArrayList<>();
        this.dateRead=dateRead;
        this.rating=rating;
    }
    
    public int getBook(){
        if(read.size()==0){
            return read.size();
        }
        return read.size();
    }
    public void addBook(ReadList readList,Book book){
        read.add(readList);
    }
    public int numberRead(){
        return read.size();    
    }
    public int getRating(){
        return read.size();
    }
    public void DeleteBook(String title){
        read.removeAll(read);
    }
    public int  getBookByRating(int rating){
        for(int i=0; i<read.size();i++){
            if(read.get(i).equals(rating)){
                read.add(i, null);
            }
        }
        return read.size();
    }    
}
