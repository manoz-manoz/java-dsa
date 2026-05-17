class Solution {
    public void sortColors(int[] arr) {

        int red=0,white=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
                red++;
            else if(arr[i]==1)
                white++;
            else{}
        }
        for(int i=0;i<arr.length;i++){
        if(i<red)
            arr[i]=0;
        else if(i<red+white)
            arr[i]=1;
        else
            arr[i]=2;
        }

        
    }
}