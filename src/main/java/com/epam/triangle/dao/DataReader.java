package com.epam.triangle.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class DataReader {
    private static final Logger LOGGER = Logger.getLogger(DataReader.class.getName());
    public List<String> read(String filePath) throws DataException {
        List<String> data = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));

            String line = reader.readLine();
            while (line != null) {
                data.add(line);
                line = reader.readLine();
            }
            LOGGER.info("Data from file has read");
            reader.close();
        } catch (IOException e) {
            throw new DataException("The file cannot be found at the specified path! ", e);
        }
        return data;
    }
}