package week06_10_15_2022;
  /*
        Task 4: Given a sentence which is string find word how many times repeats in it.
Hint: use replaceFirst() with while loop
input:
*        String str="Java is java in everywhere is Java";
*        String word="Java";
output:3
         */
public class Task4_CountWordWithWhile {
      public static void main(String[] args){
      String str = "Java is java in everywhere is Java";
      String word = "Java";
      str=str.toLowerCase();
      word=word.toLowerCase();
      int counter = 0;
        while (str.contains(word) ) {
          counter++;
          str = str.replaceFirst(word, "");

      }
        System.out.println(counter);


  }
}




