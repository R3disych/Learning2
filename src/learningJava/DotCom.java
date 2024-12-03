package learningJava;

public class DotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    public String checkYourSelf(String inputCell) {
        int guess = Integer.parseInt(inputCell);
        String result = "Мимо";
        for(int cell : locationCells) {
            if(guess == cell){
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }

    public void setLocation(int[] loc) {
        locationCells = loc;
    }
}