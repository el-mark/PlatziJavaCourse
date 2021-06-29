public class WhileLoop {
    static boolean isTurnedOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();

        int i = 1;
        while (isTurnedOnLight && i<=10) {
            printSOS();
            i++;
        }
    }

    public static void printSOS() {
        System.out.println("...___...");
    }

    public static boolean turnOnOffLight() {
        isTurnedOnLight = (isTurnedOnLight)?false:true;

        return isTurnedOnLight;
    }
}
