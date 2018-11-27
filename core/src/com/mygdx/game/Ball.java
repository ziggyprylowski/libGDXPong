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
public class Ball {
    private Rectangle shape;
    private int speed;
    private int dx;
    private int dy;
    public Ball(int x, int y, int width, int height, int speed){
        this.speed = speed;
        shape = new Rectangle(x, y, width, height);
        this.dx = 1;
        this.dy = 1;
        
    }
    public void move(){
        shape.x = shape.x + speed*dx;
        shape.y = shape.y + speed*dy;
    }
    //Flip x value
    public void bounceX(){
        dx = dx * -1;
    }
    //Flip y value
    public void bounceY(){
        dy = dy * -1;
    }
    //Return x of left side
    public float getLeft(){
        return shape.x;
    }
    //Return y of bottom
    public float getBottom(){
        return shape.y;
    }
    //Get y of top
    public float getTop(){
        return shape.y + shape.height;
    }
    //Get x of right side
    public float getRight(){
        return shape.x + shape.width;
    }
        public void draw(ShapeRenderer shapeBatch){
        shapeBatch.rect(shape.x, shape.y, shape.width, shape.height);
    }
}
