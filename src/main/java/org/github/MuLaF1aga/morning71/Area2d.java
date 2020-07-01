package org.github.MuLaF1aga.morning71;

public class Area2d {
    public static void area2d(Point3d a, double radius){
        for(int i = 0; i < 360; i+=10){
            double x = a.getX() + radius*Math.cos(Math.toRadians(i));
            double y = a.getY() + radius*Math.sin(Math.toRadians(i));
            Point3d tmp = new Point3d(x,y,a.getZ());
            System.out.println(tmp);
        }
    }
}
