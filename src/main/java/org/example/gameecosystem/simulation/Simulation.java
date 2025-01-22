package org.example.gameecosystem.simulation;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.example.gameecosystem.logic.actions.Action;
import org.example.gameecosystem.logic.actions.InitAction;
import org.example.gameecosystem.logic.Renderer;
import org.example.gameecosystem.logic.actions.TurnAction;
import org.example.gameecosystem.logic.MapSimulation;

/**
 * Этот класс представляет собой главный класс приложения,
 * который включает в себя карту, счётчик ходов, рендерер поля и список действий.
 * Мы можем добавлять действия перед стартом симуляции и на
 * каждом ходу.
 */
public class Simulation {

  private MapSimulation map;
  private Renderer renderer;
  private List<Action> initActions;
  private List<Action> turnActions;

  public Simulation(MapSimulation map, Renderer renderer) {
    this.map = map;
    this.renderer = renderer;
    this.initActions = new ArrayList<>();
    this.turnActions = new ArrayList<>();

    // Добавляем действия
    initActions.add(new InitAction());
    turnActions.add(new TurnAction());
  }

  public void startSimulation() throws IOException {
    // Выполняем инициализационные действия
    for (Action action : initActions) {
      action.execute(map);
    }

    while (true) {
      // Выполняем действия на каждом ходу
      for (Action action : turnActions) {
        action.execute(map);
      }

      // Рендерим состояние карты
      renderer.render(map); // Обновление экрана после каждого хода

      try {
        Thread.sleep(1000); // Пауза между кадрами
      } catch (InterruptedException e) {
        System.out.println("Ошибка паузы");
      }
    }
  }
}
