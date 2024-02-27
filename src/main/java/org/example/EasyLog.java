package org.example;
import static java.lang.Math.log;

public class EasyLog {
    public static double logs(double base, double A, double B) {
        return log(A * B) / log(base);
    }
}
