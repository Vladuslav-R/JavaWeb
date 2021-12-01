package com.epam.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {


    public List<String> read(String path) throws ReadException {
        List<String> result = new ArrayList<>();
        try {
            File file = new File(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            while (line != null) {
                result.add(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            ReadException readException = new ReadException();
            throw new ReadException("Could not find file by that path", e);
        } catch (IOException e) {
            throw new ReadException("An I/O error occured", e);
        }
        return result;
    }


}



