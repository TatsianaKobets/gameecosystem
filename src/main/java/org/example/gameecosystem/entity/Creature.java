package org.example.gameecosystem.entity;

import org.example.gameecosystem.logic.MapSimulation;

/**
 * Абстрактный класс, наследуется от Entity. Существо, имеет скорость (сколько клеток может пройти
 * за 1 ход), количество HP.
 */
public abstract class Creature extends EntitySimulation {

  private int speed;
  private int hp;

  public Creature(int speed, int hp) {
    this.speed = speed;
    this.hp = hp;
  }

  public void makeMove(MapSimulation map) {
// Генерируем случайное направление для движения
    int dx = (int) (Math.random() * (2 * speed + 1)) - speed; // от -speed до speed
    int dy = (int) (Math.random() * (2 * speed + 1)) - speed; // от -speed до speed

    // Обновляем координаты
    int newX = getX() + dx;
    int newY = getY() + dy;

    // Проверяем границы карты
    if (!map.isWithinBounds(newX, newY)) {
      // Если новое положение за пределами карты, возвращаемся на предыдущую позицию
      return;
    }
    // Ограничиваем координаты внутри игрового поля
    int clampedX = Math.max(0, Math.min(newX, map.getWidth() - 1));
    int clampedY = Math.max(0, Math.min(newY, map.getHeight() - 1));

    setX(clampedX);
    setY(clampedY);
    System.out.println(this + " переместился на " + clampedX + ", " + clampedY);


    setX(newX);
    setY(newY);
  }
}