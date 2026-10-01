class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>>l=new ArrayList<>();
       HashMap<String,List<String>>map=new HashMap<>();
     
        for(int i=0;i<strs.length;i++){
            char[] a = strs[i].toCharArray();
Arrays.sort(a);
String k = new String(a);
            map.putIfAbsent(k,new ArrayList<>());
            map.get(k).add(strs[i]);

        }
    l.addAll(map.values());
    return l;
    }
}