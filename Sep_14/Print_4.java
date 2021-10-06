package Sep_14;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/14
 */
public class Print_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in, "GBK");
        System.out.println("有朋自远方来，不亦乐乎？欢迎您，新朋友！请问尊姓大名？");
        String xm = sc.next();
        System.out.println("您好，" + xm + ",贵庚几何啊？");
        int n1 = sc.nextInt();
        if (n1<30) System.out.println(n1 + "多啦，婚否啊？小女子我年方五万八，风姿绝色，"
                + "凛然独立于世间万古，不知......算了，匈奴不灭，何以家为？你是啥专业的？");
        else if(n1<100) System.out.println(n1 + "多啦，要注意保重身体，想吃什么就吃什么......"
                + "你是啥专业的？");
        else if(n1<1000) System.out.println(n1 + "多啦，龟仙人你认识不，他昨天刚过来找我"
                + "讨了一碗饭......你是啥专业的？");
        else if(n1<10000) System.out.println(n1 + "多啦，你是啥专业的？现在才来学JAVA");
        else System.out.println(n1 + "多啦，前辈啊，这些年你哪去了？自从骑青年牛的老虎子走后，我的"
                    + "专业不精啊，您能否指点一二。");
        String zy = sc.next();
        System.out.println(zy + "，小师弟啊，这个专业挺高富帅的，好好努力啊！"
                + "我有事，先走了。有事您说话，回见！");
        sc.close();
    }
}
