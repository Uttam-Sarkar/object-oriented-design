public abstract class BankAuthority {
    protected BankAuthority nextAuthority;

    public void setNextAuthority(BankAuthority nextAuthority){
        this.nextAuthority  = nextAuthority;
    }

    public void requestApproval(int amount){
        if(canApprove(amount)){
            approveMsg(amount);
        }else if(nextAuthority != null){
            nextAuthority.requestApproval(amount);
        }else{
            System.out.println("Amount Declined");
        }

    }


    protected abstract boolean canApprove(int amount);
    protected abstract void approveMsg(int amount);

    
}
