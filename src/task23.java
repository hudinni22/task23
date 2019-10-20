public class task23 {
    public static void main(String[] args) {
        double NewScore = calculateScore(8, 15);
        calculateScore(343);
        double cm = calculateScore(6,0);
        if (cm<0.0)
        {
            System.out.println("Invalid Parameters");
        }

        calculateScore(58567);
    }


    public static double calculateScore(double feet, double inches){

        double cm = (feet * 30.5 + inches * 2.54);
        if(feet>0 && inches>0 && inches<=12)
        {
            System.out.println(feet + " feet" + " and " +
                    inches + " inches" + " is equal to: " + (feet * 30.5 + inches * 2.54) + " cm");
        }
        else
        {
            System.out.println("invalid values");
            return -1;
        }
        return cm;
    }

    public static double calculateScore(double inches){
        double feet = (int)inches/12;
        double remainienInches = (int)inches%12;

        if(inches>=0)
        {
            System.out.println(inches + " inches is equal to: " +
                    feet + " feet" + " and " + remainienInches + " inches");
        }
        else {
            return -1;
        }
        return calculateScore(feet, remainienInches);
    }


}
