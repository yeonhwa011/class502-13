package exam01;

import javax.swing.plaf.PanelUI;
    //T는 Fruit의 하위클래스
public class Box<T extends Fruit &Eatable> { //Box<T> :지네릭 클래스, T -타입 매개변수,Box :원시타입
    private T item;

    //private  static T item2; -사용불가,처음부터 공간을 할당 받으므로 자료형이 명확해야함

   // private  static T[] nums = new T[3];//사용불가,배열에서 공간을 생성을 위해서 자료형이 명확해야함

    public void setItem(T item){
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public String toString(){
        //T == Object
       // item.get()
        return item.get();
    }
}
