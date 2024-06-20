package exam01;

public class Ex07 {

    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(()->{
            Thread th2 =new Thread();
            while(true) {
               try {
                    System.out.println("isInterrupted:" + th2.isInterrupted());

                    Thread.sleep(10000); //WATTING  -일시정지
                }catch (InterruptedException e){ //RUNNABLE -실행대기
                   System.out.println("InterruptedException 발생!");
                   th2.interrupt();
               }
            }
        });

           th.start();

           Thread.sleep(3000);

           th.interrupt(); //InterruptedException 발생 ,isInterrupted ->true

    }
}
