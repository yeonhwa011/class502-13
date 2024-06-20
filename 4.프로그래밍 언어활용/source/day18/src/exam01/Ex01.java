package exam01;

import java.time.Instant;

public class Ex01 {
    public static void main(String[] args) {
        Instant today = Instant.now();
        System.out.println(today);

        long time1= today.getEpochSecond(); //초단위 -timestamp
        long time2 = today.toEpochMilli(); //밀리초 단위 -EppchiTime ,UID

        System.out.printf("time=%d,time2=%d%n",time1,time2);

    }
}
