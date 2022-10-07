package text_dungeon;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.css.PseudoClass;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

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
	@FXML
	private TextArea mainTa;

	DungeonCreator dc = new DungeonCreator();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		mainTa.setEditable(false);
//		mainTa.setText(dc.createDungeon());
		mainTa.pseudoClassStateChanged(PseudoClass.getPseudoClass("centered"), true);
		starteTastenEventHandler();
	}

	public Parent getRoot() {
		return root;
	}

	private void starteTastenEventHandler() {
		root.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode()) {
					case UP:
						// TODO todo
						mainTa.setText(dc.createDungeon());
					default:
						break;
				}
			}
		});
	}
}
