

import java.util.*;

/**
 * Created by wangjialu on 2017/2/3.
 */

public class t{
    public static void main(String[] args) {
        LinkedList<Animals> list=new LinkedList<Animals>();
        LinkedList<Example> list2=new LinkedList<Example>();
        list.add(new Animals("a", 10));
        list.add(new Animals("b", 4));
        list.add(new Animals("c", 6));

        list2.add(new Example("apple", 11, 1, 3));

        list2.add(new Example("dock", 33, 9, 9));

        list2.add(new Example("bape", 55, 3, 4));
        list2.add(new Example("cock", 33, 9, 9));
        Collections.sort(list);
        Collections.sort(list2);
      //需重写compareTo（）方法
        for (Animals animals : list) {
            System.out.println("Animals name=" + animals.name + "      "+"age="
                    + animals.age);
        }

        System.out.println(list2);
    }












//        Integer[] a={50,22,35,14,25,16,8,9,7,5,54,34};
//        int temp3=0;
//        for (int i = 0; i <a.length ; i++) {
//            for (int j =i+1; j <a.length ; j++) {
//                if(a[i]>a[j]){
//                    temp3=a[i];
//                    a[i]=a[j];
//                    a[j]=temp3;
//                }
//            }
//        }
//        for (int i = 0; i <12 ; i++) {
//
//            System.out.println(a[i]);
//        }
//
//        int b[]={1,54,6,3,78,34,12,45};
//
//        int temp=0;
//
//        for(int i=0;i<b.length;i++){
//
//            for(int j=i+1;j<b.length;j++){
//
//                if(b[i]>b[j]){
//
//                    temp=b[i];
//
//                    b[i]=b[j];
//
//                    b[j]=temp;
//
//                }
//
//            }
//
//        }
//
//        for(int i=0;i<a.length;i++)
//
//            System.out.println(a[i]);
//
   }





