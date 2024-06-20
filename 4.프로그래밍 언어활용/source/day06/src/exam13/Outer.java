package exam13;

public class Outer {
    public Caulculator method(int num3){
        Caulculator cal =new Caulculator(){
          public int add (int num1,int num2){
              return num1+num2+num3;
          }
        };

      return cal;
    }
}
