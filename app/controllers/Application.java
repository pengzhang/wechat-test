package controllers;

import com.google.gson.Gson;

import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
    	render();
    }
    
    public static void wx() {
    	System.out.println(new Gson().toJson(params.data));
    	MyWechat myWechat = new MyWechat(request,params.data);
    	String result = myWechat.execute();
    	renderText(result);
    }

}