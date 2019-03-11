package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {




    private final SomeType[] array;


    public SomeType[] getArray() {
        return array;
    }

    public ArrayUtility(SomeType[] array) {


        this.array = array;

    }

    public SomeType findOddOccurringValue(){

    SomeType numberEvens;

    Integer num=0;
        for (Integer i = 0; i < array.length; i++) {
        if (i % 2 != 0) {
            num++;
        }
    }
        return (SomeType)num;
}

    public SomeType findEvenOccurringValue() {

       SomeType numberEvens;
       Integer num=0;
        for (Integer i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
               num++;
            }
        }
        return (SomeType)num;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {

        return null;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate)
    {


     //SomeType[]  numberArray = Arrays.stream(array).filter(c->predicate.apply()).toArray((Object[]::new);


                return null;

    }
}
