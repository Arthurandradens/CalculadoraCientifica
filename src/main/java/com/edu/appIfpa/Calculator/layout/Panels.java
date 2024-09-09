package com.edu.appIfpa.Calculator.layout;

import com.edu.appIfpa.Calculator.core.ButtonsListManager;
import com.edu.appIfpa.Calculator.model.PanelButtons;

import java.awt.event.ActionListener;

public class Panels {

    private final ButtonsListManager buttonsListManager = new ButtonsListManager();
    private final ActionListener actionListeners;
    private PanelButtons numberPanel;
    private PanelButtons controllerPanel;
    private PanelButtons operatorPanel;
    private PanelButtons scientificPanel;
    private boolean scientificActivated = false;

    public Panels(ActionListener actionListener) {
        this.actionListeners = actionListener;
        createPanels();
    }
    private void createPanels() {
        numberPanel = new PanelButtons(
                buttonsListManager.getNumberButtons(),
                new int[]{4, 3, 10, 10},
                actionListeners
        );
        operatorPanel = new PanelButtons(
                buttonsListManager.getOperatorButtons(),
                new int[]{4, 1, 10, 10},
                actionListeners
        );
        controllerPanel = new PanelButtons(
                buttonsListManager.getControllerButtons(),
                new int[]{1, 3, 10, 10},
                actionListeners
        );
        scientificPanel = new PanelButtons(
                buttonsListManager.getScientificButtons(),
                new int[]{3, 3, 10, 10},
                actionListeners
        );
    }

    public PanelButtons getNumberPanel() {
        return numberPanel;
    }
    public PanelButtons getControllerPanel() {
        return controllerPanel;
    }
    public PanelButtons getOperatorPanel() {
        return operatorPanel;
    }
    public PanelButtons getScientificPanel() {
        return scientificPanel;
    }


    public ButtonsListManager getButtonsListManager() {
        return buttonsListManager;
    }

    public boolean isScientificActivated() {
        return scientificActivated;
    }

    public void setScientificActivated(boolean scientificActivated) {
        this.scientificActivated = scientificActivated;
    }
}
