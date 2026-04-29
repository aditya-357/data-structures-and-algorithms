class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map= new HashMap<>();

        int n=s.length();

        for( int i=0;i<n;i++){

            char ch = s.charAt(i);

             map.put(ch,map.getOrDefault(ch,0)+1);
        }

  PriorityQueue<Map.Entry<Character,Integer>> maxheap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

  maxheap.addAll(map.entrySet());

 StringBuilder sb=new StringBuilder();

 while( !maxheap.isEmpty()){

    Map.Entry<Character , Integer> pair = maxheap.poll();

    char ch = pair.getKey();
    int freq = pair.getValue();

    for(int i=0;i<freq;i++){
        sb.append(ch);
    }
 }

        return sb.toString();




        // HashMap<Character, Integer> map = new HashMap<>();

        // for (char ch : s.toCharArray()) {
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }

        // List<Character>[] bucket = new ArrayList[s.length() + 1];

        // for (char ch : map.keySet()) {
        //     int freq = map.get(ch);

        //     if (bucket[freq] == null) {
        //         bucket[freq] = new ArrayList<>();
        //     }

        //     bucket[freq].add(ch);
        // }

        // StringBuilder sb = new StringBuilder();

        // for (int i = bucket.length - 1; i >= 0; i--) {
        //     if (bucket[i] != null) {
        //         for (char ch : bucket[i]) {
        //             for (int j = 0; j < i; j++) {
        //                 sb.append(ch);
        //             }
        //         }
        //     }
        // }

        // return sb.toString();
    }
}