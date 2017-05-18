/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplefileinput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kendrabooker
 */
public class SimpleFileInput {

    /**
     * @param Name 
     * @throws java.io.FileNotFoundException
     */
    
    private static List main(String Name) throws Exception
    {
        String line = null;
        List records = new ArrayList();

        // use the readLine method of the BufferedReader to read one line at a time.
        // the readLine method returns null when there is nothing else to read.
        try ( // wrap a BufferedReader around FileReader
                BufferedReader bufferedReader = new BufferedReader(new FileReader(Name))) {
            // use the readLine method of the BufferedReader to read one line at a time.
            // the readLine method returns null when there is nothing else to read.
            while ((line = bufferedReader.readLine()) != null) {
                records.add(line);
            }
            // close the BufferedReader when we're done
        }
        return records;
    }
    
}
