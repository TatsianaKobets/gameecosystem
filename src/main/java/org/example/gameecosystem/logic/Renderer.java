package org.example.gameecosystem.logic;

import java.io.IOException;
import org.example.gameecosystem.entity.EntitySimulation;
import org.example.gameecosystem.entity.object.Grass;
import org.example.gameecosystem.entity.object.Herbivore;

/**
 * Этот интерфейс представляет собой рендерер, который ответственен за визуализацию состояния поля.
 */
public class Renderer {

  public void render(MapSimulation map) throws IOException {
    if (map != null) {
      System.out.println("--------------------");
      for (int i = 0; i < map.getHeight(); i++) {
        for (int j = 0; j < map.getWidth(); j++) {
          boolean entityFound = false;
          for (EntitySimulation entity : map.getEntities().values()) {
            if (entity.getX() == j && entity.getY() == i) {
              if (entity instanceof Herbivore) {
                System.out.print("H");
              } else if (entity instanceof Grass) {
                System.out.print("G");
              }
              entityFound = true;
              break;
            }
          }
          if (!entityFound) {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
      System.out.println("--------------------");
    }
  }
}