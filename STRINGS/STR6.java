//FIND THE SHORTEST PATH OF THE GIVEN DIRECTIONS
import java.util.*;
public class STR6{
    public static double Shortest_path(String path){
        //INITIAL VALUES
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //east
            if(dir=='E'){
                x++;
            }
            //west
            if(dir=='W'){
                x--;
            }
            //north
            if(dir=='N'){
                y++;
            }
            //south
            if(dir=='S'){
                y--;
            }
        }
       
        double shortest_path=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return shortest_path;

    }
    public static void main(String args[]){
        String path="WNEENESENNN";
        System.out.println("THE SHORTEST PATH IS : "+Shortest_path(path));
        
    }
}