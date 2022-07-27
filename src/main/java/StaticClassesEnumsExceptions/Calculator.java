package StaticClassesEnumsExceptions;

import java.nio.channels.ScatteringByteChannel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Calculator {
     //public static final int MULTIPLICATION = 1;
    // public static final int SUMMARY = 2;
    // public static final int DIVISION = 3;
    // public static final int SUBTRACTION = 4;

    // enum final constants

private static final Logger logger = LogManager.getLogger(Calculator.class);

    public enum Type{
        MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBTRACTION
    }



    public static double calculate(double a, double b, Type type){

        logger.info("Running method calculate");
        double result = 0;

        if(type == null){
            throw new NullPointerException();
        }

        try{


        switch (type){
            case MULTIPLICATION:
                result = a*b;
                break;

            case SUMMARY:
                result = a+b;
                break;

            case DIVISION:
                result = a/b;
                break;

            case SUBTRACTION:
                result= a-b;
                break;

            default:
                result = -1;


        }

    }
        catch (Exception err){
           logger.error("Something bad happened", err);
        }
        return result;
    }}
