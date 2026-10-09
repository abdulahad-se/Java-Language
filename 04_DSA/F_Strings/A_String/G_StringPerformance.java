package F_Strings.A_String;

public class G_StringPerformance {
    static void main() {
        String series="";
        for(int i=0; i< 26; i++){
            char ch=(char)('a'+i);
            series+=ch;
        }
        System.out.println(series);
    }
}
