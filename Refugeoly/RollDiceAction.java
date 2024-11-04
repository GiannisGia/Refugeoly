/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_test;

/**
 *
 * @author Giorgos Giannopoulos
 */

import java.util.Random;

public class RollDiceAction extends Action{
    private boolean checkMove = true;
    /**
     * if player exceeds square 39 return false otherwise return true
     */
    public boolean isLegal(){
        return checkMove;
    }

    public void setCheckMove(boolean checkMove){
        this.checkMove = checkMove;
    }

    @Override
    void act(Refugee refugee){
        Random random = new Random();
        int diceValue = random.nextInt(6) + 1;
        diceval = diceValue;
        System.out.println("Player " + refugee.getName() + 
                    " rolled a dice and got: " + 
                    diceval);
        System.out.println(refugee.getCurrentSquare() + diceval);
        if(refugee.getCurrentSquare() + diceval <= 39){
            refugee.setCurrentSquare(refugee.getCurrentSquare() + diceval);
            /*System.out.println("Player " + refugee.getName() + 
                    " rolled a dice and got: " + 
                    diceval);
            */
            setCheckMove(true);
        }
        else{
            System.out.println("Player passed square 39, he stays in his current square");
            //refugee.setCurrentSquare(refugee.getCurrentSquare());
            setCheckMove(false);
            
        }
        
        //System.out.println("Dice value " + diceval);
    }
}
