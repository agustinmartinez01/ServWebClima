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
public class BoardTools {
  /*
    Esta clase provee métodos para realizar todas las comprobaciones respecto al tablero de juego
    */

    
    /**isEmpty
 * 
 * @param board matriz sobre la cual se quiere razonar
 * @param row posicion y del punto referencia
 * @param column posicion x del punto referencia
 * @return devuelve true la posicion es 0
 */      
    
    
    
public static Boolean isEmpty(Board board,int row,int column){
    return board.getCell(row, column)=="";
}
}