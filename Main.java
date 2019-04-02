package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;
import java.lang.String;




public class Main {

    public static void partition(int n) {
        partition(n, n, "");
    }
    public static void partition(int n, int max, String prefix) {
        if (n == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = Math.min(max, n); i >= 1; i--) {
            partition(n - i, i, prefix + " " + i);
        }
    }

    public static void main(String[] args) { // start of psvm
        int n = Integer.parseInt(args[0]);
        partition(n);
    } // end of psvm
}

