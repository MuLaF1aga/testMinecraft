package org.github.MuLaF1aga.morning71;

import static org.github.MuLaF1aga.morning71.Point3d.inside2d;

public class Util {
    public static boolean pointInsideRect(Point3d a, Point3d b, Point3d c){
        boolean xRange,yRange,zRange;

        xRange = inside2d(a.getX(),b.getX(),c.getX());
        yRange = inside2d(a.getY(),b.getY(),c.getY());
        zRange = inside2d(a.getZ(),b.getZ(),c.getZ());

        return xRange && yRange && zRange;

    }
}
