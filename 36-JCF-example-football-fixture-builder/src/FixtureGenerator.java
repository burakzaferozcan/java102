import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator {
    public static void generateFixture(List<String> teams) {
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        int numTeams = teams.size();
        int numRounds = (numTeams - 1) * 2;
        int matchesPerRound = numTeams / 2;

        List<String> home = new ArrayList<>();
        List<String> away = new ArrayList<>();

        for (int i = 0; i < numTeams - 1; i++) {
            for (int j = 0; j < matchesPerRound; j++) {
                home.add(teams.get(j));
                away.add(teams.get(numTeams - 1 - j));
            }
            Collections.rotate(teams.subList(1, teams.size()), 1);
        }

        for (int i = 0; i < numRounds / 2; i++) {
            System.out.println("Round " + (i + 1));
            for (int j = 0; j < matchesPerRound; j++) {
                System.out.println(home.get(i * matchesPerRound + j) + " vs " + away.get(i * matchesPerRound + j));
            }
            System.out.println();
        }

        for (int i = 0; i < numRounds / 2; i++) {
            System.out.println("Round " + (i + 1 + numRounds / 2));
            for (int j = 0; j < matchesPerRound; j++) {
                System.out.println(away.get(i * matchesPerRound + j) + " vs " + home.get(i * matchesPerRound + j));
            }
            System.out.println();
        }
    }
}
