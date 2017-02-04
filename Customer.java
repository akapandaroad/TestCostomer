import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by akapandaroad on 2017/2/3.
 */
public class Customer {




    private enum DrinkType{water,beer}
    private enum DrinkSize{ExtraSmall,small,middle,large}
    private static int N;
    public  int account;
    public static int value[]=new int[5];
    public static int[] limit=new int[3];
    private String name;
    private  int age;
    public int feet;
    private int inch;
    private  DrinkType drink;
    private  DrinkSize size;

    public Customer(String name,int age,int feet,int inch) {


        this.name=name;
        this.age=age;
        this.feet=feet;
        this.inch=inch;
        adAge();
        adWeight();

        adSize();
    }

    public void scan() {
               Scanner sc = new Scanner(System.in);
        for (int i = 0; i < limit.length; i++) {
            limit[i] = sc.nextInt();
       }
       N = sc.nextInt();
    }

    public void adSize() {

                for (int i = 0; i <N ; i++) {
            if(account<=limit[0]){
               this.size=DrinkSize.ExtraSmall;

            }

            else if(account<=limit[1]&&account>limit[0]){
                this.size=DrinkSize.small;
            }

            else if (account<=limit[2]&&account>limit[1]) {
                this.size=DrinkSize.middle;
            }
            else if (account>limit[2]){
                this.size=DrinkSize.large;
            }
        }
    }


    public void adAge( ){
        if(this.age<18){
            this.drink=DrinkType.water;
            //return "water";
        }
        else {
            this.drink=DrinkType.beer;
            //return "beer";
        }

    }

    public void adWeight() {

            if(this.feet<=5) {
                this.account =10*this.feet;


            }
            else{
                this.account=5*10+8*(this.feet-5);


            }


    }

    public void sort(String strs[]){

//        for (int i = 0; i <strs.length ; i++) {
//            System.out.println(strs[i]);
//        }
        for (int i = 0; i <strs.length ; i++) {
            value[i]=Integer.valueOf(strs[i].charAt(0));
            System.out.println(value[i]);

        }
        for (int i = 0; i <value.length; i++) {
            for (int j = i+1; j <value.length ; j++) {
                String temp=null;
                int temp2=0;
                if(value[i]>value[j]){//xioadaoda
                    temp=strs[j];
                    strs[j]=strs[i];
                    strs[i]=temp;

                    temp2=value[j];
                    value[j]=value[i];
                    value[i]=temp2;

                }
            }
        }
        for (int i = 0; i <strs.length ; i++) {
            System.out.println(value[i]);
            System.out.println(strs[i]);
        }

    }
    public Customer() {


    }

    @Override
    public String toString() {

        return this.name+" "+this.age+" "+this.drink+" "+this.account+"  "+this.size+" "+this.feet+" "+this.inch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
}
