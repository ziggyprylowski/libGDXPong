/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

/**
 *
 * @author prylz2189
 */
public class Paddle {
    //Initalise variables
    private Rectangle player;
    private int speed;
    
    public Paddle(int x, int y, int width, int height, int speed){
        //Set variables
        this.speed = speed;
        player = new Rectangle(x, y, width, height);
        
    }
    //Move up
    public void moveUp(){
        player.y = player.y + speed;
    }
    //Move down
     public void moveDown(){
        player.y = player.y - speed;
    }
         //Return x of left side
    public float getLeft(){
        return player.x;
    }
    //Return y of bottom
    public float getBottom(){
        return player.y;
    }
    //Get y of top
    public float getTop(){
        return player.y + player.height;
    }
    //Get x of right side
    public float getRight(){
        return player.x + player.width;
    }
    public void draw(ShapeRenderer shapeBatch){
        shapeBatch.rect(player.x, player.y, player.width, player.height);
    }
}
