package com.LogisticRouteTracker;
class Driver {
    String driverId;
    String name;
    RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public void displaySummary() {
        System.out.println("Driver: " + driverId + " - " + name);
        System.out.println("Route Summary:");
        routeHistory.printRoute();

        double dist = routeHistory.computeTotalDistance();
        double penalty = routeHistory.computeTotalPenalty();
        double score = dist - penalty;

        System.out.println("Total Distance: " + dist + " km");
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + score);

        String consistency = routeHistory.checkConsistency() ?
                "All required checkpoints present" : "Critical checkpoints missing";
        System.out.println("Critical Route Check: " + consistency);
    }
}