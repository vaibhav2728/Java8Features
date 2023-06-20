package tesla;
import java.util.*;
public class TeslaCodility {

    public static void main(String args[]){

    }
    public int[] solution(String[] S) {
        // Implement your solution here
        ArrayList<Integer> arraylist= new ArrayList<>();
        int count=0;
        for(int i=0;i< S.length;i++){
            String s1= S[i];
            int size1=s1.length();
            for(int j=i+1;j<S.length;j++){
                String s2= S[j];
                int size2=s2.length();
                for(int k=0;k<Math.max(size1,size2);k++){
                    if(s1.charAt(k)==s2.charAt(k)){
                        arraylist.add(i);
                        arraylist.add(j);
                        arraylist.add(k);
                        count ++;
                        break;
                    }
                }
                if(arraylist.size()>0){
                    break;
                }
            }
            if(arraylist.size()>0){
                break;
            }
        }
        int [] output= arraylist.stream().mapToInt(Integer::intValue).toArray();
        /*for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }*/
        return output;


    }
}

