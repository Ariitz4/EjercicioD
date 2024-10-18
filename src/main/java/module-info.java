module es.aritzherrero.ejerciciod {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.aritzherrero.ejerciciod to javafx.fxml;
    exports es.aritzherrero.ejerciciod;
    opens es.aritzherrero.ejerciciod.controlador to javafx.fxml;
    opens es.aritzherrero.ejerciciod.modelo to javafx.fxml, javafx.base;
}