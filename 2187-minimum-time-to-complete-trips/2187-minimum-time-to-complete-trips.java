class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long atl=-1;
        long left=1, right= 100000000000001L;
        while(left<=right){
            long mid= left+ (right-left)/2; 
            long curr_trips=0;
            for(int t: time){
                curr_trips+= mid/t;
            }
            if(curr_trips>=totalTrips){
                atl=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return atl;        
    }
}