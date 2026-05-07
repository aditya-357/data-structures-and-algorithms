class Solution {
    public int totalFruit(int[] fruits) {
     int laststreak=0, currcount=0, lastfruit=-1, secondlastfruit=-1, max =0;

     for( int i : fruits){

        if( i == lastfruit || i == secondlastfruit){
            currcount++;
        }else{
            currcount = laststreak +1;
        }

        if( i == lastfruit){
            laststreak++;
        }else{
            laststreak = 1;
            secondlastfruit=lastfruit;
            lastfruit= i;
        }

max = Math.max(max,currcount);
     }

return max;
          

          // can be treted as longest substring with  k = 2 distinck character / number / types 

          

         
        // int left = 0 , max = 0 ;
        // int n= fruits.length;

        // HashMap<Integer, Integer> freq = new HashMap<>();

        // for( int i  = 0 ; i<n ; i++){

        //     freq.put(fruits[i], freq.getOrDefault(fruits[i],0)+1);

        //     while( freq.size() > 2){
            
        //         freq.put( fruits[left] , freq.get(fruits[left]) - 1 );

        //         if(freq.get(fruits[left]) == 0){
        //             freq.remove(fruits[left]);
        //         }
        //         left++;
        //     }

        //     max = Math.max( i - left + 1, max);
        // }

        // return max;
    }
}