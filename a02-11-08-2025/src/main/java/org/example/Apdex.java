package org.example;

public class Apdex {
    public double calcApdex(double satisfatorias, double toleraveis, double totalAmostras) {
        return (satisfatorias + (toleraveis / 2)) / totalAmostras;
    }
}
