package org.example.gameecosystem.entity.object;

import org.example.gameecosystem.entity.Creature;
import org.example.gameecosystem.entity.EntitySimulation;
import org.example.gameecosystem.logic.MapSimulation;

/**
 * Травоядное, наследуется от Creature.
 * Стремятся найти ресурс (траву), может потратить свой ход на движение в сторону травы,
 * либо на её поглощение.
 */
public class Herbivore extends Creature {

  public Herbivore(int speed, int hp) {
    super(speed, hp);
  }

  @Override
  public void makeMove(MapSimulation map) {
    super.makeMove(map);
  }
}
