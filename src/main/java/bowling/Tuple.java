/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

/**
 *
 * @author pedago
 */
public class Tuple<Integer> { 
  public int x; 
  public int y; 
  public Tuple(int x, int y) { 
    this.x = x; 
    this.y = y; 
  } 
  public void changeX(int x){
      this.x = x;
  }
    public void changeY(int y){
      this.y = y;
  }
} 
