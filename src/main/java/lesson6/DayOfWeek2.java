package lesson6;

public class DayOfWeek2 {

    public static void main(String[] args) {

        int day = 1;

        switch (day){
            case 1 :
                System.out.println("Это понедельник");
                break;
            case 2:
                System.out.println("Это вторник");
                break;
            case 3:
                System.out.println("Это среда");
                break;
            case 4:
                System.out.println("Это четверг");
                break;
            case 5:
                System.out.println("Это пятница");
                break;
            case 6:
                System.out.println("Это суббота");
                break;
            case 7:
                System.out.println("Это воскресение");
                break;
            default:
                System.out.println("Error");
                break;

        }

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("rabochie dni");
                break;
            case 6:
            case 7:
                System.out.println("vihodnye");
                break;
            default:
                System.out.println("takogo dnja net");
        }

    }

}
