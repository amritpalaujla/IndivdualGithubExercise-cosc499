import org.junit.Test;

public class big {

    public static void main (String [] args){
        int aInt = 5;
        int bInt = -40;
        int cInt = bigIntCheck(aInt, bInt);

        System.out.println("The bigger of "+ aInt+ " and "+ bInt +" is " + cInt);

        String aString = "super";
        String bString = "bicycle";
        String cString = bigStringCheck(aString, bString);

        System.out.println("The bigger of "+ aString+ " and "+ bString +" is " + cString);

    }

    public static int bigIntCheck(int x, int y){
        if(x > y) {
            return x;
        }
        else{
            return y;
        }
    }

    public static String bigStringCheck(String x, String y){

        if (x.length()> y.length()){
            return x;
        }
        else {
            return y;
        }
    }

    


}