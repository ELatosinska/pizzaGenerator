package helpers;

import lombok.Setter;
import model.Pizza;

import java.io.*;
import java.util.List;

public class FileHelper {
    @Setter
    private String filename;
    private PizzaHelper pizzaHelper;

    public FileHelper(String filename) {
        this.filename = filename;
        pizzaHelper = new PizzaHelper();
    }

    public boolean saveListToFile(List<Pizza> pizzas) {
        try(var bw = new BufferedWriter(new FileWriter(filename))) {
            for (var pizza:pizzas) {
                bw.write(pizzaHelper.convertPizzaToString(pizza));
                bw.newLine();
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public List<Pizza> readListFromFile() {
        try(var br = new BufferedReader(new FileReader(filename))) {
            return br.lines()
                    .map(pizzaHelper::convertStringToPizza)
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
