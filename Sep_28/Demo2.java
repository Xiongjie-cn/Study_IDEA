package Sep_28;

import java.util.Date;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/28
 */
public class Demo2 {
    public static void main(String[] args) {
        Date date = new Date();
        String form = String.format("%tF", date);
        String time = String.format("%tc", date);
        Scanner sc = new Scanner(System.in);
        double d1 = 42;
        int i1;
        double mGiv = 150;
        double mBak;
        double mNed;

        System.out.println("电影：《八佰》");
        System.out.println("影厅：3楼2号厅");
        System.out.println("放映时间：" + form + " 19:00");
        System.out.println("票价：42.00");
        System.out.print("购买数量：");
        i1 = sc.nextInt();
        mNed = i1 * d1;
        mBak = mGiv - mNed;
        System.out.println();
        System.out.println("        购票信息");
        System.out.println("-------------------------");
        System.out.println("电影：《八佰》");
        System.out.println("影厅：3楼2号厅");
        System.out.println("放映时间：" + form + " 19:00");
        System.out.println("票价：42.00");
        System.out.println("应付金额：" + String.format("%.2f", mNed));
        System.out.println("实付金额：" + String.format("%.2f", mGiv));
        System.out.println("找零：" + String.format("%.2f", mBak));
        System.out.println("当前时间：" + form + time.substring(9, 15));
        /* 定义数组set用于保存已选座位，初始化的数组值全为0，即0表示未选
        定义set_f用于保存客户分到的座位，大小为i1*2，i1为票数
        定义set1用于表示座位号，1-80，1-70表示第一到第七排，71-80表示第十排
        生成随机座位set1后先进行判断，判断是否被选，即数组set[set1]的值是否为1，
        为1即已被选，再产生随机数，反之将set1记载进set_f，并在set中记录
         */
        int[] set = new int[80];
        int[] set_f = new int[i1 * 2];
        int set1;
        for (int i = 0; i < i1; i++) {
            do {
                set1 = (int) (80 * Math.random());
            } while (set[set1] == 1);
            set[set1] = 1;
            if (set1 <= 70) {
                set_f[i * 2] = (int) set1 / 10 + 1;
                set_f[i * 2 + 1] = (int) set1 % 10;
            } else {
                set_f[i * 2] = (int) (set1 + 20) / 10 + 1;
                set_f[i * 2] = (int) set1 % 10;
            }
        }
        for (int i = 0; i < i1; i++) {
            System.out.println();
            System.out.println("        电影票信息");
            System.out.println("-------------------------");
            System.out.println("电影：《八佰》");
            System.out.println("影厅：3楼2号厅");
            System.out.println("座位：" + set_f[i * 2] + "排" + set_f[i * 2 + 1] + "座");
            System.out.println("放映时间：" + form + " 19:00");
            System.out.println("当前时间：" + form + time.substring(9, 15));
        }
    }
}
