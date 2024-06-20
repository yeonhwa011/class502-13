package exam01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Ex07 {
    public static void main(String[] args) {
        //  int[] nums = {22,10,5,1,99,50};
        Integer[] nums = {22,10,5,1,99,50};
        //Arrays.sort(nums); //기본정렬,Integer 기본정렬 기준 -java.lang
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println(Arrays.toString(nums));
    }
}
