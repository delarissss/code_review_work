public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public double solver(int a, int b){
        // ax + b = 0
        if (a == 0) {
            if (b == 0) {
                throw new IllegalArgumentException();
            }
        }
        return (double) -1 * div(b, a);
    }
}