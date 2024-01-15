package de.unistuttgart.iste.sqa.pse.sheet11.presence.tournamenttracker;

public class Main {

	public static void main(final String[] args) {
		// TODO implement presence exercise 1 (a) here
		TTServer server = TTServer.getInstance();

		Tournament tournament = server.createTournament("MiniLänderCup");
		Team germany = tournament.registerTeam("Deutschland");
		Team netherland = tournament.registerTeam("Niederlande");
		Team spain = tournament.registerTeam("Spanien");

		Game germanyAgainstNetherland = tournament.createGame(germany, netherland);
		Game germanyAgainstSpain = tournament.createGame(germany, spain);
		Game spainAgainstNetherland = tournament.createGame(spain, netherland);

		germanyAgainstNetherland.storeResult(3, 0);
		germanyAgainstSpain.storeResult(7,1);
		spainAgainstNetherland.storeResult(6, 1);

	}
}
