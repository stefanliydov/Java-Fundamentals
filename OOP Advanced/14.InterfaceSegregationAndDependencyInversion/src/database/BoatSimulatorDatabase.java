package database;

import contracts.Modelable;
import contracts.Repository;
import models.MotorBoat;

public class BoatSimulatorDatabase {
    Repository<MotorBoat> boats;
    Repository<Modelable> engines;

    public BoatSimulatorDatabase()
    {
        this.setBoats(new database.Repository());
        this.setEngines(new database.Repository());
    }

    public Repository<MotorBoat> getBoats() {
        return this.boats;
    }

    private void setBoats(Repository<MotorBoat> boats) {
        this.boats = boats;
    }

    public Repository<Modelable> getEngines() {
        return this.engines;
    }

    private void setEngines(Repository<Modelable> engines) {
        this.engines = engines;
    }
}
