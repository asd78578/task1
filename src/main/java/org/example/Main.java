package org.example;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(System.out)) {
            pw.println("Практическая задача 1.1.2 Знакомство с GIT " +
                    "Амирханов Алавутдин");
        }
    }
}