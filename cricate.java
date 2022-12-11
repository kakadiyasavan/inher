public class cricate {

    class player {

        public void batsman(String batsman1, String batsman2) {
            System.out.println("Batsman Name 1 : " + batsman1);
            System.out.println("Batsman Name 2 : " + batsman2);
        }

        public void bowler(String bowler1, String bowler2) {
            System.out.println("bowler Name 1 : " + bowler1);
            System.out.println("bowler Name 2 : " + bowler2);
        }
    }

    public static void main(String[] args) {

        cricate sa = new cricate();
        cricate.player o = sa.new player();
        o.batsman("sachine", "Dhonie");
        o.bowler("Ravindra", "Bumrah");

    }
}