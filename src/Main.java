public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int wt = 67;
        int high = 169;
        float result = service.calculate(67, 169);

        System.out.println(result);
    }
}