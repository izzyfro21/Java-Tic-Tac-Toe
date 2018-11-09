import java.util.Scanner;

public class main {

    public static void Player(int player, Board P ){
        String placementa;
        int placementb;

        if(player == 1){
            System.out.println("Turn: Player One");
        }else{
            System.out.println("Turn: Player Two");
        }
        //The next 4 lines get input for the first variable of the coordinate
        Scanner user_input = new Scanner(System.in);
        System.out.print("What is the first variable (Must be either A, B, or C): ");
        placementa = user_input.next().toLowerCase();

        //The next 4 lines get input for the Second variable of the coordinate
        Scanner user_input2 = new Scanner(System.in);
        System.out.print("What is the second variable (Must be either 1, 2, 3): ");
        placementb = user_input2.nextInt();

        P.Player(placementa, placementb, player);
        P.printboard();
        P.GameOver();
    }


    public static void main(String[] args) {

        Board P = new Board();
        Board board = new Board(); //Creates a variable for the board class
        board.printboard(); //Prints the board created in the class board
        int Player;

        //A for loop to ask the tic-tac-toe coordinates multiple times
        for(int i = 0; i<= 5; i++) {
            Player = 1;
            Player(Player, P);
            if(P.Game_Over == true){
                break;
            }

            Player = 2;
            Player(Player, P);
            if(P.Game_Over == true){
                break;
            }

        }
    }
}
