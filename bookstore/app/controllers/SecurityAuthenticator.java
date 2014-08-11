package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;

public class SecurityAuthenticator extends Security.Authenticator {

  @Override
  public String getUsername(Context ctx){
    return ctx.session().get("user");
  }

  @Override
  public Result onUnauthorized(Context ctx){
    return redirect(routes.StudentManager.login());
  }
}