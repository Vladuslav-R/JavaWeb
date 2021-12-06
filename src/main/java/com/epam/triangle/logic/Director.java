package com.epam.triangle.logic;

import com.epam.triangle.dao.DataException;
import com.epam.triangle.dao.DataReader;
import com.epam.triangle.entity.Triangle;

import javax.xml.validation.Validator;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Director {

    private static final Logger LOGGER = Logger.getLogger(Director.class.getName());
    private final DataReader reader;
    private final LineValidator lineValidator;
    private final TriangleCreator creator;

    TriangleValidator triangleValidator = new TriangleValidator();

    public Director(DataReader reader, LineValidator lineValidator, TriangleCreator creator) {
        this.reader = reader;
        this.lineValidator = lineValidator;
        this.creator = creator;
    }

    public List<Triangle> read(String path) throws DataException {
        List<Triangle> triangles = new ArrayList<>();
        for (String line : reader.read(path)) {
            if (lineValidator.isValidLine(line)) {
                Triangle triangle = creator.create(line);
                if (triangleValidator.isATriangleExist(triangle)) {
                    triangles.add(triangle);
                }
            }
        }
        return triangles;
    }
}