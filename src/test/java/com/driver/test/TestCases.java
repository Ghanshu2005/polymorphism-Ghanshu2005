package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
    public static class Product {
        public int product(int x, int y) {
            return x + y;
        }
        public int product(int x, int y, int z){
            return x+y+z;
        }
        public double product(double x, double y) {
            return x + y;
        }
    }

    public static void main(String[] args) {
        main.Product p = new main.Product();
        System.out.println(p.product(5, 4));
        System.out.println(p.product(5, 4, 6));
        System.out.println(p.product(5.5, 4.3));

        //
    }
}