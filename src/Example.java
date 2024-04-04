import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Mathematics m = Double::sum;
        Mathematics x = (s, y) -> s + y;
        System.out.println(x.add(2, 5));

    }
}

interface Mathematics {
    double add(double a, double b);
}
class Calculator {
    static Map<Character, Calculable> map = new HashMap<>();
    static {
        map.put('+', arr -> arr[0] + arr[1]);
        map.put('-', arr -> arr[0] - arr[1]);
        map.put('*', arr -> arr[0] * arr[1]);
        map.put('k', arr -> Math.sqrt(arr[0]));
    }
    public static void main(String ... args) {
        System.out.println(calculator1('k', 4, 5));
    }
    public static double calculator(char operator, double x, double y){
        if (operator == '+')  return x+y;
        if (operator == '-') return x-y;
        if (operator == '*') return x*y;
        else throw new UnsupportedOperationException("ikke implementert");
    }
    public static double calculator1(char operator, double x, double y){
        return map.get(operator).calc(x,y);
    }
    interface Calculable{
        double calc(double ... arr);
    }
}
