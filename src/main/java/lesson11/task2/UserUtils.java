package lesson11.task2;

public class UserUtils {

    public static void main(String[] args) {


    }

    public void processUserData(String login, String password, int id, String nickName) {
        User user = new User(login, password, id, nickName);
    }

    public String getDescription(User user) {
        StringBuilder result = new StringBuilder();
        result.append("Пользователь: ").append(user.login).append(" ").append(user.nickName);
        return result.toString();
    }

    class User {

        private String login;
        private String password;
        private int id;
        private String nickName;

        public User(String login, String password, int id, String nickName) {
            this.login = login;
            this.password = password;
            this.id = id;
            this.nickName = nickName;
        }

        // Вложенный внутренний класс не может иметь статических методов,
        // поскольку он связан с объектом своего внешнего класса
//        public static void printInfo() {
//
//        }
    }
}
