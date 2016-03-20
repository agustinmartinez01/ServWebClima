/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servWeb.app;


import org.javalite.activejdbc.Model;
 
/**
 *
 * @author agustin
 */
public class User extends Model  {
    static {
    validatePresenceOf("apellido");
  }
   @Override
   public String toString (){
    return this.getString("mail");
} 
}
