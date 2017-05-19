package com.wwwarehouse.demo;

/**
 * Created by chaoyong.qin on 2017-05-19.
 */
public class SwitchTest {
    public static void main(String[] args) {

//        String s = "abc";
//        switch (s) {
//            case "abc":
//                System.out.println(s);
//                break;
//            case "def":
//                System.out.println(s);
//                break;
//            default:
//                System.out.println(s);
//                break;
//        }

        int i = 1, j = 0;
        switch (i) {
            case 2:
                j += 6;
//                break;
            case 4:
                j += 1;
//                break;
            default:
                j += 2;
//                break;
            case 0:
                j += 4;
//                break;
            case 8:
                j += 4;
//                break;
        }
        System.out.println(j);

        if (1 == 1) System.out.println(111);
    }
}
