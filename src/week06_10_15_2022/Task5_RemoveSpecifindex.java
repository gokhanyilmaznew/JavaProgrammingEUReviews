package week06_10_15_2022;

public class Task5_RemoveSpecifindex {

    public static void main(String[] args) {

        String word = "Adamm";
        int index = 3;

        String temp = "";

        {
            if (index >= word.length() || index < 0) {
                System.out.println("this is not valid index");
            }
        }
        {
            for (int i = 0; i < word.length(); i++) {

                if (i == index)
                    continue;

                temp += word.charAt(i);

            }
            System.out.println(temp);

        }

    }
}









