public class SeniorOfficer extends BankAuthority{
    @Override
    protected boolean canApprove(int amount){
        return amount<100000;
    }
    @Override
    protected void approveMsg(int amount){
        System.out.println("Senior Officer and Casier approve tk: " + amount);
    }    
}
