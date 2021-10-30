import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String s = "richa luthra";
        String substring = s.substring(2, 4);
        System.out.println(substring);
        char[] chars = s.toCharArray();
        boolean ha = s.endsWith("ha");
        int r = s.indexOf('r');
        int c = s.indexOf('c', 3);
        s = s.replace("ri", "RI");
        String[] split = s.split("");
        System.out.println(s.substring(2));
        System.out.println(Arrays.toString(split));
        System.out.println(s.replaceFirst("r", "R"));
        System.out.println(s.indexOf("chi"));


//        for(int i=0; i<chars.length;i++){
//            System.out.println(chars[i]);
//        }
//        System.out.println(Arrays.toString(chars));
//
//        boolean ic = s.contains("ic");
//        System.out.println(ic);
//        System.out.println(s.length());
//        char x = s.charAt(2);
//        String smaple = "s";
//        char charObj ='s';
//
//        String s1 = String.valueOf(x);
//        String s2 = String.valueOf(x);
//        System.out.println(x);
//       // System.out.println(s.concat(" luthra"));
//        System.out.println(s);
    }
}
