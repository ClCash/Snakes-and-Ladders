import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Board {

    //final static int FinishPoint=100; is the the point needed to be reached 
    //in order for the the player.
    final static int FinishPoint=100;
    // key is int 1 of snake hashmap representing its mouth, value is int 
    //2 of the snake hashmap respresenting the tail of the snack 
    static Map <Integer, Integer> snake = new HashMap <Integer, Integer>();
    // key is int 1 of the ladder hasmap is the bottom of the ladder,
    //while the value is the int2 of the ladder hashmap, representing
    //the top of the ladder
    static Map <Integer, Integer> ladder = new HashMap <Integer, Integer>();

    
    
    { 
        //storing the values for the snakes mouth and tail, first point
        //is the mouth and the second point is the tail of the snake.
            snake.put(99,78);
            snake.put(95,75);
            snake.put(93,73);
            snake.put(87,24);
            snake.put(64,60);
            snake.put(62,19);
            snake.put(54,34);
            snake.put(17,7);
            
        //stroing values for top and bottom of the ladders,
        // the first value of the ladder is the bottom and 
        // the second value is the top of the ladder
            ladder.put(4,14);
            ladder.put(9,31);
            ladder.put(20,38);
            ladder.put(28,84);
            ladder.put(40,59);
            ladder.put(51,67);
            ladder.put(63,81);
            ladder.put(71,91);
            
    }
    public int getResult(){
    
    int dice = (int) (Math.random()*6+1);
    int result =dice;
    return result;
   
    }
}    

