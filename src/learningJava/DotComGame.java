package learningJava;

import java.util.Scanner;

public class DotComGame {
    public static void main(String[] args) {
        int numOfGuess = 0;
        DotCom site = new DotCom();

        int randomNum = (int) (Math.random() * 4);
        int[] location = new int[]{randomNum, randomNum+1, randomNum+2};
        site.setLocation(location);

        boolean isAlive = true;
        while(isAlive == true){
            System.out.println("Введите число");
            Scanner in = new Scanner(System.in);
            String inputCell = in.nextLine();
            numOfGuess++;
            String result = site.checkYourSelf(inputCell);
            if(result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuess + " попыток(ки)");
            }
        }
    }
}
