class Solution {
    
    
//     public boolean checkIfPangram(String sentence) {

//         if(sentence.length()<26) return false;
        
//         boolean[] arr = new boolean[26];
        
//         for(int i=0; i<sentence.length(); i++){
//             arr[sentence.charAt(i)-97] = true;
//         }
//         for(int i=0; i<26; i++){
//             if(arr[i] == false) return false;
//         }
//         return true;
        
//     }

    public boolean checkIfPangram(String sentence) {

        if(sentence.length()<26) return false;
        
        int res = 0;
        
        for(int i=0; i<sentence.length(); i++){
            res = res | (1 << (sentence.charAt(i)) -1);
            if(res == (1<<26) -1) return true;
        }
        return false;
        
    }
}