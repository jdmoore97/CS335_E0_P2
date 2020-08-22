public class Problem2 {
    public static void main(String[] args){
        final double PI_8 = 3.14159265; //Pi to 8 decimal places
        int terms = 0;
        final int MAX_TRIES = Integer.MAX_VALUE; //Limit tries to avoid infinite loop
        double n = 1;
        double piEstimate = 0;
        double sum = 0;
        while(terms != MAX_TRIES){
            if(terms % 2 != 0){ //Odd terms are negative
                sum += -1 * (1 / n);
            }
            else{ //Even terms are positive
                sum += (1 / n);
            }
            piEstimate = sum * 4;
            if(Truncate_8(piEstimate) == PI_8){
                break;
            }
            terms++;
            n += 2;
        }
        System.out.println("Final Estimate: " + piEstimate + "\n" + "Terms Needed: " + terms);
    }
    //*****Truncate_8*****
    //Truncates a double to 8 decimal places and then returns the result
    static double Truncate_8(double rawDouble){
        rawDouble *= 100000000;
        rawDouble = Math.floor(rawDouble) / 100000000;
        return rawDouble;
    }
}

