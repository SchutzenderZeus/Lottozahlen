import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Lotto {
    static ThreadLocalRandom random = ThreadLocalRandom.current();
    static int num = random.nextInt(1,50);

    public static void main(String[] args) {

            Set<Integer> hash_Set = new HashSet<Integer>();

            while (hash_Set.size()<6){
            hash_Set.add(num);}

        System.out.println(hash_Set);//not complete


    }
}
