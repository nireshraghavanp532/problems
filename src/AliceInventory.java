import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AliceInventory {

    public static void main(String[] args) {
        int[] products = {4, 3, 2,1,9,10,5};
        int totalweight= findTotalWeight(products);
        System.out.println("Total Weight: "+ totalweight );
    }

    public static int findTotalWeight(int[] products) {
        int totalWeight = 0;
        List<Integer> row=new ArrayList<>();
        for(int k:products){
            row.add(k);
        }
        while(row.size()>0){

           totalWeight+= removeProduct(row,findMinIndex(row));

        }
        return totalWeight;
    }
    public static int removeProduct(List<Integer>row,int minIndex){
        int l=-1,r=-1,m=-1;
        m=row.get(minIndex);

        if(minIndex+1>=0 && minIndex+1<row.size()){
             r=row.get(minIndex+1);

        }
        if(minIndex-1>=0 && minIndex-1<row.size()){
            l=row.get(minIndex-1);
        }
       if(row.contains(l)){
           row.remove(row.indexOf(l));
       }
        if(row.contains(r)){
            row.remove(row.indexOf(r));
        }
        if(row.contains(m)){
            row.remove(row.indexOf(m));
        }

        return m;
    }

    private static int findMinIndex(List<Integer>row) {
        int minIndex = 0;
        for (int i = 0; i < row.size(); i++) {
            if (row.get(i) < row.get(minIndex)) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
