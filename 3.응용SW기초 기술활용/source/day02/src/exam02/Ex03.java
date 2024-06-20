package exam02;

public class Ex03 {
    public static void main(String[] args) {
       // int[] nums =new int[] {10,20,30,40};
       // int[]nums;
        //nums =new int[]{10,20,30,40};
       // nums ={10,20,30,40} //오류 (앞에 new int를 써줘야 한다. )

        int[] nums ={10,20,30,40,50,60,70}; //선언과 동시에 초기화
        System.out.println("공간의 갯수:" +nums.length);

        for(int i= 0; i< nums.length-1;i++){


            System.out.println(nums[i]);
        }
    }
}
