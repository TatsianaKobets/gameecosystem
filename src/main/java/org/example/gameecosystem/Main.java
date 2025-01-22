package org.example.gameecosystem;

import java.io.IOException;
import org.example.gameecosystem.logic.Renderer;
import org.example.gameecosystem.logic.MapSimulation;
import org.example.gameecosystem.simulation.Simulation;

public class Main {

  public static void main(String[] args) throws IOException {
    MapSimulation map = new MapSimulation(10, 10);

    Renderer renderer = new Renderer();
    if (map != null && renderer != null) {
      Simulation simulation = new Simulation(map, renderer);
      simulation.startSimulation();
    }
  }
}
