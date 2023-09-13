import acm.program.ConsoleProgram;

public class PossibilitiesOfTwo6SidedDice extends ConsoleProgram {
    public void run() {

        final int NUM_OF_DICE1 = 1;
        final int NUM_OF_DICE2 = 1;
        final int NUM_OF_SIDED = 6;

        setFont("Courier New-15");
        println("Possibilities Of Two Dice ");
        println();

        for (int i = NUM_OF_DICE1; i <NUM_OF_SIDED ; i++) {
            for (int j = NUM_OF_DICE2; j <NUM_OF_SIDED ; j++) {
                print("("+i+","+j+")"+"  ");
            }
            println();
        }




    }
}

