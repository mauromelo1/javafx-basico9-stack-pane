package application;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent raiz = null;
			raiz = new TesteStackPane();

			Scene principal = new Scene(raiz, 800, 600);
			primaryStage.setScene(principal);
			primaryStage.setTitle("Gerenciadores de Layout");
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
