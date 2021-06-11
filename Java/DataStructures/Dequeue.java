    import java.util.*;
    public class test {

        
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> queue = new ArrayDeque<>();
            HashSet<Integer> set = new HashSet<>();
            int n = in.nextInt();
            int m = in.nextInt();
            
                int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();

                queue.add(num);
                set.add(num);

                if(queue.size() == m){
                    if(set.size()>max) max = set.size();

                    int first = queue.remove();

                    if(!queue.contains(first)) set.remove(first);
                }  
            }

            System.out.println(max);
        }
    }