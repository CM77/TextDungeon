package text_dungeon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TextDungeonApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("TextDungeon.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add("text_dungeon/stylesheet.css");
		primaryStage.setTitle("Text Dungeon 1.0.0");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
