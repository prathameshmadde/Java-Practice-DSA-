//Shortest Distace from starting Point.
public class S2_ShortestDistance {
    
    public static float shortDistance(String str){
        int x =0; 
        int y =0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);
            if (dir == 'N'){
                y++;
            }
            else if (dir=='S'){
                y--;
            }
            else if (dir=='E'){
                x++;
            }
            else {
                x--;}
           
        }
 
        int x2= x*x;
        int y2= y*y;
        return  (float)Math.sqrt(x2+y2);
    }   

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortDistance(str));
    }
}
