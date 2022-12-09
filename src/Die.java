
import java.util.Random;

public class Die
{
    private final int sides = 6;
    private int faceValue;


    public Die()
    {
        faceValue = 1;
    }

    public int getFaceValue()
    {
        //Return the value of the die (typically after rolling)
        return faceValue;
    }

    public void roll()
    {
        //Getting a random number to assign to a die. This is currently hardcoded for a six sided die.
        Random value = new Random();
        faceValue = value.nextInt(sides) + 1;
        //Printing out a certain dice image depending on the die's faceValue
        switch (faceValue)
        {
            case 1: System.out.print(
                        "\n  ______\n" +
                                " /     /| \n" +
                                "+-----+ |\n" +
                                "|     | |\n" +
                                "|  *  | |\n" +
                                "|     |/\n" +
                                "+-----+\n");
                break;
            case 2: System.out.print(
                        "\n  ______\n" +
                                " /     /| \n" +
                                "+-----+ |\n" +
                                "|   * | |\n" +
                                "|     | |\n" +
                                "| *   |/\n" +
                                "+-----+\n");
                break;
            case 3: System.out.print(
                        "\n  ______\n" +
                                " /     /| \n" +
                                "+-----+ |\n" +
                                "| *   | |\n" +
                                "|  *  | |\n" +
                                "|   * |/\n" +
                                "+-----+\n");
                break;
            case 4: System.out.print(
                        "\n  ______\n" +
                                " /     /| \n" +
                                "+-----+ |\n" +
                                "| * * | |\n" +
                                "|     | |\n" +
                                "| * * |/\n" +
                                "+-----+\n");
                break;
            case 5: System.out.print(
                        "\n  ______\n" +
                                " /     /| \n" +
                                "+-----+ |\n" +
                                "| * * | |\n" +
                                "|  *  | |\n" +
                                "| * * |/\n" +
                                "+-----+\n");
                break;
            case 6: System.out.print(
                        "\n  ______\n" +
                                " /     /| \n" +
                                "+-----+ |\n" +
                                "| * * | |\n" +
                                "| * * | |\n" +
                                "| * * |/\n" +
                                "+-----+\n");
                break;
        }
    }

    public static void waitTimer(int ms)
    {
        //Lets us create some suspense while rolling the dice
            try
            {
            Thread.sleep(ms);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
    }
}
