class Solution {
    private List<Integer> combination(int row)
    {
        List<Integer> arrl = new ArrayList<>();
        int res = 1;
        arrl.add(res);

        for(int col=1;col<row;col++)
        {
            res = res * (row-col);
            res /= col;
            arrl.add(res);
        }
        return arrl;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrl = new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            arrl.add(combination(i));
        }

        return arrl;
    }
}