package hu.tmx.colony;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Colony colony = new Colony(10);
        colony.generateAnts(1,1,1);
        colony.display();

        boolean run = true;
        Scanner sc = new Scanner(System.in);
        while(run){
            System.out.println("Next move with enter");
            String text = sc.nextLine();
            if(text.equals("")){
                System.out.println("AFTER MOVE:");
                try{
                    colony.update();
                }catch(Exception e){
                    System.out.println("Error" + e);
                }
                colony.display();
            }else if(text.equals("q")){
                run = false;
            }
        }
    }
}
