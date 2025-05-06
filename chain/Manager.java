public class Manager extends BankAuthority{
    @Override
    protected boolean canApprove(int amount){
        return amount<1000000;
    }
    @Override
    protected void approveMsg(int amount){
        System.out.println("Manager and Senior Officer approve tk: " + amount);
    }    
}
