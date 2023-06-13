class nextpermutation {

    //3rd problem of the day
    
    public void nextPermutation(int[] nums) {
        int l=nums.length;
        int br=-1;
        for(int i=l-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
            br=i;
            break;
            }
        }
        if(br==-1){
          int x=br+1,y=l-1;
    while(x<=y){
        int ran;
        ran=nums[x];
        nums[x++]=nums[y];
        nums[y--]=ran;
    }
        return ;
        }
        else
{
    int pos=l-1;
    int temp;
    for(int i=l-1;i>br;i--){
        if(nums[i]>nums[br]){
            pos=i;
            break;}
    }
    temp=nums[br];
    nums[br]=nums[pos];
    nums[pos]=temp;
    int x=br+1,y=l-1;
    while(x<=y){
        int ran;
        ran=nums[x];
        nums[x++]=nums[y];
        nums[y--]=ran;
    }
        return;

}
    }
}
