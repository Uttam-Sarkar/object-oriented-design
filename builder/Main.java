public class Main {
    public static void main(String[] args) {

       Car defaultCar = new CarBuilder().build();
      System.out.println("Default ");
       defaultCar.displayinfo();
        
        Car customCar = new CarBuilder()
                    .setModel("Toyota Supra")
                    .setEngin("Hybrid")
                    .setColor("Red")
                    .setTransmission("Automatic")
                    .setSunroof(true)
                    .setInfotainment(true)
                    .build();
                    System.out.println("");System.out.println("");
                    System.out.println("Custom ");
                    customCar.displayinfo();
    }
}
