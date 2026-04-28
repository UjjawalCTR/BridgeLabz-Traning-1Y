package com.LogisticRouteTracker;
class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String id, String name, double dist, int expected, int actual) {
        super(id, name, dist, expected, actual);
    }

    @Override
    public boolean isCritical() { return true; }

    @Override
    public String getType() { return "Delivery"; }

    @Override
    public double calculatePenalty() {
        if (!isDelayed()) return 0.0;
        return (actualDuration - expectedDuration) * 2.0;
    }
}

class FuelCheckpoint extends Checkpoint {
    public FuelCheckpoint(String id, String name, double dist, int expected, int actual) {
        super(id, name, dist, expected, actual);
    }

    @Override
    public boolean isCritical() { return true; }

    @Override
    public String getType() { return "Fuel"; }

    @Override
    public double calculatePenalty() {
        return isDelayed() ? 10.0 : 0.0;
    }
}

class RestCheckpoint extends Checkpoint {
    public RestCheckpoint(String id, String name, double dist, int expected, int actual) {
        super(id, name, dist, expected, actual);
    }

    @Override
    public boolean isCritical() { return false; }

    @Override
    public String getType() { return "Rest"; }

    @Override
    public double calculatePenalty() {
        int delay = actualDuration - expectedDuration;
        return (delay > 30) ? (delay * 0.5) : 0.0;
    }
}