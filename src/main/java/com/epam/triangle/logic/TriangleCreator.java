package com.epam.triangle.logic;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TriangleCreator {
    String s;
    StringBuilder sb = new StringBuilder();
    try (Reader reader = new FileReader("Users/V.radkevich/IdeaProjects/JavaWeb/src/main/java/com/epam/triangle/triangle.txt")) {
        int data = reader.read();

        while (data != -1) {
            sb.append((char) data);
            data = reader.read();
               }
        System.out.println(sb);

    } catch (IOException e) {
        e.printStackTrace();
    }
}
