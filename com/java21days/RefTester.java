package com.java21days;

import java.awt.Point;

class RefTester {
    public static void main(String[] arguments) {
        Point pt1,pt2;
        pt1 = new Point(100, 100);
        ((Object) pt2).xPoint ();

        pt1.x = 200;
        pt1.y = 150;
        System.out.println("Point1: " + pt1.x + ", " + pt1.y);
        System.out.println("/tPoint2: " + pt2.x + ", " + pt2.y);
    }



    private static Point Point() {
        // TODO 自动生成的方法存根
        return null;
    }
}