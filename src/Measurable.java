import java.util.List;

public abstract class Measurable implements Comparable<Measurable>  {

    abstract float getMeasure();

    public int compareTo(Measurable instance){
        if (this.getMeasure() > instance.getMeasure()) {
            return 1;
        } else if (this.getMeasure() > instance.getMeasure()) {
            return -1;
        }
        return 0;
    }

    public static <T extends Measurable>float average(List<T> list){
        float total = 0.0f;
        for (int i=0; i<list.size();i++){
            total = total + list.get(i).getMeasure();
        }
        return total/list.size();
    }
}
