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
import models.*;

public class RentalManager extends Controller {
  public static Result index(){
    return ok(index.render(Book.find.all()));
  }

  public static Result borrow(){
    DynamicForm filledForm = Form.form().bindFromRequest();
    String id = filledForm.get("id");
    String title = filledForm.get("title");
    String credit = filledForm.get("credit");
    int credInt = Integer.parseInt(credit);
    String user = session().get("user");
    Student student = Student.find.byId(user);
    if(student.getBalance() > credInt){
      student.deductCredit(credInt);
      student.save();
      return ok("borrowed successfully");
    }else{
      flash("error", "insufficient credits");
      return redirect( "/" );
    }


  }
}