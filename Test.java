import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by akapandaroad on 2017/2/2.
 */
public class Test {

    private static int N;
    //    public static int account[]=new int[5];
   public static int value[]=new int[5];
    public static int[] limit = new int[3];
//    public static String name[] =new String[5];
//    public static String drink[]=new String[5];
//    public static String size[]=new String[5];
//    public static int age[]=new int[5];
//    public static int feet[]=new int[5];
//    public static int inch[]=new int[5];

    public static void main(String[] args) {


        Customer cm = new Customer();
        LinkedList<Customer> list = new LinkedList<Customer>();
        cm.scan();
        list.add(new Customer("apple", 11, 1, 3));

        list.add(new Customer("dock", 33, 9, 9));
        list.add(new Customer("eock", 33, 9, 9));

        list.add(new Customer("bape", 55, 3, 4));
        list.add(new Customer("cock", 33, 9, 9));
        //list.poll();
        // System.out.println(cm.adAge(list));
       // System.out.println(list);
        //         System.out.println(cm.adAge(list.element()));
        //System.out.println(cm.getName());



//        cm.adSize(N,limit );

       System.out.println(list);
        //System.out.println(list.element());
        Object[] array=list.toArray();
        String [] strs=new String[array.length];
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
            //Object str=array[i].toString();
            strs[i]=array[i].toString();
            //System.out.println(strs[i].charAt(0));
            //System.out.println(Integer.valueOf(strs[i].charAt(0)));
        }


       cm.sort(strs);




































//        for (int i=0;i<limit.length;i++){
//            limit[i]=sc.nextInt();
//        }
//
//        N=sc.nextInt();
//
//        for (int i = 0; i <N ; i++) {
//
//            name[i]=sc.next();
//            age[i]=sc.nextInt();
//            feet[i]=sc.nextInt();
//            inch[i]=sc.nextInt();
//
//
//        }
//
//
//        Comage();
//        ComWeight();
//        ComCup();
//        ComValue();
//
//
//
//
//
//
//
//        for (int i = 0; i <N ; i++) {
//
//            System.out.println(value[i]+" ");
//            System.out.print(name[i]+" ");
//            System.out.print(drink[i]+" ");
//            System.out.print(size[i]+" ");
//            System.out.print(age[i]+" ");
//            System.out.print(feet[i]+" ");
//            System.out.println(inch[i]+" ");
//
//        }
//
//
//    }
//
//    public static void Comage(){
//
//        for (int i = 0; i <N ; i++) {
//            if(age[i]<18){
//                drink[i]="water";
//            }
//            else {
//                drink[i] = "beer";
//            }
//
//
//
//        }
//
//
//    }
//
//    public static void ComWeight(){
//        for (int i = 0; i < N; i++) {
//            if(feet[i]<=5) {
//                account[i] =10*feet[i];
//            }
//            else{
//                account[i]=5*10+8*(feet[i]-5);
//            }
//        }
//
//
//
//    }
//
//
//    public static void ComCup(){
//
//        for (int i = 0; i <N ; i++) {
//            if(account[i]<=limit[0]){
//                size[i]="ExtraSmall";
//
//            }
//
//            else if(account[i]<=limit[1]&&account[i]>limit[0]){
//                size[i]="small";
//            }
//
//            else if (account[i]<=limit[2]&&account[i]>limit[1]) {
//                size[i]="middle";
//            }
//            else if (account[i]>limit[2]){
//                size[i]="large";
//            }
//        }
//    }
//
//
//    public static void ComValue(){
//        for (int i = 0; i <N ; i++) {
//            value[i]=Integer.valueOf(name[i].charAt(0));
//
//            //    System.out.print(name[i].charAt(0));
//
//        }
//
//        for (int i = 0; i <N ; i++) {
//            for (int j = 0; j <N; j++) {
//                int temp;
//                String temp2;
//                if (value[j+1] > value[j]) {
//                    //从大到小
//
//
//                    temp =value[j+1];
//                    value[j+1]=value[j];
//                    value[j]=temp;
//
//
//                    temp=age[j+1];
//                    age[j+1]=age[j];
//                    age[j]=temp;
//
//                    temp=feet[j+1];
//                    feet[j+1]=feet[j];
//                    feet[j]=temp;
//
//                    temp=inch[j+1];
//                    inch[j+1]=inch[j];
//                    inch[j]=temp;
//
//                    temp2=name[j+1];
//                    name[j+1]=name[j];
//                    name[j]=temp2;
//
//                    temp2=drink[j+1];
//                    drink[j+1]=drink[j];
//                    drink[j]=temp2;
//
//                    temp2=size[j+1];
//                    size[j+1]=size[j];
//                    size[j]=temp2;
//                }
//            }
//
//
//        }
//
    }
}