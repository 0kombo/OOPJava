class MyVehicle {
    String brand;
    String model;

    public MyVehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println(brand + " " + model);
    }
}

    class Motorcycle extends MyVehicle {
        int numWheels;
        boolean hasSidecar;

        public Motorcycle(String brand, String model, int numWheels, boolean hasSidecar) {
            super(brand, model);
            this.numWheels = numWheels;
            this.hasSidecar = hasSidecar;
        }

        public void performWheelie() {
            System.out.println("Performing a wheelie!");
        }

        public void honkHorn() {
            System.out.println("Beep beep!");
        }
    }

    class MyBus extends MyVehicle {
        int capacity;
        boolean doubleDecker;

        public MyBus(String brand, String model, int capacity, boolean doubleDecker) {
            super(brand, model);
            this.capacity = capacity;
            this.doubleDecker = doubleDecker;
        }

        public void openDoors() {
            System.out.println("Opening the doors for passengers.");
        }

        public void drive() {
            System.out.println("Driving the bus to the destination.");
        }
    }

    class Trailer extends MyVehicle {
        int capacity;
        boolean hasRamp;

        public Trailer(String brand, String model, int capacity, boolean hasRamp) {
            super(brand, model);
            this.capacity = capacity;
            this.hasRamp = hasRamp;
        }

        public void loadCargo() {
            System.out.println("Loading cargo onto the trailer.");
        }

        public void unloadCargo() {
            System.out.println("Unloading cargo from the trailer.");
        }
    }

    class Boat extends MyVehicle {
        int length;
        boolean sailboat;

        public Boat(String brand, String model, int length, boolean sailboat) {
            super(brand, model);
            this.length = length;
            this.sailboat = sailboat;
        }

        public void setSail() {
            if (sailboat) {
                System.out.println("Setting sail!");
            } else {
                System.out.println("This boat doesn't have sails.");
            }
        }

        public void anchor() {
            System.out.println("Dropping the anchor to stop the boat.");
        }
    }

    // Example Usage
    class MyMain {
        public static void main(String[] args) {
            Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2, false);
            motorcycle.displayInfo();
            motorcycle.performWheelie();
            motorcycle.honkHorn();

            MyBus bus = new MyBus("Mercedes", "Sprinter", 20, true);
            bus.displayInfo();
            bus.openDoors();
            bus.drive();

            Trailer trailer = new Trailer("Utility", "CargoMax", 5000, true);
            trailer.displayInfo();
            trailer.loadCargo();
            trailer.unloadCargo();

            Boat boat = new Boat("Beneteau", "Oceanis 45", 45, true);
            boat.displayInfo();
            boat.setSail();
            boat.anchor();
        }
    }

