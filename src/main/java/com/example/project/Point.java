package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX(){
      return x;
    }


    public int getY(){
      return y;
    }

    public void incrementX(int increase){
      x = x + increase;
    }

    public void incrementY(int increase){
      y = y + increase;
    }

    
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
      /* IMPLEMENT ME */
      double distance;
      int x2 = other.getX();
      int y2 = other.getY();
      distance = Math.sqrt(Math.pow(x2-x,2) + Math.pow(y2 - y, 2));
      return distance;


    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      /* IMPLEMENT ME */
      return "(" + x + "," + " " + y + ")";

      
    }
  }
  