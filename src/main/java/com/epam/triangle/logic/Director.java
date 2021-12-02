package com.epam.triangle.logic;

import com.epam.triangle.dao.DataException;
import com.epam.triangle.dao.DataReader;
import com.epam.triangle.entity.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Director {

    private final DataReader reader;
    private final LineValidator validator;
    private final TriangleCreator creator;

    public Director(DataReader reader, LineValidator validator, TriangleCreator creator) {
        this.reader = reader;
        this.validator = validator;
        this.creator = creator;
    }

    public List<Triangle> read(String path) throws DataException {
        List<Triangle> triangles = new ArrayList<>();
        for (String line : reader.read(path)) {
            if (validator.isValidLine(line)) {
                Triangle ball = creator.create(line);
                triangles.add(ball);
            }
        }
        return triangles;
    }
}