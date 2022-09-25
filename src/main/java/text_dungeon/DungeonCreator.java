package text_dungeon;

public class DungeonCreator {

	private StringBuilder sb = new StringBuilder();

	public String createDungeon() {
		sb.append("---" + "\n");
		sb.append("/   \\" + "\n");
		sb.append("|   |" + "\n");
		sb.append("|   |" + "\n");
		return sb.toString();
	}

}
