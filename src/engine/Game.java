package engine;

import java.io.IOException;
import java.util.ArrayList;

public class Game {
	private Player player;
	private ArrayList<City> availableCities;
	private ArrayList<Distance> distances;
	private final int maxTurnCount = 30;
	private int currentTurnCount;

	public Game(String playerName, String playerCity) throws IOException {
		this.player = new Player(playerName);
		this.currentTurnCount = 1;
		this.availableCities = new ArrayList<City>();
		this.distances = new ArrayList<Distance>();

	}
	public void loadArmy(String cityName,String path) throws IOException{
		engine.ReadingCSVFile.readFile(cityName+'.'+path);
	}
	private void loadCitiesAndDistances() throws IOException{
		
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getCurrentTurnCount() {
		return currentTurnCount;
	}

	public void setCurrentTurnCount(int currentTurnCount) {
		this.currentTurnCount = currentTurnCount;
	}

	public ArrayList<City> getAvailableCities() {
		return availableCities;
	}

	public ArrayList<Distance> getDistances() {
		return distances;
	}

	public int getMaxTurnCount() {
		return maxTurnCount;
	}

}
