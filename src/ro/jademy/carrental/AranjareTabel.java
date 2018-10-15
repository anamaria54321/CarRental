package ro.jademy.carrental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AranjareTabel {
    public List<String> stringList = new ArrayList<>();




    public void showMake(){
        String make1 =new String("Dacia");
        String make2 =new String("Ford");
        String make3 =new String("Audi");

        String model1 =new String("Logan");
        String model2 =new String("Ka");
        String model3 =new String("A4");

        stringList.addAll(Arrays.asList(make1,make2,make3));

    }


    public int lungimeMaximaString(){
        int lungimeString =0;
        for (String s:stringList ) {
            if(s.length()>=lungimeString){
                lungimeString=s.length();
            }
        }System.out.println(lungimeString);
        return lungimeString;
    }

}
