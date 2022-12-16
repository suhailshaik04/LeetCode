class Solution {
    public String decodeMessage(String key, String message) {
        char[] msgToText = new char[128];          
        msgToText[' '] = ' ';                     
        char curChar = 'a';                         
        for (char c : key.toCharArray())            
            if (msgToText[c] == 0)                  
                msgToText[c] = curChar++;           

        char[] result = new char[message.length()]; 
        int resultIdx = 0;                          
        for (char c : message.toCharArray())        
            result[resultIdx++] = msgToText[c];     
        return String.valueOf(result);             
    }
}