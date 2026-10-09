package C_LinearSearch;

public class C_SearchInString {
    public static void main(String[] args) {
        String name="AbdulAhad";
        char target='u';
//        System.out.println(searchInString(name,target));
//        System.out.println(searchInString2(name,target));
        System.out.println(searchInString3(name,target));
    }
    static boolean searchInString(String name,char target){
        if(name.length()==0){
            return false;
        }
        for(int i=0; i<name.length(); i++){
            char ch=name.charAt(i);
            if(ch==target){
                return true;
            }
        }
        return false;
    }
    static int searchInString2(String name,char target){
        if(name.length()==0){
            return -1;
        }
        for(int i=0; i<name.length(); i++){
            char ch=name.charAt(i);
            if(ch==target){
                return i;
            }
        }
        return -1;
    }
    static boolean searchInString3(String name,char target){
        if(name.length()==0){
            return false;
        }
        for(char ch : name.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
