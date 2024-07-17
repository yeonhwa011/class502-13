package exam01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CalculatorHandler implements InvocationHandler {

    private Object obj;

    public CalculatorHandler(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long stime = System.nanoTime();
        try {

            Object result = method.invoke(obj, args); //Calculator.factorial 호출 / 핵심기능을 대신 수행

            return result;
        }finally {
            long etime =System.nanoTime(); // 추가 기능 - 공통기능,공통 관심사
            System.out.printf("걸린시간: %d%n", etime - stime);
        }
    }
}
