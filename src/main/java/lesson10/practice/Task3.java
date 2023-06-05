package lesson10.practice;

public class Task3 {
    public static void main(String[] args) {

//        изменить порядок слов в данной строке на обратный
//На входе: Hello I like Java
//На выходе: olleH I ekil avaJ
//Наш метод на вход должен принимать строку и возвращать тоже строку

        String fraza = "Hello I like Java";
        System.out.println(getPhraseWithReversedWords(fraza));
    }

    public static String getPhraseWithReversedWords(String str) {
        String[] arrayString = str.split(" ");
        StringBuilder tsr = new StringBuilder();
        for (String word : arrayString) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            tsr.append(sb).append(" ");
        }
        tsr.setLength(tsr.length() - 1);
        return tsr.toString();
    }
}
