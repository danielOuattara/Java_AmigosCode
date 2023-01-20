package _16_Switch_Statements;

public class Main {
    public static void main(String[] args) {
        int age = 18;
        String message= null;
        switch (age) {
            case 16:
                message = "Young";
                break;

                case 17:
                message = "almost";
                break;
            case 18:
                message = "Adult";
                break;
            case 21:
                message = "Can vote now !";
                break;
            default:
                message = "Give your age";
        }

        System.out.println(message);
    }
}
