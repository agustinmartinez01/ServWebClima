/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servWeb.app;

import org.javalite.activejdbc.Model;
 

public class Dato extends Model {
    static {
    validatePresenceOf("time");
  }
   
   @Override
   public String toString (){
    return this.getString("temp");
}   
   public String toStringh(){
           return this.getString("hum");
}

}


