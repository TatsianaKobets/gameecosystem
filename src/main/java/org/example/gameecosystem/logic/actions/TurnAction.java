package org.example.gameecosystem.logic.actions;

import org.example.gameecosystem.entity.EntitySimulation;
import org.example.gameecosystem.entity.object.Herbivore;
import org.example.gameecosystem.logic.MapSimulation;

/**
 * класс для действий на каждом ходу
 */
public class TurnAction implements Action {

  @Override
  public void execute(MapSimulation map) {
    for (EntitySimulation entity : map.getEntities().values()) {
      // Выполнение ходов для живых сущностей
      if (entity instanceof Herbivore) {
        ((Herbivore) entity).makeMove(map);
      }

    }
  }
}