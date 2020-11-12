public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int wt = 67;
        int high = 169;
        float Test1 = service.BmiService(wt,high);

        System.out.println(Test1);
    }
}