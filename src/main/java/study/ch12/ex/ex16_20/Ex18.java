package study.ch12.ex.ex16_20;

import java.util.Arrays;

public class Ex18 {
    public static void main(String[] args) {
        int[] nums = {9, 2, 5};
        NumberSorter numberSorter = new NumberSorter(nums);
        numberSorter.sort();
        numberSorter.printResult();

        String[] strings = {"bb", "cc", "aa"};
        StringSorter stringSorter = new StringSorter(strings);
        stringSorter.sort();
        stringSorter.printResult();
    }
}

interface  Sortable {
    void sort();
    void printResult();
}
class NumberSorter implements Sortable{
    private int[] num;

    public NumberSorter(int[] num) {
        this.num = num;
    }

    @Override
    public void sort() {
        int len = num.length - 1;
        for(int i =0; i < len; i++){
            for(int j = 0; j< len - i; j++){
                if(num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void printResult() {
        System.out.println(Arrays.toString(num));

    }
}
class StringSorter implements Sortable{
    private String[] arr;

    public StringSorter(String[] arr) {
        this.arr = arr;
    }

    @Override
    public void sort() {//{"bb", "cc", "aa"};
        for(int i =0; i < arr.length-1; i++){
            for(int j =0; j < arr.length - 1 - i; j++){
                if(arr[j].charAt(0) > arr[j+1].charAt(0) ){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
    }

    @Override
    public void printResult() {
        System.out.println(Arrays.toString(arr));
    }
}


