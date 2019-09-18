/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_review;

/**
 *
 * @author tjell
 */
public class Fan {
    //----Variables----\\
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;
    
    public Fan()
    {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString()
    {
        if (on)
        {
            return "Fan is on. \nFan speed: " + speed + "\nFan color: " + color
                    + "\nFan radius: " + radius;
        }
        else
            return "Fan is off. \nFan color: " + color
                    + "\nFan radius: " + radius;
    }
}
