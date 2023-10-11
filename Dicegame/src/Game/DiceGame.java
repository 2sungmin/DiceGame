package Game;

import java.util.Random;

class Die {
    private Random random;
    private int sides;
    private int faceValue;

    public Die(int sides) {
        this.sides = sides;
        random = new Random();
        faceValue = 1; 
    }

    public int roll() {
        faceValue = random.nextInt(sides) + 1; 
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }
}

public class DiceGame {
    private Die die;

    public DiceGame() {
        die = new Die(6); 
    }

    public void playGame(String player1Name, String player2Name) {
        int player1Dice1 = die.roll();
        int player1Dice2 = die.roll();
        int player1Total = player1Dice1 + player1Dice2;

        int player2Dice1 = die.roll();
        int player2Dice2 = die.roll();
        int player2Total = player2Dice1 + player2Dice2;

        System.out.println(player1Name + "�� �ֻ���: " + player1Dice1 + "�� " + player1Dice2);
        System.out.println(player1Name + "�� ��: " + player1Total);

        System.out.println(player2Name + "�� �ֻ���: " + player2Dice1 + "�� " + player2Dice2);
        System.out.println(player2Name + "�� ��: " + player2Total);

        if (player1Total > player2Total) {
            System.out.println(player1Name + "�� �¸�!");
        } else if (player1Total < player2Total) {
            System.out.println(player2Name + "�� �¸�!");
        } else if (player1Total == player2Total) {
            if (player1Dice1 > player2Dice1) {
                System.out.println(player1Name + "�� �¸�!");
            } else if (player1Dice1 < player2Dice1) {
                System.out.println(player2Name + "�� �¸�!");
            } else {
                System.out.println("���º��Դϴ�.");
            }
        }
    }

    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        System.out.println("�ֻ��� ������ �����մϴ�!");
        game.playGame("player1", "player2");
    }
}