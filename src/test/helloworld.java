package test;

import java.util.ArrayList;
import java.util.Arrays;

public class helloworld {
    //缩写快捷键
    //prsf
    private static final int number=0;

    //psvm
    public static void main(String[] args) {

        //sout
        System.out.println("helloworld");
        //soutp
        System.out.println("args = " + Arrays.deepToString(args));
        int num=10;
        int num1=9;
        //soutv
        System.out.println("num1 = " + num1);
        //fori
        String[] arr =new String[]{"one","two","three"};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }

        //list.for
        ArrayList list =new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //list.forr  逆序
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //ifn
        if (list == null) {

        }

        //inn
        if (list != null) {

        }




    }
}
