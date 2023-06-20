package Conicas1;

public class Parabola {
    private double k;
    private double h;
    private double a;
    private double x;
    private double y;
    private double resultado;

    public Parabola(double k, double a, double x, double y) {
        this.k = k;
        this.a = a;
        this.x = x;
        this.y = y;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularEjeHorizontal() {
        this.h = -this.k / (2 * this.a);
        return this.h;
    }


    public void imprimirDatos() {
        System.out.println(this.h);
    }
}
