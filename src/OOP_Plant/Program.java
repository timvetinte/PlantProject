package OOP_Plant;

import javax.swing.*;

public class Program {

    public static void Start() {
        boolean found;
        while (true) {
            found = false;

            String userInput =
                    JOptionPane.showInputDialog(null, "Enter name of plant or type 'Quit' :");
            if (userInput == null) {
                break;
            }
            if (userInput.isBlank()) {
                JOptionPane.showMessageDialog(null, "Please enter a name.");
                continue;
            }
            if (userInput.equalsIgnoreCase("quit")) {
                break;
            }

            for (Plant p : Plant.getPlantList()) {

                if (p.getName().equalsIgnoreCase(userInput)) {
                    JOptionPane.showMessageDialog(null, p.getName() + " (" + p.getType() + ") needs "
                            + p.liquidAmount() + " " + p.getMeasurement() + "s of " + p.getLiquid() + " per day.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(null, "No plant with that name exists.");
            }
        }
    }
}
