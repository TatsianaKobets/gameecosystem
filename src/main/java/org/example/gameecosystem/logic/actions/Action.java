package org.example.gameecosystem.logic.actions;

import org.example.gameecosystem.logic.MapSimulation;

/**
 * Этот интерфейс представляет собой действие, которое можно выполнить над картой.
 */
public interface Action {

  void execute(MapSimulation map);
}
