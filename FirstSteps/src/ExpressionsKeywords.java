public class ExpressionsKeywords {

    public static void expressions(int finalScore) {

        finalScore = calculateScore(true, 800, 5, 100);
        displayScore(finalScore);

        finalScore =  calculateScore(true, 10000, 8, 200);
        displayScore(finalScore);

        finalScore = calculateScore(false, 300, 2, 20);
        displayScore(finalScore);

        displayHighScorePosition("Tavinho", calculateHighScorePosition(1500));
        displayHighScorePosition("Mhiloca", calculateHighScorePosition(900));
        displayHighScorePosition("Isis", calculateHighScorePosition(400));
        displayHighScorePosition("Frida", calculateHighScorePosition(10));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score + (levelCompleted * bonus) + 1000;
        return gameOver ? finalScore : -1;
    }

    public static void displayScore(int finalScore) {
        String message = finalScore > 0 ? "Your final score was " + finalScore : "You are still playing...";
        System.out.println(message);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " +
                position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score > 1000) {
            position = 1;
        } else if (score > 500) {
            position = 2;
        } else if (score > 100) {
            position = 3;
        }

        return position;
    }
}
