module JavaFX1 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
	
	opens gui to javafx.graphics, javafx.fxml;
	
	exports gui;
}
