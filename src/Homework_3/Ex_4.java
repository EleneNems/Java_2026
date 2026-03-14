package Homework_3;

public class Ex_4 {
    public int[] D = new int[13];

    Ex_4(){
        for(int i=0; i<13; i++){
            D[i] = (int)(Math.random() * 100);
        }
    }

    public void PrintArray(){
        for(int i=0; i<13; i++){
            System.out.print(D[i] + " ");
        }
    }

    public void SortArray(){
        for(int i=0; i< 13-1; i++){
            for (int j=i+1; j<13;j++){
                if(D[i]<D[j]){
                    int temp = D[i];
                    D[i] = D[j];
                    D[j] = temp;
                }
            }
        }
    }
}
