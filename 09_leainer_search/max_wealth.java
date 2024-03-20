public class max_wealth {
    public static void main(String[] args) {
        int[][] arr = {
                      {1,2,3},
                      {3,2,1}
        };

    }

    public int maximumWealth(int[][] accounts) {
        //parson = row
        //account = col
        int max = Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            //when you start a new colum, take a new sum for that row
            int rowSum = 0;
            for(int account = 0;account<accounts[person].length;account++){
                  rowSum = rowSum+accounts[person][account];
            }
            //now we have sum of account of person
            //check with overall ans
            if(rowSum>max){
                max = rowSum;
            }
        }
        return max;
    }

}
