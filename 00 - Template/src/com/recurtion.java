package com;
// without looping
public class recurtion {
    public static void main(String[] args) {
        int result = sumFunction(10);
        System.out.println(result);
    }

    public static int sumFunction(int n) {
        if (n > 0) {
            return n + sumFunction(n - 1);
        } else {
            return 0;
        }
    }
}
