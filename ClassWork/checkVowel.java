// Source code is decompiled from a .class file using FernFlower decompiler.
package ClassWork;

import java.util.Scanner;

public class checkVowel {
   public checkVowel() {
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the to check weather it contains vowel or not");
      String Sentence = input.nextLine().toUpperCase();
      int count = 0;
      char[] listsOowel = new char[Sentence.length()];

      int j;
      for(int i = 0; i < Sentence.length(); ++i) {
         char ch = Sentence.charAt(i);
         if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            boolean duplicated = false;

            for(j = 0; j < count; ++j) {
               if (listsOowel[j] == ch) {
                  duplicated = true;
                  break;
               }
            }

            if (!duplicated) {
               listsOowel[count] = ch;
            }

            ++count;
         }
      }

      if (count == 0) {
         System.out.println("There is no \"VOWEL\" in this words.");
      } else {
         System.out.print("There are (" + count + ") \"VOWEL\"  this words\n Those are: ");
         char[] var9 = listsOowel;
         j = listsOowel.length;

         for(int var11 = 0; var11 < j; ++var11) {
            char ar = var9[var11];
            System.out.print(" " + ar + " ");
         }
      }

   }
}
