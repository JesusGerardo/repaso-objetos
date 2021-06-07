package uaslp.objetos.figuras;
import java.lang.Math;
public class PoligonoRegular {
    private double lado;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado) {
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea(){
        double angulo = 360/numeroDeLados;
        double apotema = (lado/2)/Math.tan(Math.toRadians(angulo/2));
        return (lado*numeroDeLados*apotema)/2;
    }

    public double getLado() {
        return lado;
    }
}
