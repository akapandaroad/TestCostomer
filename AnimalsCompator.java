import java.util.Comparator;

/**
 * Created by wangjialu on 2017/2/4.
 */
class AnimalsComparator implements Comparator<Animals> {
    @Override
    public int compare(Animals o1, Animals o2) {
        if (o1.name.charAt(0) < o2.name.charAt(0))
            return 1;
        if (o1.name.charAt(0) > o2.name.charAt(0))
            return -1;
        else
            return 0;
    }


}
