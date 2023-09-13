import acm.program.ConsoleProgram;

public class SmallestAndLargest extends ConsoleProgram {
    public void run() {

        final int SENTINEL = 0;

        int smallest = 0;
        int largest = 0;

        while (true) {
            int val = readInt("?");
            if (val == SENTINEL) break;

            if (largest == 0) {
                largest = val ;
                smallest = val;

            }else {
                if (val >= largest) {
                    largest = val;
                } else if (val <= largest) {
                    if (val <= smallest) {
                        smallest = val;
                    }
                }
            }
        }
        if (smallest == 0 && largest == 0){
            println("No largest or smallest to be chosen since you have entered no values.");

        }else {
            println("Largest: " + largest);
            println("Smallest: " + smallest);
        }

        }
    }

