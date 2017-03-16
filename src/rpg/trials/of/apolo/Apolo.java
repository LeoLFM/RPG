/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.trials.of.apolo;

/**
 *
 * @author Seven
 */
public class Apolo  { 
    int hp;
   int lvl;



public int ataquekarpoi ( ) {
 int ataque= 90;

hp = hp - ataque;
  
          
  return hp;  
}    
    public int Level () {
   lvl ++;
 
   return lvl;
    }
   public int VoltaHP () {
       
       hp=100;
       return hp;
   }

}
