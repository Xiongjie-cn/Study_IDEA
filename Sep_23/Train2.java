package Sep_23;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/24
 */
public class Train2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身份证号码：");
        String id = sc.next();
        System.out.println("您的出生日期为："+id.substring(6,10)+"年"
        +id.substring(10,12).replace("0","")+"月"+id.substring(12,14).replace("0","")+"日");
        sc.close();
    }
}
