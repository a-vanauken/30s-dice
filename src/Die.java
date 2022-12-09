
import java.util.Random;

public class Die
{
    private int sides;
    private int faceValue;


    public void Die()
    {
        sides = 6;
        faceValue = 1;
    }

    public int getFaceValue()
    {
        return faceValue;
    }

    public void setFaceValue(int value)
    {
        faceValue = value;
    }

    public void roll()
    {
        Random value = new Random();
        faceValue = value.nextInt(6) + 1;
        switch (faceValue)
        {
            case 1:
                System.out.print(
                        "\n  ______\n" +
                                " /     /| \n" +
                                "+-----+ |\n" +
                                "|     | |\n" +
                                "|  *  | |\n" +
                                "|     |/\n" +
                                "+-----+\n");
                break;
            case 2:
                System.out.print(
                        "\n  ______\n" +
                                " /     /| \n" +
                                "+-----+ |\n" +
                                "|   * | |\n" +
                                "|     | |\n" +
                                "| *   |/\n" +
                                "+-----+\n");
                break;
            case 3:
                System.out.print(
                        "\n  ______\n" +
                                " /     /| \n" +
                                "+-----+ |\n" +
                                "| *   | |\n" +
                                "|  *  | |\n" +
                                "|   * |/\n" +
                                "+-----+\n");
                break;
            case 4:
                System.out.print(
                        "\n  ______\n" +
                                " /     /| \n" +
                                "+-----+ |\n" +
                                "| * * | |\n" +
                                "|     | |\n" +
                                "| * * |/\n" +
                                "+-----+\n");
                break;
            case 5:
                System.out.print(
                        "\n  ______\n" +
                                " /     /| \n" +
                                "+-----+ |\n" +
                                "| * * | |\n" +
                                "|  *  | |\n" +
                                "| * * |/\n" +
                                "+-----+\n");
                break;
            case 6:
                System.out.print(
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
}
