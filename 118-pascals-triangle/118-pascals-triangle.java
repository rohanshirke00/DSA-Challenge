// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> pasTri = new ArrayList<List<Integer>>();
//         for(int i=0;i<numRows;i++){
//             List<Integer> row = new ArrayList<Integer>();
//             for(int j=0;j<i+1;j++){
//                 if(j==0 || j==i)
//                     row.add(1);
//                 else{
//                     row.add(pasTri.get(i-1).get(j-1) + pasTri.get(i-1).get(j));
//                 }
//             }
//             pasTri.add(row);
//         }
//         return pasTri;
//     }
// }





class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; ++i) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));
			
            pre = row;
			res.add(row);
		}
		return res;
        
    }
}