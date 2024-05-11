import java.util.*;
class relativeranks {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] result=new String[n];

        int[] sorted=Arrays.copyOf(score,n);
        Arrays.sort(sorted);

        HashMap<Integer, String>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int rank=n-i;
            if(rank==1){
                map.put(sorted[i],"Gold Medal");
            }else if(rank==2){
                map.put(sorted[i],"Silver Medal");
            }else if(rank==3){
                map.put(sorted[i],"Bronze Medal");
            }else{
                map.put(sorted[i],String.valueOf(rank));
            }
        }
        
        for(int i=0;i<n;i++){
            result[i]=map.get(score[i]);
        }

        return result;
    }
}