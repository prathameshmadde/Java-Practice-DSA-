//Object and class created .
public class O1_ObjectClass {

    public static void main(String[] args) {
        
        Pen p1 = new Pen();//Pen constructor. - p1 object created.

        p1.setColor("blue");//function call form class
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}
