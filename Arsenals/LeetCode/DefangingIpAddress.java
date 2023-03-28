class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();

        for(char ch : address.toCharArray()){
            switch (ch) {
                case '.' : {
                    str.append("[.]");
                    break;
                }
                default:
                    str.append(ch);
            }
        }
        return str.toString();
    }
}