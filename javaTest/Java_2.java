public class Java_2{
   public static void main(String[] args){
      //*********Found**********
      int [][]aMatrix = new int[4][];
      int i = 0;
      int j = 0;
      int k = 4;

      for(i = 0; i < 4; i++){
         //*********Found**********
         aMatrix[i] = new int[4-i];
 
         //*********Found**********
         for (j = 0; j < aMatrix[i].length; j++) {
            aMatrix[i][j] = i+1;
            System.out.print(aMatrix[i][j] + " ");
         }
         //*********Found**********
         System.out.print("\n");
      }
   }
}