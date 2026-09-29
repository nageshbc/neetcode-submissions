class Solution {
    public boolean isAnagram(String s, String t) {
HashMap<Character,Integer>freq=new HashMap<>();

for(char ch:s.toCharArray()){

    freq.put(ch,freq.getOrDefault(ch,0)+1);
}

for(char ch:t.toCharArray()){

    if(freq.containsKey(ch)){
freq.put(ch,freq.get(ch)-1);

    }
    else{
        return false;
    }
    }

for(Integer val:freq.values()){
    if(val!=0){
        return false;
    }

}
return true;
    
}
}
