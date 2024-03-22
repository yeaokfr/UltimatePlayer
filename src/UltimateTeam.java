import java.util.ArrayList;

public class UltimateTeam {
    public static void main(String[] args){
        //variables
        ArrayList<UltimatePlayer> players = new ArrayList<UltimatePlayer>();
        ArrayList <Coach> coaches = new ArrayList<Coach>();

        Coach c1 = new Coach("Mr", "Boolean", "Head Coach");
        coaches.add(c1);

        UltimatePlayer p1 = new UltimatePlayer("Emory", "George", "Cutter", 0);
        Captain p2 = new Captain("Nick", "Beres", "Handler", 9, true);
        players.add(p1);
        players.add(p2);
        getCutters(players);
    }

    public static void getCutters(ArrayList<UltimatePlayer> players) {
        for (UltimatePlayer p : players) {
            if (p.getPosition().equals("Cutter")) {
                System.out.println(p);
            }
        }
    }

    public static void getHandlers(ArrayList<UltimatePlayer> players) {
        for (UltimatePlayer p : players) {
            if (p.getPosition().equals("Handler")) {
                System.out.println(p);
            }
        }
    }

    public String toString(ArrayList<UltimatePlayer> players){
        String s = "";
        s += super.toString();
        return s;
    }
}