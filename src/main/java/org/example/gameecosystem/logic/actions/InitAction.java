package org.example.gameecosystem.logic.actions;

import org.example.gameecosystem.entity.object.Grass;
import org.example.gameecosystem.entity.object.Herbivore;
import org.example.gameecosystem.logic.MapSimulation;

public class InitAction implements Action {

  @Override
  public void execute(MapSimulation map) {
    map.addRandomEntities(new Grass(), 55);
    map.addRandomEntities(new Herbivore(1, 55), 5);
  }
}
