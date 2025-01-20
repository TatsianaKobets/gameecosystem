package org.example.gameecosystem.object;

import org.example.gameecosystem.entity.Creature;

/**
 * Травоядное, наследуется от Creature.
 * Стремятся найти ресурс (траву), может потратить свой ход на движение в сторону травы,
 * либо на её поглощение.
 */
public class Herbivore extends Creature {

  public Herbivore(int speed, int hp) {
    super(speed, hp);
  }

}
