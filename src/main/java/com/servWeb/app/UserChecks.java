/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servWeb.app;

import java.util.List;

/**
 *
 * @author agustin
 */
class UserChecks {
    public static void newUser(String apellido,String nombre,String mail){
        System.out.println("Registrando paso 2");
        User u = new User();
        u.set("apellido",apellido);
        u.set("nombre",nombre);
        u.set("mail",mail);
        u.save();
        System.out.println("Registrando paso 3");   
    }
}
