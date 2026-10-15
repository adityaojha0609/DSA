class Solution {
    public String reverseWords(String s) {
        String List[] = s.split(" ");
        String List2 = "";
        for(int i =List.length-1;i>=0;i--){
            if(List[i].length()==0){
                continue;
            }
            if(List2.length()==0){
                List2 += List[i];
            }else{
                List2 += " "+List[i];
            }
        }
        return List2;

    }
}