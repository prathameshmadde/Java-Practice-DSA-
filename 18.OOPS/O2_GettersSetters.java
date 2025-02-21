//Getter - for returing volues .
//setter - for modifying values .
public class O2_GettersSetters {
    
    public static void main(String[] args) {
        
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String color;
    private int tip;
    
    //getters 
    String getColor(){
           return this.color;
    }
    int getTip(){
        return this.tip;
    }

    //setters
    void setColor(String newColor){
        this.color=newColor;
    }
    void setTip(int newTip){
        this.tip=newTip;
    }

}
