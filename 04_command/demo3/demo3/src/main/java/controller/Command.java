package controller;


import io.javalin.http.Context;

public interface Command {


    public void execute(Context ctx);

}
