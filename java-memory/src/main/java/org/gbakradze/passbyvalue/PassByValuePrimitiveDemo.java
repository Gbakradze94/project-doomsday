package org.gbakradze.passbyvalue;

/**
 * The output of this program will be 5. When we pass the localValue to the calculate method,
 * we are passing a copy of the value, not the original variable itself. Therefore, any
 * modifications made to calcValue inside the calculate method do not affect localValue in main.
 * This demonstrates that Java is "pass-by-value" for primitive types.
 */
public class PassByValuePrimitiveDemo {

    public static void calculate(int calcValue) {
        calcValue = calcValue * 100;
    }

    public static void main(String[] args) {
        int localValue = 5;
        calculate(localValue);
        System.out.println(localValue);
    }
}
