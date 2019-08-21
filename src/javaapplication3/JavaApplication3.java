/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *
 * @author 1894017
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        int[] id = {10, 20, 30, 40, 50};

        String[] names = {"Zied", "Sossti", "Boundmai", "Jean", "Alsi"};

        double[] salary = {1000, 2000, 3000, 4000, 5000};

        JSONArray mainarray = new JSONArray();
        //MainArray 

        JSONObject objectone;
        //object one

        for (int i = 0; i < id.length; i++) {

            objectone = new JSONObject();

            objectone.accumulate("id", id[i]);

            objectone.accumulate("name", names[i]);

            objectone.accumulate("salary", salary[i]);

            mainarray.add(objectone);

        }

        FileWriter.saveStringIntoFile("Json/student.json", mainarray.toString());

        System.out.println(mainarray);

    }

}
