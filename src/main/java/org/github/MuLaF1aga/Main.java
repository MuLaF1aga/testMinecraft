package org.github.MuLaF1aga;

import org.github.MuLaF1aga.morning71.*;

import static org.github.MuLaF1aga.morning71.Area2d.area2d;
import static org.github.MuLaF1aga.morning71.DrawLine.drawLine;
import static org.github.MuLaF1aga.morning71.Util.pointInsideRect;

public class Main {
    public static void main(String[]args){
        /*
        PlayerInfo p1 = new PlayerInfo("ming",14);
        System.out.println(p1);
        PlayerInfo test = new PlayerInfo("test", 10);
        Gson gson = new Gson();
        String s = gson.toJson(p1);
        System.out.println(s);
        PlayerInfo rep = gson.fromJson(s,PlayerInfo.class);
        System.out.println(rep);
        */

        //Q1
        System.out.println("-----Q1-----");
        Point3d a = new Point3d(195,103,-43);
        Point3d b = new Point3d(193,75,-65);
        Point3d c = new Point3d(194,80,-55);
        Point3d d = new Point3d(200,100,-50);
        boolean checkC = pointInsideRect(a,b,c);
        boolean checkD = pointInsideRect(a,b,d);
        System.out.println("Point3d C:" +checkC);
        System.out.println("Point3d D:" +checkD);

        //Q2
        System.out.println("-----Q2-----");
        drawLine(a,b,10);

        //Q3
        System.out.println("-----Q3-----");
        Point3d q3 = new Point3d(6,-7,0);
        area2d(q3,1);
    }
}
