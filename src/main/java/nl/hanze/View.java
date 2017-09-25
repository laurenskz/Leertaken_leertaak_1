package nl.hanze;

import javafx.scene.Node;

/**
 * Created by Laurens on 25-9-2017.
 */
public interface View {

    void update(Stock stock, double newPrice);

    Node getNode();
}
