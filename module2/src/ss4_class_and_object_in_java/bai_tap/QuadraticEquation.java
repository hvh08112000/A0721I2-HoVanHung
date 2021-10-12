package ss4_class_and_object_in_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(b,2) - 4 * a * c;
        return delta;
    }

    public double getRootDouble() {
        double r = -b / (2 * a);
        return r;
    }

    public double getRoot1() {
        double r1 = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        return r2;
    }

}
