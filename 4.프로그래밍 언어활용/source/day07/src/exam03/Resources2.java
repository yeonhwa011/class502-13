package exam03;

import exam01.A;

public class Resources2 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Resources2 자원해제");
    }
}
