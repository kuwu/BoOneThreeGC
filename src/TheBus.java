import java.util.Scanner;

/**
 * Created by kuwu on 2017/06/27.
 */
public class TheBus {


    public static void storyStart() {

        System.out.println("BOOM! Suddenly, you are jolted awake after slamming into the seat \n" +
                "in front of  you. All around you, you hear by the sound of twisting metal and \n" +
                "people screaming. At first you’ve can’t remember where you are. Then you realize\n" +
                " your on a bus on the way to Key West and it has crashed through the guardrail and \n" +
                "into the ocean. Water has started filling the bus. You look around and see that\n" +
                " a little girl seating next to you and she's not moving. You have to move quickly,\n" +
                " but you can’t just leave her, can you?\n\n" +
                "Help her - enter 1\n\n" +
                "Leave her  - enter 2\n");

    }

    public static void storyChaptOne() {
        Scanner scnr = new Scanner(System.in);
        int input = scnr.nextInt();


        int choice = input;
        String busCrash;

        switch (choice) {


            // try to help girl
            case 1:
                busCrash = "\nYou shake the girl awake. She jumps up, totally confused. You shout, calm down.\n" +
                        "She begins to shake. You grab her shoulders and yell “Follow me! You  both get to the\n" +
                        "aisle but suddenly a bunch of suitcases fall open form the overhead and everything\n" +
                        "lands in the aisle in front of you. You see some potentially valuable items.\n\n" +
                        "Grab items - enter 1\n\n" +
                        "Ingore them and go - enter 2\n ";
                break;

            //leave her
            case 2:
                busCrash = "\nYou know know you don’t have time to help the girl and save your self.\n" +
                        "You climb over the seat to the aisle but then see a old man and his wife blocking\n" +
                        "the aisle. You have to get around them somehow.\n\n" +
                        "Climb over them - enter 1\n\n" +
                        "Help them up - enter 2\n";
                break;

            default:
                busCrash = "oops! You died";
                break;
        }

        System.out.println(busCrash);


    }


    public static void storyChaptTwo() {
        Scanner scnr = new Scanner(System.in);
        int input = scnr.nextInt();


        int choice = input;
        String busCrash;

        switch (choice) {


            // grab supplies
            case 1:
                busCrash = "\nYou rummage through the supplies and find rope. Your sure you can find\n" +
                        "more useful items but the water is raising quickly. \n";
                break;

            // ignore them and move on
            case 2:
                busCrash = "\nYou know know you don’t have time to help the girl and save your self.\n" +
                        "You climb over the seat to the aisle but then see a old man and his wife blocking\n" +
                        "the aisle. You have to get around them somehow.\n";
                break;

            default:
                busCrash = "oops! You died";
                break;
        }

        System.out.println(busCrash);


    }


    public static void main(String[] args) {

        storyStart();
        storyChaptOne();
        storyChaptTwo();


    }
}

