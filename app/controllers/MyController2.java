package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Result;
import po.WmTest;
import service.WmTestService;

import java.util.HashMap;
import java.util.Map;

import static play.mvc.Results.ok;

/**
 * Created by keel47 on 2015/9/5.
 */
public class MyController2 {
    
    private static Gson gson = new Gson();

    @Transactional
    public static Result index() {

        WmTestService service = new WmTestService();

        String json = gson.toJson(service.getById(2));

        return ok(json);
    }

    public static Result index2() {

        System.out.println("do the MyController2 index2");

        ObjectNode result = Json.newObject();

        result.put("exampleField1", "foobar");
        result.put("exampleField2", "Hello world!");

        Map<String,String> map= new HashMap<String,String>();
        map.put("name","wangmeng");
        map.put("age","35");

        String jsonString = gson.toJson(map);

        return ok(jsonString);
    }

}
