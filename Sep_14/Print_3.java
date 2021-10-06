package Sep_14;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/14
 */
public class Print_3 {
    public static void main(String[] args){
        String s = "为什么我的眼里常饱含泪水，\n因为我对这片土地爱得深沉......\n";
        char[] sa = s.toCharArray();

        for (int i = 0;i < sa.length;i++){
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(InterruptedException ex){
                Logger.getLogger(Print_3.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.print(sa[i]);
        }
        System.out.print("                           ----艾青\n");
    }
}
