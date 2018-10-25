/**
 * Created by 老蹄子 on 2018/10/25 下午10:14
 *
 * 可能出现以下几种情况：
 1.word1[i-1]==word2[j-1]
 如果下标相等，那么steps[i][j]=steps[i-1][j-1]。从语义的角度上来说，假设已知将word1[0...i-2]转化为word2[0...j-2]的最小操作数，那么如果彼此下一个值相等，则无需进行操作。
 2.word1[i-1]!=word2[j-1]
 插入：在word1[i-1]的位置上插入word2[j-1],也就是说word1[0...i-1]=word2[0...j-1],steps[i][j]=steps[i][j-1]+1
 替换：将word1[i-1]的值替换为word2[j-1]。steps[i][j]=steps[i-1][j-1]+1
 删除：将word1[i-1]的值删除使word1[0...i-2]等价于word2[j-1], steps[i][j] = steps[i-1][j]+1

 在这里解释一下插入和删除的算法的原理。
 如果插入即可使word1[0...i-1]转化为word2[0...j-1]，那么意味着word[0...i-1]可以转换为word2[0...j-2]。只要在此基础上再进行一次插入操作即可以完成转换。所以steps[i][j]=steps[i][j-1]+1
 删除操作同理，word[0...i-2]可以转化为word[0...j-1]，只需要再此基础上再进行一次删除操作即可，所以steps[i][j] = steps[i-1][j]+1
 */
public class Solution2 {
    public int minDistance(String word1, String word2) {
        if(word1.isEmpty()) return word2.length();
        if(word2.isEmpty()) return word1.length();
        int[][] steps = new int[word1.length()+1][word2.length()+1];
        for(int i = 0 ; i<=word1.length() ; i++){
            for(int j = 0 ; j<=word2.length() ; j++){
                if(i==0){
                    steps[i][j] = j;
                }else if(j==0){
                    steps[i][j] = i;
                }else if(word1.charAt(i-1) == word2.charAt(j-1)){
                    steps[i][j] = steps[i-1][j-1];
                }else{
                    steps[i][j] = Math.min(Math.min(steps[i][j-1]+1, steps[i-1][j-1]+1), steps[i-1][j]+1);
                }

            }
        }
        return steps[word1.length()][word2.length()];
    }
}
