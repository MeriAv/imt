public class BmiService {

    public float calculate(int wt, int high) {
        int high2 = high * high;
        float result = wt / high2;
        return result;
    }

}
