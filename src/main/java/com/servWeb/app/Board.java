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
class Board {
    private  String [][]matrix;
    
    public Board(){
        List <Dato> datos = Dato.findAll();
        int columns = 5;
        int rows = datos.size();
        matrix=new String[rows][columns];
        
        for(int i=0;i<rows;i++){
             matrix[i][1]= datos.get(i).getString("id") ;
             matrix[i][2]= datos.get(i).getString("temp");
             matrix[i][3]= datos.get(i).getString("hum");
             matrix[i][4]= datos.get(i).getString("fecha");
             
            }
        }
    
    public String getCell(int row,int column){
        return matrix[row][column];
    }
    
      public String toStringB(int fila){ 
        String tabla="";
        for(int i=fila-1;i>=0;i--){
            tabla=tabla +"<div style=\"text-align:center;\">\n" +
"	<table border=\"1\" style=\"margin: 0 auto;\"><tr>\n" +		
                "<td>"+getCell(i,1)+"</td>\n" +
                "<td>"+getCell(i,2)+"</td>\n" +
                "<td>"+getCell(i,3)+"</td>\n" +
                "<td>"+getCell(i,4)+"</td>\n" +
                

                "</tr>\n"+
                
                "</tr>\n</table></div>"		
                ;
            }
        
                   
            return tabla;
      }
       

    
}
