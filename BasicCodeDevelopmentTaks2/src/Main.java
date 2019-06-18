import static java.lang.Math.*;
public class Main {

    public static void main(String[] args) {

        // Вычислить значение выражения по формуле (все переменные принимают действительные значения):

        double a = 4.3;
        double b = 5.5;
        double c = 6.55;
        double z;

        z = ((b + sqrt(pow(b,2) + 4 * a * c ))/a*a) - pow(a,3)*c + pow(b, -2);
        System.out.println(z);

    }
}
