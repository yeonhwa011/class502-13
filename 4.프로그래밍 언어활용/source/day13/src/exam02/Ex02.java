package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int c = 10;
        Calculator cal = (a, b) -> {
           // c =20;

         return   a + b + c;

        };

       int result = cal.add(10,20);
        System.out.println(result);

        Calculator cal2 =new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return 0;
            }
        };

    }
}

