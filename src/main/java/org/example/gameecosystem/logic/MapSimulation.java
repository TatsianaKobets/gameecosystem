package org.example.gameecosystem.logic;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.example.gameecosystem.entity.EntitySimulation;

/**
 * Этот класс представляет собой карту, на которой будут располагаться существа и объекты. Мы
 * используем список для хранения сущностей, а также сохраняем размеры карты.
 */
public class MapSimulation {

  private Map<String, EntitySimulation> entities;
  private int width;
  private int height;
  private Random random;

  public MapSimulation(int width, int height) {
    this.width = width;
    this.height = height;
    this.random = new Random();
    this.entities = new HashMap<>(); // Инициализируем объект entities

  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public Map<String, EntitySimulation> getEntities() {
    return entities;
  }

  public void setEntities(Map<String, EntitySimulation> entities) {
    this.entities = entities;
  }

  public boolean isWithinBounds(int x, int y) {
    return x >= 0 && x < width && y >= 0 && y < height;
  }

  public void addRandomEntities(EntitySimulation entity, int count) {
    int addedCount = 0;

    while (addedCount < count) {
      // Генерируем случайные координаты
      int randomX = random.nextInt(width);
      int randomY = random.nextInt(height);

      // Проверяем, что координаты внутри игрового поля
      if (isWithinBounds(randomX, randomY)) {
        // Создаем уникальный ключ для проверки существования сущности в данной клетке
        String key = randomX + "," + randomY;

        // Проверяем, занята ли клетка
        if (!entities.containsKey(key)) {
          // Устанавливаем случайные координаты сущности
          entity.setX(randomX);
          entity.setY(randomY);
          entities.put(key, entity);
          addedCount++;
        }
      }
    }
  }
}
