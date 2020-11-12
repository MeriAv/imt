public class BmiService {

    public float BmiService(int wt, int high) {
    int high2= high * high;
    float result = wt/high2;
    return result;
       }

}
