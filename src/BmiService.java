public class BmiService {
    public int calculate(int mass, double height) {
        double result;
        result = mass / (height * height);
        return (int) result;
    }
}

