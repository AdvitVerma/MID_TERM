
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 *
 * @author srinivsi
 * modifier: ADVIT VERMA
 */
public class StausUser {
    private STATUS status;

    enum STATUS {

        REJECTED,
        APPROVED,
        PENDING,
        PROCESSING
    }

    public StausUser() {
        STATUS status;
    }

    public StausUser(STATUS status)
    {
        this.status = status;
    }

    public void statusDetail(String code) {

        switch (STATUS.valueOf(code.toUpperCase())) {
            case REJECTED:
                System.out.println("REJECTED!");
                break;
            case APPROVED:
                System.out.println("APPROVED!!");
                break;
            case PENDING:
                System.out.println("PROCESSING!");
                break;
            case PROCESSING:
                System.out.println("PENDING!");
                break;
        }
        
        
        
    }

}
