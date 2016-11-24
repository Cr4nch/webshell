import java.util.*;

class Hello{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n,m;
    float sum;
    
    
    n = in.nextInt();
    m = in.nextInt();
    
    int[][] A = new int[n][m];
    float[] mean = new float[n];
    float tmp;
    int[] tmpI;
    
    
    //read
    for(int i=0;i<n;++i){
      sum=0;
      for(int j=0;j<m;++j){
        A[i][j]=in.nextInt();
        sum+=A[i][j];
      }
      sum/=m;
      mean[i]=sum;
    }
    
    //sort
    for(int i=0;i<n-1;++i){
      for(int j=i;j<n;++j){
        if(mean[i]>mean[j]){
          tmp=mean[i];
          mean[i]=mean[j];
          mean[j]=tmp;
          
          tmpI=A[i];
          A[i]=A[j];
          A[j]=tmpI;
        }
      }
    }
    
    for(int i=0;i<n;++i){
      for(int j=0;j<n;++j){
         System.out.printf("%d ",A[i][j]);
      }
      System.out.print("\n");
    }
    
  }
  
}