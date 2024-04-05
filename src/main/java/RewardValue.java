public class RewardValue {
    private double cash;
    private int miles;
    public RewardValue(double cash){
        this.cash = cash;
    }
    public RewardValue(int miles){
        this.miles = miles;

    }
    double getCashValue(){
        try {
            return cash + miles*0.0035;
        }catch (NullPointerException e){
            System.out.println(e);
            return -1.00;
        }
    }
    int getMilesValue() {
        try {
            return (int)  (miles + cash * (1/0.0035));
        }catch (NullPointerException e){
            System.out.println(e);
            return -1;
        }
    }
}
