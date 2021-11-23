import java.util.ArrayList;
import java.util.List;
public class LogicalOp {
    //Cerinta 1
    public List<Integer> getPopulatedList(int max) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            myList.add(i);
        }
        return myList;
    }

    //Cerinta 2
    public List<Integer> addNumberToEnd(List<Integer> myList, int number){
        myList.add(number);
        return myList;
    }

    //Cerinta 3
    public void printListFromNumber (List<Integer> myList, int number){
        for (int i = number; i <= myList.size(); i++){
            System.out.println(myList.get(i-1));
        }
    }

    //Cerinta 4
   public void fromEndToFront(List <Integer> myList){
        for (int i = 0, j = myList.size() - 1; i < j; i++) {
            myList.add(i, myList.remove(j));
        }

        System.out.println(myList);
    }

    //Cerinta 5
   public List<String> insertOnPosition(List<String> myList, String add, int position){
       for (int i = 0; i < myList.size(); i++){
           i =position;
           myList.add(i, add);
           break;
       }
       return myList;
   }

   //Cerinta 6
    public List<Integer> addOnFirst(List<Integer> myList,int a){
            myList.add(0,a);
            return myList;
    }

    //Cerinta 7
    public void displayPositionAndValue(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            int element = myList.get(i);
            System.out.println("Elementul de pe pozitia:" + i + " " + "Este: " +element);
        }

    }

    //Cerinta 8
    public int maxNumber(List<Integer> myList){
        int max = 0;
        for (int i=0 ; i< myList.size(); i++){
            if(myList.get(i) > max){
                max = myList.get(i);
            }
        } return max;

    }
}
