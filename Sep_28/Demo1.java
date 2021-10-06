package Sep_28;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/28
 */
public class Demo1 {
    public static void main(String[] args) {
        double h;
        double w;
        double BMI;
        double BMI_01 = 18.5;
        double BMI_02 = 23.9;
        double BMI_03 = 27.9;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的身高（米）：");
        h = sc.nextDouble();
        System.out.print("请输入你的体重（公斤）：");
        w = sc.nextDouble();
        sc.close();
        BMI = w / (h * h);
        System.out.println("你的BMI为："+String.format("%.2f",BMI));
        if (BMI < BMI_01) {
            System.out.println("您的体重偏低");
        } else if (BMI < BMI_02) {
            System.out.println("您的体重正常");
        } else if (BMI < BMI_03) {
            System.out.println("您的体重偏胖");
        } else {
            System.out.println("您是真的肥");
        }
    }
}
