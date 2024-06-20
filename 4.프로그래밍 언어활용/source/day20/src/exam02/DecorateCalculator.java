package exam02;

public class DecorateCalculator implements Calculator{

    private Calculator calculator = new ImplCalculator();

    public DecorateCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public long factorial(long num) {

        long stime = System.nanoTime(); //공통 추가 기능
        try {

                long result = calculator.factorial(num); //핵심 기능 이 대신 수행

                return result;
            }finally{
                long etime = System.nanoTime();
            }
        }
    }
