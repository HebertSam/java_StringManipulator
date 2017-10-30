public class StringManipulator{
    public String trimAndConcat(String word1, String word2){
        String trim1 = word1.trim();
        String trim2 = word2.trim();
        return trim1.concat(trim2);
    }
    public Integer getIndexOrNull(String word1, char letter){
        if (word1.indexOf(letter) == -1){
            return null;
        } else{
            return word1.indexOf(letter);
        }
    }
    public Integer getIndexOrNull(String word1, String word2){
        if (word1.indexOf(word2) == -1){
            return null;
        } else{
            return word1.indexOf(word2);
        }
    }
    public String concatSubstring(String word1, int num1, int num2, String word2){
        String newWord = word1.substring(num1, num2);
        return newWord.concat(word2);
    }
}