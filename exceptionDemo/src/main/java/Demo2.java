import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;

public class Demo2 {
    public static void main(String[] args){


      checkEligibilty(11,12);
        System.out.println("sfter error");
    }




    public static void checkEligibilty(int stuage, int stuweight)  {


           if (stuage < 12 && stuweight < 40) {
             throw new UserNotFoundException();
            //  Thread.sleep(200);
            //  System.out.println(stuage / 0);
               // System.out.println(stuage+stuweight);
               //  System.out.println("code");
           }

    }


}