package study.ch19;

import lombok.Getter;

import java.util.Arrays;

public class SimpleArrayList<T> {
    @Getter
    private String[] strs;

    public SimpleArrayList() {
        strs = new String[0];
    }

    public void add(String str) {
        String[] newStrs = new String[strs.length + 1];//기존의 크기보다 하나 많은
        for ( int i = 0; i < strs.length; i++){
            newStrs[i] = strs[i];
        }
        newStrs[strs.length] = str;
        this.strs = newStrs;//주소 넘기기

    }

    public void pop() {
        if (strs.length < 1 ){
        return;
    }
        String[] newStrs = new String[strs.length - 1];
        for (int i =0; i < newStrs.length; i++) {
            newStrs[i] = strs[i];
        }

        this.strs = newStrs;//주소넘기기
    }

    public void add(int index, String str){
//        if(index > strs.length) {
//            return;
//        }
        String[] newStrs = new String[strs.length + 1];
        for(int i = 0; i < strs.length; i++){
            int  currentIndex = i < index ? i : i+1;
            newStrs[currentIndex] = strs[i];
        }
        newStrs[index] = str;

        this.strs = newStrs;
    }
// 0 1 2 3 4 2번인덱스
    // 0 1 3 4 3 ->2번

    public void remove(int index) {
        String[] newStrs = new String[strs.length - 1];
        for(int i = 0; i < newStrs.length; i++){
            int removeIndex = i < index ? i : i + 1;

            newStrs[i] = strs[removeIndex];
        }
        this.strs = newStrs;
    }

    public void remove(String str) {
        int index = -1;
        for(int i =0; i < strs.length; i++){
            if(strs[i].equals(str)) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            System.out.println("값 없음");
            return;
        }
        remove(index);
    }

}

class SimpleArrayListMain {
    public static void main(String[] args) {
        SimpleArrayList list = new SimpleArrayList();
        list.add("권민주");
        list.add("권구");
        list.add(1, "권율");
        list.add("Test");
        list.add("Test");
        list.add("Test");
        list.add("Test");
        list.add(1, "권율");


        System.out.println(Arrays.toString(list.getStrs()));
        list.remove(1);
        System.out.println(Arrays.toString(list.getStrs()));
        list.remove("권율");
        list.remove("권율");
        System.out.println(Arrays.toString(list.getStrs()));


    }
}
