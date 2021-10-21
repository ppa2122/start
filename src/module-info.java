/**
 * Created by pwilkin on 14.10.2021.
 */
module PPA {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens sample to javafx.graphics, javafx.fxml;
}