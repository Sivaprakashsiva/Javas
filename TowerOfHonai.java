
public class TowerOfHonai {
   public static void main(String[] args) {
      int Stacks = 3;
      moveDisk(Stacks, 'A', 'B', 'C');
   }
   public static void moveDisk(int topN, char from,char inter, char to) {
      if (topN == 1){
         System.out.println("Disk 1 from "+ from + " to " + to);
      }else {
         moveDisk(topN - 1, from, to, inter);
         System.out.println("Disk "+ topN + " from " + from + " to " + to);
         moveDisk(topN - 1, inter, from, to);
      }
   }
}
