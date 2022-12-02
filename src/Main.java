public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate (54.5, 1.62);
        System.out.println("Ваш индекс массы тела - " + bmi);
    }
}