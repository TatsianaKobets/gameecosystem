package org.example.gameecosystem.entity;

/**
 * Абстрактный класс, наследуется от Entity.
 * Существо, имеет скорость (сколько клеток может пройти
 * за 1 ход), количество HP.
 */
public abstract class Creature extends EntitySimulation {
private int speed;
private int hp;

  public Creature(int speed, int hp) {
    this.speed = speed;
    this.hp = hp;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

}
