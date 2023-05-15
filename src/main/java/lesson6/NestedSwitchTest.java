package lesson6;

public class NestedSwitchTest {

    public static void main(String[] args) {

        String storageName = "Alpha";
        int gateNumber = 2;

        switch (storageName) {
            case "Alpha":
                System.out.println("Склад Альфа");
                break;
            case "Beta":
                System.out.println("Склад Бета");
                switch (gateNumber) {
                    case 1:
                        System.out.println("Ворота номер 1");
                        break;
                    case 2:
                        System.out.println("Ворота номер 2");
                        break;
                    case 3:
                        System.out.println("Ворота номер 3");
                        break;
                    default:
                        System.out.println("На складе Бета нет ворот с таким номером");
                        break;
                }
                break;
            case "Gamma":
                System.out.println("Склад Гамма");
                break;
            default:
                System.out.println("Ошибка. Нет такого склада");
                break;
        }
    }
}
