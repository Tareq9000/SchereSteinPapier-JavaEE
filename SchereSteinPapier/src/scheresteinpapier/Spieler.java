package scheresteinpapier;

public class Spieler {
	
	private String name;
	private int score;
	private static int anzSpieler;
	private String lastanswer;
	private static int amzug;

	public String getLastanswer() {
		return lastanswer;
	}

	public void setLastanswer(String lastanswer) {
		this.lastanswer = lastanswer;
	}

	public static int getAnzSpieler() {
		return anzSpieler;
	}

	public static void setAnzSpieler(int anzSpieler) {
		Spieler.anzSpieler = anzSpieler;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public static int getAmzug() {
		return amzug;
	}

	public static void setAmzug(int amzug) {
		Spieler.amzug = amzug;
	}
	
	
}
