import java.util.*;

public class Main {
    static class Consume implements Comparable<Consume>{
        int people;
        int cost;

        @Override
        public int compareTo(Consume o) {
            if (o.cost!=cost)
                return o.cost-cost;
            else
                return people-o.people;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        List<Consume> list = new ArrayList<>(m);
        for(int i=0;i<n;i++){
            Integer num=scanner.nextInt();
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int i=0;i<m;i++){
            Consume consume=new Consume();
            consume.people=scanner.nextInt();
            consume.cost=scanner.nextInt();
            list.add(consume);
        }
        Collections.sort(list);
        long sum=0;
        for (int i=0;i<list.size();i++){
            int people=list.get(i).people;
            Map.Entry<Integer,Integer> entry=map.ceilingEntry(people);
            if (entry!=null&&entry.getValue()>0){
                map.put(entry.getKey(),entry.getValue()-1);
                sum+=list.get(i).cost;
            }
        }
        System.out.println(sum);
    }
}
