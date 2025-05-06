public class Casier extends BankAuthority{
    @Override
    protected boolean canApprove(int amount){
        return amount<10000;
    }
    @Override
    protected void approveMsg(int amount){
        System.out.println("Casier approve tk: " + amount);
    }    
}
