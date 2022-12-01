class Pair{
    int i;
    int j;
    Pair(int i,int j){
        this.i =i;
        this.j =j;
    }
}
class Solution {
    List<Pair> list = new ArrayList<>();
    public static void makeZeros(int[][] matrix,Pair obj){
        int i = obj.i;
        int j = obj.j;
        for(int k=0;k<matrix[i].length;k++){
                matrix[i][k]=0;
            }
        for(int l=0;l<matrix.length;l++){
                matrix[l][j]=0;
            }            
    }
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                   list.add(new Pair(i,j));
                }   
              }
            }
        for(int i=0;i<list.size();i++){
            makeZeros(matrix,list.get(i));
        }
        }
    }