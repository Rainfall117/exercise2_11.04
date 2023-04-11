public class main {
    public static void main(String[] args) {
        BmiService serv = new BmiService();
        int mass = 86;
        double height = 1.83;
        int bmi = serv.calculate(mass,height);
        //double bmi1 = bmi;
        System.out.println(bmi);
    }
}