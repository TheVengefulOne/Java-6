package main.java.com.Alexandr.practice.modul06.practice6;

import java.util.Random;

/**
 * Created by admin on 21.03.2017.
 */
public class Chart {

    Point[] points = new Point[10];
    private Random random = new Random();

    public void init(){
        for (int i = 0; i < 10 ; i++) {
            points[i] = new Point(random.nextInt(100),random.nextInt(100), i);

        }
    }

    public void drawChart(){
        for (Point point : points) {
            System.out.println(point);
        }
    }
   private class Point {
        private int order;
        private int x;
        private int y;
        private int distanceToNextPoint;

        public Point(int x, int y, int order) {
            this.x = x;
            this.y = y;
            this.order = order;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public int getDistanceToNextPoint() {
            calculateDisatnce();
            return distanceToNextPoint;
        }

        private void calculateDisatnce() {
            if (order == points.length) {
                return;
            }
            distanceToNextPoint = x + points[order + 1].getX();
        }


    }

    public int calculateWidtOfChart(){
        int width = 0;
        for (Point point : points) {
            width += point.getDistanceToNextPoint();
        }
        return width;
    }
}
