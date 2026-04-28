package com.LogisticRouteTracker;
public class RouteTrackerSystem {
    public static void main(String[] args) {
        Driver d = new Driver("D1204", "Kavita Nair");

        // Adding Sample Data [cite: 44, 45, 46, 47]
        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 40.0, 60, 70));
        d.routeHistory.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20.0, 15, 15));
        d.routeHistory.addCheckpoint(new RestCheckpoint("C3", "Motel X", 10.0, 30, 65));
        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 50.0, 45, 60));

        d.displaySummary();
    }
}