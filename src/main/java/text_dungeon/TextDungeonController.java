package text_dungeon;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class TextDungeonController implements Initializable {

	public static TextDungeonController load() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TextDungeonController.class.getResource("TextDungeon.fxml"));
		loader.load();
		return loader.getController();
	}

	@FXML
	private Parent root;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	public Parent getRoot() {
		return root;
	}

}