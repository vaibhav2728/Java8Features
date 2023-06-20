package tesla;

import java.util.*;
import java.util.stream.Collectors;

public class Tesla2 {

    public static void main(String args[]){
        ArrayList<Integer> arrayList= new ArrayList<>();
        ArrayList<Integer> index= new ArrayList<>();
        int [] A= new int[]{4, 3, 5, 1, 4, 4,6};
        Arrays.sort(A);
        int diff=0;
        int latest=0;
        int size1= arrayList.size();
        int size2=index.size();
        for(int i=0;i<A.length;i++){
            if(index.size()>0){
                index.removeAll(index);
            }

            for(int j=i;j<A.length;j++){
                if(j==i ){
                        index.add(A[j]);
                         latest=A[j];

                }else if(j==i+1){
                    diff=A[j]-A[j-1];
                    index.add(A[j]);
                     latest=A[j];
                }
                else if(A[j]-latest==diff){
                    index.add(A[j]);
                    latest=A[j];

                }


            }

            size2=index.size();
            if(arrayList.size()==0){

                arrayList.addAll(index);
                size1=arrayList.size();


            }else if(size2 >size1){
                arrayList.removeAll(arrayList);
                arrayList.addAll(index);
                size1=arrayList.size();
                if(size1>A.length/2){
                    break;
                }
            }

        }


        arrayList.stream().forEach(System.out::println);

    }


}

