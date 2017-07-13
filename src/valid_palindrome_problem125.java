public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.equals("")) return true;
        
        String filt = filter(s);
        int length = filt.length();
        for(int i =0;i<length;i++){
            char f = filt.charAt(i);
            char e = filt.charAt(length-i-1);
            if(f != e) return false;
        }
        
        return true;
    }
    public String filter(String s){
        StringBuffer buffer = new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            char tmp = Character.toLowerCase(s.charAt(i));
            int ascii = (int) tmp;
            if(isAlphanumeric(ascii))
                buffer.append(tmp);
        }
        return buffer.toString();
    }
    public boolean isNumeric(int ascii){
        return (ascii >= 48 && ascii <=57) ? true : false;
    }  
    public boolean isText(int ascii){
        return (ascii >= 97 && ascii <=122) ? true : false;
    } 
    public boolean isAlphanumeric (int ascii){
        return isNumeric(ascii) || isText(ascii);
    }
}