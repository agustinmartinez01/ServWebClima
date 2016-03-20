package com.servWeb.app;



import static spark.Spark.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agustin
 */
public class App {
    public static void main( String[] args )
    {
        port(9090);
        externalStaticFileLocation("./webApp/imagenes");
        CapaWeb a = new CapaWeb();
    }
}
