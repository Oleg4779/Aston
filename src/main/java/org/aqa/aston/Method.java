package org.aqa.aston;

public class Method {
    public static int factorial(int n) {
        int x = 1;
        for (int i = 1; i <= n; i++) {
            x *= i;
        }
        return x;
    }
}
