class Solution {
    public List<List<Integer>> generate(int numRows) {
        //Naive approach
        // List<List<Integer>> triangle = new ArrayList<>();
        // if(numRows==0) return triangle;
        // List<Integer> list = new ArrayList<>(Arrays.asList(1));
        // triangle.add(list);
        // if(numRows==1) return triangle;
        // List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1));        
        // triangle.add(list2);
        // for(int i=2; i<numRows; i++){
        //     List<Integer> newlist = new ArrayList<>();
        //     List<Integer> previousList = triangle.get(i-1);
        //     newlist.add(1);
        //     for(int j=0;j<previousList.size()-1;j++){
        //         newlist.add(previousList.get(j)+previousList.get(j+1));
        //     }
        //     newlist.add(1);
        //     triangle.add(newlist);
        // }
        // return triangle;
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            triangle.add(generateRow(i));
        }
        return triangle;
    }
    public List<Integer> generateRow(int n){
        int ans = 1;
        List<Integer> rowList = new ArrayList<>();
        rowList.add(ans);
        int rowSize = n+1; //no of elements in the row
        for(int i=1;i<=n;i++){
           ans = (ans * (rowSize - i)) / i;
           rowList.add(ans);
        }
        return rowList;
    }
}