import acm.program.ConsoleProgram;

public class Diamond extends ConsoleProgram {
    public void run() {
        int widthOfDiamond = readInt("Enter the width of diamond : ");

        int rows = widthOfDiamond;
        int halfOfRows = ( widthOfDiamond / 2 )  ;

        // for first row
        for (int i = 0; i < widthOfDiamond ; i++) {
            print("*");

        }
        println();

        for (int i =  0; i < halfOfRows  ; i++) {
            for (int j = 0; j < halfOfRows - i ; j++) {
                print("*");
            }
            for (int j = 0; j < 2 * i + 1 ; j++) {
                print(" ");
            }
            for (int j = 0; j < halfOfRows - i ; j++) {
                print("*");
            }
            println();
        }
        for (int i = halfOfRows - 2 ; i >= 0 ; i--) {
            for (int j = 0; j < halfOfRows - i ; j++) {
                print("*");
            }
            for (int j = 0; j < 2 * i + 1 ; j++) {
                print(" ");
            }
            for (int j = 0; j < halfOfRows - i ; j++) {
                print("*");
            }
            println();
        }

        for (int i = 0; i < widthOfDiamond; i++) {
            print("*");
        }

    }

}
