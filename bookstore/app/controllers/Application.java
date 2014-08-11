package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import java.util.*;
import views.html.*;
import java.text.*;
import models.*;

public class Application extends Controller {

  @Security.Authenticated(SecurityAuthenticator.class)
  public static Result index() {

    return ok(index.render(Book.find.all()));
  }  

  @Security.Authenticated(SecurityAuthenticator.class)
  public static Result create(){
    return ok(create.render());
  }

  public static Result newBook(){
    DynamicForm filledForm = Form.form().bindFromRequest();
    String id = filledForm.get("id");
    String title = filledForm.get("title");
    int credit = Integer.parseInt(filledForm.get("credit"));
    Book b = new Book(id,title,credit);
   // Book.addBook(b); 
    b.save(); // automatically add in an entry to database 
    return ok(index.render(Book.find.all()));
  }

  @Security.Authenticated(SecurityAuthenticator.class)
  public static Result editList(){
    return ok(edit_list.render(Book.find.all()));
  }

  @Security.Authenticated(SecurityAuthenticator.class)
  public static Result edit(){
    DynamicForm filledForm = Form.form().bindFromRequest();
    String id = filledForm.get("id");
    String title = filledForm.get("title");
    String credit = filledForm.get("credit");
    return ok(edit.render(id, title, credit));
  }

  public static Result update(){
    DynamicForm filledForm = Form.form().bindFromRequest();
    String id = filledForm.get("id");
    String title = filledForm.get("title");
    int credit = Integer.parseInt(filledForm.get("credit"));
    Book b = Book.find.byId(id);
    b.setTitle(title);
    b.setCredit(credit);
   // Book.addBook(b); 
    b.save(); // automatically add in an entry to database 
    return ok(index.render(Book.find.all()));
  }

  @Security.Authenticated(SecurityAuthenticator.class)
  public static Result deleteBook(){
    return ok(delete_list.render(Book.find.all()));
  }

  public static Result removeNow(){
    DynamicForm filledForm = Form.form().bindFromRequest();
    String id = filledForm.get("id");
    String title = filledForm.get("title");
    int credit = Integer.parseInt(filledForm.get("credit"));
    Book b = Book.find.byId(id);
   b.delete();
   // Book.addBook(b); 
    //b.save(); // automatically add in an entry to database 
    return ok(index.render(Book.find.all()));
  }

}
