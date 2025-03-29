module io.modular.example {
	requires java.desktop;
	requires java.logging;
    requires javafx.graphics;
    requires javafx.controls;
	requires javafx.media;
	requires javafx.swing;
    requires javafx.fxml;
	
	requires org.apache.groovy;

	opens io.modular.example to javafx.fxml;

    exports io.modular.example;	
}



