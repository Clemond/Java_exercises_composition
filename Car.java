public class Car {

    String brand;
    boolean hasOilOrNot;
    Engine engine; //kopplar ihop Engine med car genom composition. //Vi skapar en instans av "Engine".
    Windows windows; //koppla ihop Windows med car genom composition. //Vi skapar en instans av "Windows".

    public Car() {
        engine = new Engine(); //Vi säger åt programet att när vi skapar ett object av car, skapa upp ett object av engine.
        windows = new Windows();////Vi säger åt programet att när vi skapar ett object av car, skapa upp ett object av windows.
    }

    public void startCar(){   //skapar en metod.
        System.out.println("Starts Engine");   
        engine.engineStarted();  //kör metoden vi skapat i engine.
    }

    public void rollDownWindows(){
        System.out.println("Rolling down windows");
        windows.windowsRolledDown();
    }


}
