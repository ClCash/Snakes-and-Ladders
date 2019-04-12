//importing all java input and output
//This is for input and outputs since i will be using a buffered reader(character reader)
import java.io.*;
//import all java utilities 
import java.util.*;

public class SnakesAndLadders {
    public static void main(String[] args) throws IOException{//will throw away any input output exceptions
    
//buffered reader equilivelent of new scanner 
    BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Welcome to Snakes and ladders players, Climb at own risk!! ");
    System.out.println("You control the game and advance by pressing any button on the keyboard ");
    keyboard.readLine();
    Random role=new Random();
    
    
    //my 2d array for the snakes the first number is the mouth(bite)
    // and the second number is the tail(end)
    int snakes[][]={{17,7},{54,34},{62,19},{64,60},{87,24},{93,75},{95,75},{99,78}};
    //my 2d array for the ladders the first number being the bottom(start of climb) and the 
    //second being the top of the ladder(finish of the climb)
    int ladders[][]={{4,14},{9,31},{20,38},{28,84},{40,59},{51,67},{63,81},{71,91}};
    //declarations 
    int player1Spot=1;
    int player2Spot=1;
    int turn1=1;
    int turn2=1;
    //while loop created so as long as noone is at 100 the game keeps going on and stops when a player
    //finally reaches 100 and wins
    //so while player 1 doesnt =100 or  player 2 doesnt =100 we output to continue rolling the die
    while((player1Spot!=100)||(player2Spot!=100)){
        System.out.println("Player 1 it is your turn to roll press any button");
        //adds one to the turn count of player1
        turn1++;
        //takes the next read input from keyboard which intializes the role of the die(random.next
        //Integer out of 6 method
        keyboard.readLine();
        int diceRoll=role.nextInt(6);
        //if random # is 0 add 1 because die dont have a zero side so we give the roll a 1
        if(diceRoll==0){
            diceRoll++;
        }
        System.out.println("Player 1 you rolled a " + diceRoll );
        //if statement for what to output to player per what roll they got
        //if the player is for example at 99 and rolls a 5 they went past 100 so they stay at 99
        // and have to wait till next turn for another chance at rolling a 1 to get evenly at 100.
        if((player1Spot+diceRoll)>100){
            System.out.print("You went past 100 you are still at current position and will wait for your next turn");}
        //if players current position plus the dice roll number equal 100 they have won the game for example
        // if position is 95 and player 1 rolls a 5 they have won the game.
        else if((player1Spot+diceRoll)==100){
            System.out.println("You have won the game Player 1, congratulations");
            break;
        }
        else
        {
            //player1Spot= player1Spot+diceRoll
            player1Spot+=diceRoll;
            System.out.println("Player 1 you have moved " +diceRoll+ " spaces and you are now at the number  "+player1Spot+" square on the board. ");
            System.out.println("Press a key on the keyboard to see if you got bit or if you caught a ladder. ");
            keyboard.readLine();
            //switch statement used to test many differenet possibilites (those being the chances
            // of being bitten or finding a ladder)each case is either a bite or a ladder all dependning
            // on where the roll put the players position
           switch(player1Spot){
                   case 4: System.out.println("You found a ladder, your new position is 14. ");
                   player1Spot=14;
                   break;
                   
                   case 9: System.out.println("You found a ladder, your new position is 31. ");
                       player1Spot=31;
                       break;
                   case 17:System.out.println("You got bit by a snake, your new position is 7. ");
                       player1Spot=7;
                       break;
                   case 20: System.out.println("You found a ladder, your new position is 38. ");
                       player1Spot=38;
                       break;
                   case 28: System.out.println("You found a ladder, your new position is 84. ");
                       player1Spot=84;
                       break;
                   case 40: System.out.println("You found a ladder, your new position is 59. ");
                       player1Spot=59;
                       break;
                   case 51: System.out.println("You found a ladder, your new position is 67. ");
                       player1Spot=67;
                       break;
                   case 54: System.out.println("You got bit by a snake, your new position is 34. ");
                       player1Spot=34;
                       break;
                   case 62: System.out.println("You got bit by a snkake, your new position is 19. ");
                       player1Spot=19;
                       break;
                   case 63:System.out.println("You found a ladder, your new position is 81. ");
                       player1Spot=81;
                       break;
                   case 64: System.out.println("You got bit by a snake, your new position is 60. ");
                       player1Spot=60;
                       break;
                   case 71: System.out.println("You found a ladder, your new position is 91. ");
                       player1Spot=91;
                       break;
                   case 87: System.out.println("You got bit by a snake, your new position is 24. ");
                       player1Spot=24;
                       break;
                   case 93: System.out.println("You got bit by a snake, your new position is 73.");
                       player1Spot=73;
                       break;
                   case 95: System.out.println("You got bit by a snake, your new position is 75. ");
                       player1Spot=75;
                       break;
                   case 99: System.out.println("You got bit by a snake, your new position is 78. ");
                       player1Spot=78;
                       break;
                   default : System.out.println("No ladders or snakes! ");
           }
           System.out.println(); 
           System.out.println("Player 2 it is your turn to roll press any button");
        //adds one to the turn count of player1
        turn1++;
        //takes the next read input from keyboard which intializes the role of the die(random.next
        //Integer out of 6 method
        keyboard.readLine();
         diceRoll=role.nextInt(6);
        //if random # is 0 add 1 because die dont have a zero side so we give the roll a 1
        if(diceRoll==0){
            diceRoll++;
        }
        System.out.println("Player 2 you rolled a " + diceRoll);
        //if statement for what to output to player per what roll they got
        //if the player is for example at 99 and rolls a 5 they went past 100 so they stay at 99
        // and have to wait till next turn for another chance at rolling a 1 to get evenly at 100.
        if((player2Spot+diceRoll)>100){
            System.out.print("You went past 100 you are still at current position and will wait for your next turn");}
        //if players current position plus the dice roll number equal 100 they have won the game for example
        // if position is 95 and player 1 rolls a 5 they have won the game.
        else if((player2Spot+diceRoll)==100){
            System.out.println("You have won the game Player 2, congratulations");
            break;
        }
        else
        {
            //player1Spot= player1Spot+diceRoll
            player1Spot+=diceRoll;
            System.out.println("Player 2 you have moved " +diceRoll+ "spaces and you are now at the "+player2Spot+" square on the board. ");
            System.out.println("Press a key on the keyboard to see if you got bit or if you caught a ladder. ");
            keyboard.readLine();
            //switch statement used to test many differenet possibilites (those being the chances
            // of being bitten or finding a ladder)each case is either a bite or a ladder all dependning
            // on where the roll put the players position
           switch(player2Spot){
                   case 4: System.out.println("You found a ladder, your new position is 14. ");
                   player2Spot=14;
                   break;
                   
                   case 9: System.out.println("You found a ladder, your new position is 31. ");
                       player2Spot=31;
                       break;
                   case 17:System.out.println("You got bit by a snake, your new position is 7. ");
                       player2Spot=7;
                       break;
                   case 20: System.out.println("You found a ladder, your new position is 38. ");
                       player2Spot=38;
                       break;
                   case 28: System.out.println("You found a ladder, your new position is 84. ");
                       player2Spot=84;
                       break;
                   case 40: System.out.println("You found a ladder, your new position is 59. ");
                       player2Spot=59;
                       break;
                   case 51: System.out.println("You found a ladder, your new position is 67. ");
                       player2Spot=67;
                       break;
                   case 54: System.out.println("You got bit by a snake, your new position is 34. ");
                       player2Spot=34;
                       break;
                   case 62: System.out.println("You got bit by a snkake, your new position is 19. ");
                       player2Spot=19;
                       break;
                   case 63:System.out.println("You found a ladder, your new position is 81. ");
                       player2Spot=81;
                       break;
                   case 64: System.out.println("You got bit by a snake, your new position is 60. ");
                       player2Spot=60;
                       break;
                   case 71: System.out.println("You found a ladder, your new position is 91. ");
                       player2Spot=91;
                       break;
                   case 87: System.out.println("You got bit by a snake, your new position is 24. ");
                       player2Spot=24;
                       break;
                   case 93: System.out.println("You got bit by a snake, your new position is 73.");
                       player2Spot=73;
                       break;
                   case 95: System.out.println("You got bit by a snake, your new position is 75. ");
                       player2Spot=75;
                       break;
                   case 99: System.out.println("You got bit by a snake, your new position is 78. ");
                       player2Spot=78;
                       break;
                   default: System.out
                           
                           .println("No snakes or ladders");
           }
        }
        }
    }
    }
}
