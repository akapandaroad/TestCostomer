/**
 * Created by wangjialu on 2017/2/4.
 */
public class Example implements Comparable<Example> {
    private String name;
    private int age;
    public int feet;
    private int inch;

    public Example(String name, int age, int feet, int inch) {
        this.name = name;
        this.age = age;
        this.feet = feet;
        this.inch = inch;

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

    @Override
    public String toString() {
        return "Example{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", feet=" + feet +
                ", inch=" + inch +
                '}';
    }


    @Override
    public int compareTo(Example o) {
        if (this.name.charAt(0) > o.name.charAt(0))
            return -1;
        if (this.name.charAt(0) < o.name.charAt(0))
            return 1;
        else
            return 0;
    }
}


