module co.edu.uniquindio.proyecto {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.proyecto to javafx.fxml;
    exports co.edu.uniquindio.proyecto;
}
