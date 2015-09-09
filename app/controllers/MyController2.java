package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import po.WmTest;
import service.WmTestService;

import java.util.HashMap;
import java.util.Map;

import static play.mvc.Results.ok;

/**
 * Created by keel47 on 2015/9/5.
 */
public class MyController2 extends Controller {
    
    private static Gson gson = new Gson();

    @Transactional
    public static Result index() {

        WmTestService service = new WmTestService();

        String json = gson.toJson(service.getById(2));

        return ok(json);
    }


    @Transactional
    public static Result index2() {

        System.out.println("do the MyController2 index2");

        WmTestService service = new WmTestService();

        String json = gson.toJson(service.getById(1));

        return ok(json);
    }

}
