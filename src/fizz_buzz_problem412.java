public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>();
        
        int i =1;
        while(i <= n){
            if(i % 15 == 0){
                res.add("FizzBuzz");
            }
            else if(i % 5 == 0){
                res.add("Buzz");
            }
            else if(i % 3 == 0){
                res.add("Fizz");
            }
            else{
                String num = Integer.toString(i);
                res.add(num);
            }
            i++;
        }
        return res;
    }
}