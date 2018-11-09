public class Board {

    //The next 6 lines show the user what their graph looks like, and where coordinates will be placed
    String line1 = "   1   2   3";
    String[] line2 = {"A  "," "," | "," "," |  "," "," "};
    String line3 = "   ----------";
    String[] line4 = {"B  "," "," | "," "," |  "," "," "};
    String line5 = "   ----------";
    String[] line6 = {"C  "," "," | "," "," |  "," "," "};

    int[] xrow1 = { 0, 0, 0};
    int[] xrow2 = { 0, 0, 0};
    int[] xrow3 = { 0, 0, 0};

    int[] orow1 = { 0, 0, 0};
    int[] orow2 = { 0, 0, 0};
    int[] orow3 = { 0, 0, 0};

    boolean Game_Over = false;


    public void GameOver(){

        try {
            if ((xrow1[0] == 1) && (xrow1[1] == 1) && (xrow1[2] == 1)) {
                Game_Over = true;
                System.out.println("Player 1 Wins");
            } else if ((xrow2[0] == 1) && (xrow2[1] == 1) && (xrow2[2] == 1)) {
                Game_Over = true;
                System.out.println("Player 1 Wins");
            } else if ((xrow3[0] == 1) && (xrow3[1] == 1) && (xrow3[2] == 1)) {
                Game_Over = true;
                System.out.println("Player 1 Wins");
            } else if ((xrow1[0] == 1) && (xrow2[0] == 1) && (xrow3[0] == 1)) {
                Game_Over = true;
                System.out.println("Player 1 Wins");
            } else if ((xrow1[1] == 1) && (xrow2[1] == 1) && (xrow3[1] == 1)) {
                Game_Over = true;
                System.out.println("Player 1 Wins");
            } else if ((xrow1[2] == 1) && (xrow2[2] == 1) && (xrow3[2] == 1)) {
                Game_Over = true;
                System.out.println("Player 1 Wins");
            } else if ((xrow1[1] == 1) && (xrow2[2] == 1) && (xrow3[3] == 1)) {
                Game_Over = true;
                System.out.println("Player 1 Wins");
            } else if ((xrow1[3] == 1) && (xrow2[2] == 1) && (xrow3[1] == 1)) {
                Game_Over = true;
                System.out.println("Player 1 Wins");
            } else {
                Game_Over = false;
            }
        }catch(Exception ignore){
            Game_Over = false;
        }


        if(Game_Over == true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    //This Method(printboard) prints the variables to display the default graph
    public void printboard() {
        System.out.println(line1);

        for(int i = 0; i < line2.length; i++){
            System.out.print(line2[i]);
        }
        System.out.println();

        System.out.println(line3);

        for(int i = 0; i < line4.length; i++){
            System.out.print(line4[i]);
        }
        System.out.println();

        System.out.println(line5);

        for(int i = 0; i < line6.length; i++){
            System.out.print(line6[i]);
        }
        System.out.println();
    }

    public void Player(String y_coordinate, int x_coordinate, int Player) {
        System.out.println(y_coordinate + x_coordinate);

        if (Player == 1) {
            if (y_coordinate.equals("a")) {
                if (x_coordinate == 1) {
                    this.line2[1] = "x";
                    xrow1[0] = 1;
                } else if (x_coordinate == 2) {
                    this.line2[3] = "x";
                    xrow1[1] = 1;
                } else if (x_coordinate == 3) {
                    this.line2[5] = "x";
                    xrow1[2] = 1;
                }
            } else if (y_coordinate.equals("b")) {
                if (x_coordinate == 1) {
                    this.line4[1] = "x";
                    xrow2[0] = 1;
                } else if (x_coordinate == 2) {
                    this.line4[3] = "x";
                    xrow2[1] = 1;
                } else if (x_coordinate == 3) {
                    this.line4[5] = "x";
                    xrow2[2] = 1;
                }
            } else if (y_coordinate.equals("c")) {
                if (x_coordinate == 1) {
                    this.line6[1] = "x";
                    xrow3[0] = 1;
                } else if (x_coordinate == 2) {
                    this.line6[3] = "x";
                    xrow3[1] = 1;
                } else if (x_coordinate == 3) {
                    this.line6[5] = "x";
                    xrow3[2] = 1;
                }
            } else {
                System.out.println("INVALID");
            }
        }
        if (Player == 2) {
            if (y_coordinate.equals("a")) {
                if (x_coordinate == 1) {
                    this.line2[1] = "o";
                    orow1[0] = 1;
                } else if (x_coordinate == 2) {
                    this.line2[3] = "o";
                    orow1[1] = 1;
                }
                if (x_coordinate == 3) {
                    this.line2[5] = "o";
                    orow1[2] = 1;
                }
            } else if (y_coordinate.equals("b")) {
                if (x_coordinate == 1) {
                    this.line4[1] = "o";
                    orow2[0] = 1;
                } else if (x_coordinate == 2) {
                    this.line4[3] = "o";
                    orow2[1] = 1;
                }
                if (x_coordinate == 3) {
                    this.line4[5] = "o";
                    orow2[2] = 1;
                }
            } else if (y_coordinate.equals("c")) {
                if (x_coordinate == 1) {
                    this.line6[1] = "o";
                    orow3[0] = 1;
                } else if (x_coordinate == 2) {
                    this.line6[3] = "o";
                    orow3[1] = 1;
                } else if (x_coordinate == 3) {
                    this.line6[5] = "o";
                    orow3[2] = 1;
                }
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
