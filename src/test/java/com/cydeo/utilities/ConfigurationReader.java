package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    //1- Create Properties object
    //make it "private" so we are limiting access to the object
    //"static" is to make sure its created and loaded before everything else

    private static Properties properties = new Properties();

    static {

        try {
            //2-Open File using file input Stream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3-Load the"properties" object with "file

            properties.load(file);

            //close the file in the memory
            file.close();

        } catch (IOException e) {
            System.out.println("File not found with the given path!!!");
            e.printStackTrace();
        }

    }
    //4-Use "properties" object to read from the file
    //Create a utility method to use the object to read
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
