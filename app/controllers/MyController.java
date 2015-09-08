package controllers;

import play.*;
import play.mvc.*;

public class MyController extends Controller {

    public static Result index() {
        return ok("It works!");
    }

}