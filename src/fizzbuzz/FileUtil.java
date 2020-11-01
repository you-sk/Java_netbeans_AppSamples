/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author you-s
 */
public class FileUtil {
    public static void write(String fileName) throws Exception {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("テスト");
            fileWriter.close();
        } catch (IOException e) {
            throw e;
        }
    }
}
