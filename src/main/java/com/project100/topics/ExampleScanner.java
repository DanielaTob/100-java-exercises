package com.project100.topics;

import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class ExampleScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);

    }
}
