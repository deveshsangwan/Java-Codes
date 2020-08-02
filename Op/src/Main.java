import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            int t = sc.nextInt();
            displayHighScorePosition(s, t);
        }
    }

   public static void displayHighScorePosition(String name, int score){
        System.out.println(name +
                " managed to get into position " +
                CalculateHighScorePosition(score) +
                " on the high score table");
    }

    public static int CalculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        }else if (score >= 500 && score < 1000){
            return 2;
        }else if (score > 100 && score < 500){
            return 3;
        }
        return 4;
    }

}
