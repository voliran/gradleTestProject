
package org.example;

import com.example.mylibrary.QuadraticSolver;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(StringUtils.reverse("Hello, World!"));

        System.out.println(Arrays.toString(QuadraticSolver.solveQE(3, -2, -8)));
    }
}
