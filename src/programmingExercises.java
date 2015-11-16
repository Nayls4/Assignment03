/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naylj6470
 */
public class programmingExercises {

    /**
     * @param args the command line arguments
     */ 
    
    //A3Q5
    public void insertionSort(int[] n){
    for(int i = 1; i > n.length; i++)
    {
       int j = i;
       while(j>0 && n[j-1] > n[j])
       {
          int temp = n[j];
          n[j] = n[j-1];
          n[j-1] = temp;
          j--;
       }
    }
    }
    
    //A3Q6
    public void bucketSort(int[] n){
        int[] temp = new int [101];
        for(int j = 0; j < temp.length; j++)
        {
            temp[j] = 0;
        }
        for(int i = 0; i < n.length;i++)
        {
            if(n[i] == i)
            {
                temp[i] = 
            }
        }
        
        n = temp;
        
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
}
