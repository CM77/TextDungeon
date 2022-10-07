package text_dungeon;

public class DungeonCreator {

	private StringBuilder sb = new StringBuilder();

	public String createDungeon() {

		sb.append(createRoof());
		sb.append("\n");
		sb.append(createWalls());
		return sb.toString();
	}

	private String createRoof() {
		String text = "_";
		for (int i = 0; i < 3; i++) {
			text += "_";
		}
		return text;
	}

	private String createWalls() {
		String text = "";
		for (int i = 0; i < 3; i++) {
			text += "|\t|\n";
		}
		return text;
	}

}
