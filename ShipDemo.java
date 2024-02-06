public class ShipDemo {
    public static void main(String[] args) {
        
        Ship[] ships = new Ship[4];
        ships[0] = new CruiseShip("CruiseShip1", "1999", 3000);
        ships[1] = new CargoShip("CargoShip1", "2005", 50000);
        ships[2] = new CruiseShip("CruiseShip2", "2010", 1500);
        ships[3] = new CargoShip("CargoShip2", "2000", 60000);
 
        for (Ship ship : ships) {
            ship.display();
        }

        CruiseShip originalCruiseShip = new CruiseShip("Original Cruise", "1995", 2500);
        CruiseShip copyCruiseShip = new CruiseShip(originalCruiseShip);
        System.out.println("Original: " + originalCruiseShip);
        System.out.println("Copy: " + copyCruiseShip);

    }    
}
