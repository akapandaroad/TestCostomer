/**
 * Created by wangjialu on 2017/2/4.
 */

public class Animals implements Comparable<Animals>{
    public  String name;
    public int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Animals o) {
        if (this.age > o.age)
            return 1;
        if (this.age < o.age)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
