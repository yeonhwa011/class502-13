package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 =new Schedule();
        //s1.printThis();
        //System.out.println(s1);
        Schedule _this = s1.returnThis();
        System.out.println(_this==s1); //this의 주소값과 s1이 가지고 있는 주소값이 같다.

      //  s1.year =2024; //통제불가
       // s1.month=4;
        //s1.day =17;

        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);

        s1.showDate();


    }
}
