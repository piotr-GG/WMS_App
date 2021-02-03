package app.utility;

public class UtilityClass {

    public static boolean isParsable(String input){
        boolean parsable = true;
        try{
            Integer.parseInt(input);
        }catch(NumberFormatException e){
            parsable = false;
        }
        return parsable;
    }

    public static boolean isDoubleParsable(String input){
        boolean parsable = true;
        try{
            Double.parseDouble(input);
        }catch(NumberFormatException e){
            parsable = false;
        }
        return parsable;
    }

    public static boolean isLongParsable(String input){
        boolean parsable = true;
        try{
            Long.parseLong(input);
        }catch(NumberFormatException e){
            parsable = false;
        }
        return parsable;
    }
}
