public class UltimatePlayer extends Person{
    //variables
    public int jerseyNumber;
    public static int jerseyNumberCounter;
    public String position;

    //Constructor
    public UltimatePlayer(String firstName, String lastName, String position, int jerseyNumber){
        super(lastName, firstName);
        if (position.equalsIgnoreCase("Cutter")) {
            this.position = position;
        } else {
            this.position = "Handler";
        }
        this.jerseyNumber = jerseyNumber;
    }

    //Accessors
    public String getPosition(){
        return position;
    }

    public int getJerseyNumber(){
        return jerseyNumber;
    }

    public int throwDisc(int pow){
        return 4*pow;
    }

    //Mutators
    public String toString(){
        String s = "";
        s += super.toString() + "\n   Jersey #: " + getJerseyNumber() + "\n   Position: " + getPosition();
        return s;
    }
}