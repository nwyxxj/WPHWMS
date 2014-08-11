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
public class Student extends Model {

  @Id
  private String userId;

  private String password;

  private String name;

  private String contact;

  @Constraints.Min(0)
  private int creditBalance;

  @OneToMany(mappedBy= "student")
  List<Book> books = new ArrayList<Book>();

  public static Finder<String, Student> find = 
    new Finder<String, Student>(String.class, Student.class);

  public Student(String userId, String password, String name, String contact, int creditBalance) {
    this.userId = userId;
    this.password = password;
    this.name = name;
    this.contact = contact;
    this.creditBalance = creditBalance;
  }
  
  public String getUserId(){
    return userId;
  }  

  public String getPassword(){
    return password;
  }

  public String getName(){
    return name;
  }

  public String getContact(){
    return contact;
  }

  public int getBalance(){
    return creditBalance;
  }

  public void setUserId(String userId){
    this.userId=userId;
  }

  public void setPassword(String password){
    this.password=password;
  }

  public void setName(String name){
    this.name=name;
  }

  public void setContact(String contact){
    this.contact=contact;
  }

  public void setBalance(int creditBalance){
    this.creditBalance=creditBalance;
  }

  public void addCredit(int credit){
    creditBalance += credit;
  }

  public void deductCredit(int credit){
    creditBalance -= credit;
  }
}
