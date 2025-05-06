public class WithdrawalDemo {
    public static void main(String[] args) {
        BankAuthority casier = new Casier() ;
        BankAuthority seniorOfficer = new SeniorOfficer();
        BankAuthority manager = new Manager();

        casier.setNextAuthority(seniorOfficer);
        seniorOfficer.setNextAuthority(manager);

        casier.requestApproval(5000);
        casier.requestApproval(50000);
        casier.requestApproval(500000);
    }
    
}
