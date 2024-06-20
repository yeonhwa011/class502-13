package exam01;

public class Board {
   // private  static Board instance = new Board(); //클래스 로드시점부터 생성
      private static Board instance;


      static {
          System.out.println();
      }

     private Board(){}

    public  static Board getInstance(){
        if(instance==null) {  //필요한 시점 최소 1번만 생성
            instance =new Board();
        }

        return  instance;
    }


}
