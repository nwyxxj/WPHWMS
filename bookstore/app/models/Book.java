package models;

import java.util.*;
import javax.persistence.*;
import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import static play.data.validation.Constraints.*;
import javax.validation.*;
import com.avaje.ebean.*;

@Entity
public class Book extends Model{
  @Id 
  private String id;

  private String title;

  @ManyToOne
 // @JoinColumn(name = "user_Id", referencedColumnName = "user_Id", insertable = false, updatable = false)
  private Student student;

  @Constraints.Min(0)
  private int credit;

  private static List<Book> books = new ArrayList<Book>();

  public static Finder<String, Book> find = 
      new Finder<String, Book>(String.class, Book.class);

  public Book(String id, String title, int credit){
    this.id = id;
    this.title = title; 
    this.credit = credit;
  }

  public String getId(){
    return id;
  }

  public String getTitle(){
    return title;
  }

  public int getCredit(){
    return credit;
  }

  public void setId(String id){
    this.id = id;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public void setCredit(int credit){
    this.credit = credit;
  }

  public void deleteBook(String id){
    for(Book x : books){
      if(x.getId().equals(id)){
        books.remove(x);
      }
    }
  }
}