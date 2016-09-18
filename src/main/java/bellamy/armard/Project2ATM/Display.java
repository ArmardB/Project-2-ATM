package bellamy.armard.Project2ATM;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class Display {

    public void printWelcomeSCreen(){
        System.out.println("                                 ...                                                        ");
        System.out.println("                                 .OO.                                                       ");
        System.out.println("                                 .OOO..           ..                                        ");
        System.out.println("                                 .OOOOO.          ..                                        ");
        System.out.println("                                 .OOOOO.          +7. .                                     ");
        System.out.println("                            ......OOOOO......  ..,777..                                     ");
        System.out.println("                            ..OOOOOOOOOOOOO..  ..77777.                                     ");
        System.out.println("                            ...OOOOOOOOOO8Z  ...7777777..                                   ");
        System.out.println("                            ....OOOOOOOOO+ . ..777777777...                                 ");
        System.out.println("                               .~OOOOOOOO.   .77777777777..                                 ");
        System.out.println("                                 ZOOOOOO   ..777777777777I.                                 ");
        System.out.println("                                 .O8OO8.    .....77777.....                                 ");
        System.out.println("                                  .8OO..       ..77777                                      ");
        System.out.println("                                    O.         . 77777                                      ");
        System.out.println("                                                 7777.                                      ");
        System.out.println("                                                 .777.                                      ");
        System.out.println("                                                   ...                                      ");
        System.out.println("  ......  .  .....  .......       ...  ...       ....           .       ....... ..          ");
        System.out.println("  .........  .....  .......        .......       .....      ......      ..........          ");
        System.out.println("  ..OOOOOO.  ..OO.  ..OOOO88..   .:8OOOO8O..  .:8OOOOO8.    .OOOOOO...  .8OOOOOO..          ");
        System.out.println("    ...OO..  ..OO.  ..OO..?OO.  .Z8O.  .O.  ..$OO....O8O..  .OO. .OO8.  .8OO....            ");
        System.out.println("    ..OO...  ..OO.  ..OO. .OO.  .OO..  ...  ..OO.... .OO..  .OO. ..OO.  .8O8....            ");
        System.out.println("    .OO,.    ..OO.  ..OOOOOOO.  .OO,.  ...  ..OO~. ...OO..  .OO. ..8O.  .8OOOOOO..          ");
        System.out.println("  ..8O8....  ..OO.  ..OOO...    ..OO=...OO..  .O8+...OO8    .OO..7OOO.  .8O8.  ...          ");
        System.out.println("   OOOOOOO7  ..OO.  ..OO....    ...OOOOOO...  ..OOOOOO..    .OOOOO8...  .8OOOOOO..          ");
        System.out.println("  .........  .....  .....         ........       ....       .......     ..........          ");
        System.out.println("                                                                - Armard Bellamy(Cohort 2.2 ");
    }

    public void generalMenu(){
        System.out.println(" ################################  ");
        System.out.println(" #                              #  ");
        System.out.println(" #   [1] NEW CUSTOMER           #  ");
        System.out.println(" #   [2] RETURNING CUSTOMER     #  ");
        System.out.println(" #   [3] LOG OUT                #  ");
        System.out.println(" #                              #  ");
        System.out.println(" ################################  ");
    }

    public void newCusomterMenu(){
        System.out.println(" ################################  ");
        System.out.println(" #                              #  ");
        System.out.println(" #          WELCOME             #  ");
        System.out.println(" #   PLEASE ENTER YOUR NAME     #  ");
        System.out.println(" #     AND NEW PIN NUMBER       #  ");
        System.out.println(" #           BELOW              #  ");
        System.out.println(" #                              #  ");
        System.out.println(" ################################  ");
    }


    public void newAccountMenu(){
        System.out.println(" ################################  ");
        System.out.println(" #                              #  ");
        System.out.println(" #   [1] OPEN CHECKING ACCOUNT  #  ");
        System.out.println(" #   [2] OPEN SAVINGS ACCOUNT   #  ");
        System.out.println(" #   [3] OPEN BUSINESS ACCOUNT  #  ");
        System.out.println(" #   [4] LOG OUT                #  ");
        System.out.println(" #                              #  ");
        System.out.println(" ################################  ");
    }

    public void printLogin(){
        System.out.println(" ################################  ");
        System.out.println(" #                              #  ");
        System.out.println(" #        ENTER ACCT ID         #  ");
        System.out.println(" #       FOLLOWED BY YOUR       #  ");
        System.out.println(" #          PIN NUMBER          #  ");
        System.out.println(" #                              #  ");
        System.out.println(" ################################  ");
    }

    public void printReturningCustomerMenu(){
        System.out.println(" ################################  ");
        System.out.println(" #                              #  ");
        System.out.println(" #  [1] DEPOSIT                 #  ");
        System.out.println(" #  [2] WITHDRAWAL              #  ");
        System.out.println(" #  [3] TRANSFER                #  ");
        System.out.println(" #  [4] OPEN NEW ACCOUNT        #  ");
        System.out.println(" #  [5] CLOSE ACCOUNT           #  ");
        System.out.println(" #  [6] VIEW TRANSACTIONS       #  ");
        System.out.println(" #  [7] EXIT                    #  ");
        System.out.println(" #                              #  ");
        System.out.println(" ################################  ");
    }

    public void printTransactionsMenu(){
        System.out.println(" ################################  ");
        System.out.println(" #                              #  ");
        System.out.println(" #    [1] VIEW TRANSACTIONS     #  ");
        System.out.println(" #    [2] LOG OUT               #  ");
        System.out.println(" #                              #  ");
        System.out.println(" ################################  ");
    }



}
