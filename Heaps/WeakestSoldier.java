import java.util.*;

public class WeakestSoldier {
    static class Row implements Comparable<Row> {
        int sum;
        int index;

        Row(int sum, int index) {
            this.sum = sum;
            this.index = index;
        }

        @Override
        public int compareTo(Row other) {
            if (this.sum != other.sum) {
                return Integer.compare(this.sum, other.sum);
            }else {
                return Integer.compare(this.index, other.index);
            }
        }
    }
    public static void main(String[] args) {
        int army[][] = {
            {5, 5, 5, 5},
            {1, 2, 3, 4},
            {10, 10, 10, 10},
            {2, 2, 2, 2}};
        int k = 2;
        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i = 0; i < army.length; i++) {
            int sum = 0;
            for (int j = 0; j < army[i].length; j++) {
                sum += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(sum, i));
        } 
        for (int i = 0; i < k; i++) {
            System.out.println("R"+pq.remove().index);
        } 
    }
}
