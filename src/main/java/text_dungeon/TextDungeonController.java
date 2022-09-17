package text_dungeon;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;

public class TextDungeonController implements Initializable {

	public static TextDungeonController load() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TextDungeonController.class.getResource("TextDungeon.fxml"));
		loader.load();
		return loader.getController();
	}

	@FXML
	private Parent root;
	@FXML
	private Label rauminfoLb;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	public Parent getRoot() {
		return root;
	}

}
