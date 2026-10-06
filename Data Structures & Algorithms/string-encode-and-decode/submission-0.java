class Solution {

    public String encode(List<String> strs) {
StringBuilder sb=new StringBuilder();
for(String str:strs){
    sb.append(str.length());
    sb.append("#");
    sb.append(str);
}

return sb.toString();
    }

    public List<String> decode(String str) {
int i=0;
List<String> res=new ArrayList<>();

while(i<str.length()){
    int j=i;

    while(str.charAt(j)!='#'){
        j++;
    }
int len=Integer.parseInt(str.substring(i,j));
    int start=j+1;
    String re=str.substring(start,start+len);
    res.add(re);
    i=start+len;
}
return res;

    }
}













