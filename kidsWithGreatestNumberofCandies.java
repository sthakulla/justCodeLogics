public class kidsWithGreatestNumberofCandies{
    private int findMax(int[] can){
        int res=0;
        for(int i: can){
            res=Math.max(res, i);
        }
        return res;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n= candies.length-1;
        int max=findMax(candies);
        List<Boolean> res=new ArrayList<>();
        for(int i: candies){
            if((i+extraCandies)<max){
                res.add(false);
            }
            else{
                res.add(true);
            }

        }
        return res;
    }
    public static void main(String[] args)
    {
        int []candies={};
        int extra=0;
        kdCandy(candies, extra);
    }
}
