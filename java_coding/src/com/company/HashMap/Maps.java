package com.company.HashMap;
import java.security.KeyStore;
import java.util.*;
public class Maps {
    static Map<String,Integer> map = new LinkedHashMap<>();
    public static void main(String[] args) {
        String[] arr = {"i","love","leetcode","i","love","coding"};
//        for(String str:arr){
//            mp.put(str,mp.getOrDefault(str,0)+1);
//        }
//        System.out.println(map);
//        sortMap();
//        System.out.println(map);
        HashMap<String,Integer> mp = new HashMap<>();
        mp.put("John", 40);
        mp.put("Alice", 30);
        mp.put("Bob", 20);
        mp.put("Tom", 50);
        System.out.println(mp);
        SortHashMapByKeyExample(mp);
        SortHashMapByValueExample(mp);

        String str = "5";
        int num = '5' - '0';
    }

    public static void sortMap() {
        List<Map.Entry<String, Integer>> sorted = new LinkedList<>(map.entrySet());
        Collections.sort(sorted, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                if(a.getValue() == b.getValue())
                    return a.getKey().compareTo(b.getKey());
                return b.getValue() - a.getValue();
            }
        });
        map.clear();
        for(Map.Entry<String, Integer> e: sorted)
            map.put(e.getKey(), e.getValue());
    }

//    public class {
        public static void SortHashMapByKeyExample (HashMap<String,Integer> map){
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getKey().compareTo(o2.getKey());
                }
            });

            Map<String, Integer> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : list) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
            System.out.println(sortedMap);
        }

        public static void SortHashMapByValueExample(HashMap<String,Integer> map){
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });

            Map<String, Integer> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : list) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
            System.out.println(sortedMap);
        }
}
