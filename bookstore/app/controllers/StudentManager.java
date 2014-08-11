package controllers;

import play.*;
import play.mvc.*;
import static play.mvc.Results.*;
import play.data.*;
import play.libs.*;
import com.avaje.ebean.*;
import play.db.ebean.*;
import models.*;
import play.data.validation.*;
import static play.data.validation.Constraints.*;
import javax.validation.*;
import views.html.*;
import java.util.*;
import play.cache.*;

public class StudentManager extends Controller {

  @Security.Authenticated(SecurityAuthenticator.class)
  public static Result index() {

   return ok(index.render(Book.find.all()));
  }  

  public static Result login(){
    return ok(login.render());
  }

  public static Result authenticate(){
    DynamicForm filledForm = Form.form().bindFromRequest();
    String user = filledForm.get("user");
    String password = filledForm.get("password");
    Student student = Student.find.byId(user);
    if(student!=null){
      if(student.getPassword().equals(password)){
        session().clear();
        session("user",user);
        return ok(index.render(Book.find.all()));
      }else{
        flash("error","Incorrect password");
        return redirect( "/" );
      }
    }else{
      flash("error", "Incorrect userId");
      return redirect( "/" );
    }
  }

  public static Result logout(){
    session().clear();
    return ok(login.render());
  }
}