package sample;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField textbox;

    @FXML
    private Label label;

    @FXML
    private Button button;

    public void changeLabelWithName(ActionEvent actionEvent) {
        if (textbox.getText() != null) {
            label.setText("Witaj, " + textbox.getText() + "!");
            button.setOnAction(this::changeLabelWithNameByeBye);
        }
        /*try {
            Class<?> clz = Class.forName("sample.Controller");
            Controller ctrl = (Controller) clz.getDeclaredConstructor().newInstance();
            Method m = clz.getMethod("changeLabelWithName", ActionEvent.class);
            Field fld = clz.getField("button");
            fld.setAccessible(true);
            Button b = (Button) fld.get(ctrl);
            fld.setAccessible(false);
            b.setOnAction(e -> {
                try {
                    m.invoke(ctrl, e);
                } catch (Exception ex) {

                }
            });
        } catch (Exception e) {

        }*/
    }

    public void changeLabelWithNameByeBye(ActionEvent actionEvent) {
        if (textbox.getText() != null) {
            label.setText("Zegnaj, " + textbox.getText() + "!");
            button.setOnAction(this::changeLabelWithName);
        }
    }
}
