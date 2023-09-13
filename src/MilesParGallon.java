import acm.program.ConsoleProgram;

public class MilesParGallon extends ConsoleProgram {
    public void run() {
        setFont("Courier New-20");
        final int SENTINEL= -1;

        while (true) {

            int initialMiles = readInt("Initial Miles : ");
            if (initialMiles == -1){
                println("Bye..");
                break;
            }
            int milesToNextTravel = readInt("Miles To Next Travel : ");
            int finalMiles = initialMiles + milesToNextTravel;
            println("Final Miles : " + finalMiles);
            int gallons = readInt("Gallons : ");
            double milesParGallons = milesToNextTravel / gallons;
            println("Miles Par Gallons : " + milesParGallons);
            println();


        }


    }
}
