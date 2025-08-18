public class MakingDifference2{
public static void main(String[] args){

getEncryptedFormOf();

}


public static void getEncryptedFormOf(){
    long currentWorldPopulation = 8200000000L;
    final double ANNUAL_GROWTH_RATE = 0.85 / 100.0;
    long currentPopulation = currentWorldPopulation;
    System.out.println("Year\tWorld Population\tNumerical Increase");
    for(int number = 1; number <= 75; number++){
        long annualPopulationIncrease = (long) (currentPopulation * ANNUAL_GROWTH_RATE);
        long numericalIncrease = annualPopulationIncrease;
        currentPopulation += annualPopulationIncrease;
        System.out.printf("%d\t%d\t%d%n", number, currentPopulation, numericalIncrease);
        if(currentPopulation >= 2 * 8200000000L){
            System.out.printf("Population doubled in %d years%n", number);
            break;
        }
    }
}









}








