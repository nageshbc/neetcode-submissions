class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map=new HashMap<>();


        for(String s:strs){
            char []ch=s.toCharArray();
            Arrays.sort(ch);
            String sig=new String(ch);
            map.putIfAbsent(sig,new ArrayList<>());
            map.get(sig).add(s);
        }


return  new ArrayList<>(map.values());

    }

 }
