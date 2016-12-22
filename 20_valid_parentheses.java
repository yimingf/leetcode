public class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        
        Map<Character, Character> m = new HashMap<Character, Character>();
        m.put('(', ')');
        m.put('[', ']');
        m.put('{', '}');
        Set<Character> ss = m.keySet();
        Stack<Character> foo = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (ss.contains(c)) {
                foo.push(c);
            } else if (!foo.empty() && m.get(foo.peek()) == c) {
                foo.pop();
            } else {
                return false;
            }
        }
        
        return foo.empty();
    }
}