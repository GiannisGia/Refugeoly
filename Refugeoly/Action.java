/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_test;

/**
 *
 * @author Giorgos Giannopoulos
 */
import java.io.Serializable;
abstract class Action implements Serializable{
    
    abstract void act(Refugee refugee);
    
    protected int diceval;
    //protected int current_square;
    //protected boolean receivedExtraLife;

}
