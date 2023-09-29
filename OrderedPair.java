/*
Problem Set 2B
Alexander Zubchenko
September 24th, 2023
Block 1-2
 */

public class OrderedPair{
    private double x;
    private double y;
    public OrderedPair(){
        x = 0;
        y = 0;
    }
    public OrderedPair(double x, double y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return x + "," + y; // Returns X an Y as a string
    }
    public double getX(){
        return x; // Returns x as double
    }
    public double getY(){
        return y; // Returns y as double
    }
}