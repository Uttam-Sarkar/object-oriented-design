public abstract class WithdrawalLoger {
    public static int casier = 1;
    public static int senior_officer = 2;
    public static int manager = 3;
 
    protected int level;
 
    //next element in chain or responsibility
    protected WithdrawalLoger nextLoger;
 
    public void setNextLoger(WithdrawalLoger nextLoger){
       this.nextLoger = nextLoger;
    }
 
    public void logMessage(int level, String message){
       if(this.level <= level){
          write(message);
       }
       if(nextLoger !=null){
         nextLoger.logMessage(level, message);
       }
    }
 
    abstract protected void write(String message);
        
}