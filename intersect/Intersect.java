// Intersection Algoirithm for 2 Lists
// The two lists must be in sorted order

import java.util.*;

class Intersect {

    static List<Integer> intersect(List<Integer> p1, List<Integer> p2) {
        List<Integer> answer = new ArrayList<Integer>();

        int i = 0;
        int j = 0;

        while ( (i < p1.size()) && (j < p2.size()) )  {
            if (p1.get(i) == p2.get(j)) {
                answer.add(p1.get(i));
                i++;
                j++;
            } else if (p1.get(i) < p2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return answer;
    }

    static String stringList(List<Integer> lst) {
        String output = "[";
        for (int i = 0; i < lst.size(); i++) {
            output += lst.get(i) + " ";
        }
        output += "]";

        return output;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(23);
        l2.add(43);
        l2.add(5);
        l2.add(2);
        l2.add(7);

        Collections.sort(l1);
        Collections.sort(l2);

        System.out.println(stringList(intersect(l1, l2)));
    }
}