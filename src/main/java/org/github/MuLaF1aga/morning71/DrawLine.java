package org.github.MuLaF1aga.morning71;

public class DrawLine {
    public static void drawLine(Point3d a, Point3d b, int pointNum){
        double distanceX = (b.getX() - a.getX()) / pointNum;
        double distanceY = (b.getY() - a.getY()) / pointNum;
        double distanceZ = (b.getZ() - a.getZ()) / pointNum;
        for(int i = 0; i < pointNum; i++){
            Point3d tmp = new Point3d(a.getX()+i*distanceX,a.getY()+i*distanceY,a.getZ()+i*distanceZ);
            System.out.println(tmp);
        }
    }
}
