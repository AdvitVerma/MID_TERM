/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;
import status.StausUser.STATUS;

/**
 * This class takes String input from user and calls method statusDetail to
 * print the status of User-Rejected,Pending,Processing and Approved. if the
 * input is not given in String, program will accept and produce wrong results.
 * Use enumerators to avoid input errors and print the status details.
 *
 * @author srinivsi
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the user status code (0,1,2,3) ");

            int num = in.nextInt();
            if (num == 0 || num == 1 || num == 2 || num == 3) {

                switch (num) {
                    case 0:
                        System.out.println("REJECTED");
                        break;
                    case 3:
                        System.out.println("APPROVED!!");
                        break;
                    case 1:
                        System.out.println("PROCESSING!");
                        break;
                    case 2:
                        System.out.println("PENDING!");
                        break;

                }

            }
            
            
            else
                System.out.println("Invalid code entered");

            //StausUser(STATUS,status);
            StausUser t = new StausUser();

            //String status =in.next();
            //t.statusDetail(status);
        }

    }
}
