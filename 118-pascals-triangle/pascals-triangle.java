class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalstr=new ArrayList<>();
        List<Integer> firstrow=new ArrayList<>();
        firstrow.add(1);
        pascalstr.add(firstrow);
        for(int i=1;i<numRows;i++)
        {
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            
            for(int j=1;j<i;j++)
            {
                int val=pascalstr.get(i-1).get(j)+pascalstr.get(i-1).get(j-1);
                temp.add(val);
            }
            temp.add(1);
            pascalstr.add(temp);
        }
        return pascalstr;
    }
}