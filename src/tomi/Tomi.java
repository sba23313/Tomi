/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tomi;

/**
 *
 * @author palic
 */
public class Tomi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String intro = """
                       Al's all wet. Oh, why is Al all wet? Oh,
                       Al's all wet 'cause he's standing in the rain.""";
        
        for (int verse = 1; verse <= 3; verse++) {
            System.out.println(intro);
            System.out.println("Why is Al out in the rain?");
            
            switch (verse) {
                case 3:
                    System.out.println("Last refrain, last refrain,");
                case 2:
                    System.out.println("He's a pain, he's a pain,");
                case 1:
                    System.out.println("Has no brain, has no brain'");
            }
            
        }
        System.out.println(intro);
    }
    
}
