import java.util.Comparator;

/**
 * Created by wangjialu on 2017/2/4.
 */
 class ExamplesComartor implements Comparator<Example>{


    @Override
    public int compare(Example o1, Example o2) {
        if(o1.age>o2.age)
            return 1;
        if(o1.age<o2.age)
            return -1;
        else
            return 0;
    }
}
