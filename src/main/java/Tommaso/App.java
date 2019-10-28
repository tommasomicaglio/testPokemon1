package Tommaso;

/**
 * Hello world!
 *
 */
public class App
{


    public static void main(String[] args) {
        System.out.println(maxXP(36,12));
    }

    public static int maxXP(int pidgeys, int candy) {
        int xp = 0;
        while (pidgeys > 0) {
            if (candy >= 12) {          // evolvo
                candy = candy - 12;     // posso scrivere candy -12 +1;
                pidgeys = pidgeys - 1;
                xp = xp + 500;
                candy = candy + 1;

            } else {                    //trasferisco
                pidgeys = pidgeys - 1;
                candy = candy + 1;
            }
        }

        return xp;
    }
    }
