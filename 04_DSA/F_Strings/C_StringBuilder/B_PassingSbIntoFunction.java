package F_Strings.C_StringBuilder;

public class B_PassingSbIntoFunction {
    static void main() {
        StringBuilder sb=new StringBuilder();
        System.out.println(name(sb));
    }
    static StringBuilder name(StringBuilder sb){
        for(int i=0; i<26; i++){
            char ch=(char)('a'+i);
            sb.append(ch);
        }
        return sb;
    }
}
