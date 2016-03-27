/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servWeb.app;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.javalite.activejdbc.Base;
import static org.javalite.activejdbc.Model.attributes;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import static spark.Spark.get;
import static spark.Spark.before;
import static spark.Spark.after;
import static spark.Spark.halt;
import static spark.Spark.post;
import spark.template.mustache.MustacheTemplateEngine;
/**
 *
 * @author santiago
 */
public class CapaWeb {
       
    public CapaWeb(){
            //Declaro variables de la base de datos
                String driver = "com.mysql.jdbc.Driver";
                String jdbs = "jdbc:mysql://localhost/servWeb";
                String usubd = "root";
                String contrbd = "100991";
                
        
                
                before((request,response) -> {
                    if(!Base.hasConnection()){
                        Base.open(driver,jdbs,usubd,contrbd);
                    }});
                after((request,response) -> {
                    if(!Base.hasConnection()){
                        Base.close();
                    }});
    
        
    get("/", (  Request request, Response response) -> {
                Map<String, Object> attributes = new HashMap<>();
                List <Dato> datos = Dato.findAll();
                Board tablero =new Board();
                String tabla = tablero.toStringB(datos.size());
                attributes.put("tabla",tabla);
               return new ModelAndView(attributes, "webApp/index.mustache");
            }, new MustacheTemplateEngine());
    
    post("/registrar", (request, response) -> {
                Map<String, Object> attributes = new HashMap<>();
                String nombre = request.queryParams("nombre");
                String apellido = request.queryParams("apellido");
                String mail = request.queryParams("mail");
                
                boolean a = registrar(nombre,apellido,mail);
                if (a){
                    List <Dato> datos = Dato.findAll();
                    attributes.put("datos",datos);
                    return new ModelAndView(attributes, "webApp/index.mustache"); 
                }else{
                    halt(401, "USUARIO YA REGISTRADO");
                    return new ModelAndView(null, "webApp/index.mustache");
                }
            }, new MustacheTemplateEngine());
        
    }
    
    
    public static boolean registrar(String nombre,String apellido,String mail){
            List<User> usuario = User.where("mail=?",mail);
             if (usuario.isEmpty()){
                  UserChecks.newUser(apellido,nombre,mail);
                  System.out.println("Registrando paso 1");
                  return true;
             }else{
                 return false;
             }
    }
    
    }
       
    
