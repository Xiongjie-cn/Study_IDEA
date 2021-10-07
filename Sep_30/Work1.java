package Sep_30;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/10/7
 */
public class Work1 {
    public static void main(String[] args) {
        String[] lunarNumber = new String[]{"一", "二", "三", "四", "五", "六", "七", "八", "九","十"};
        String[] lunarHead = new String[]{"初", "十", "甘"};
        int start_10 = 4;
        int month = 10;
        int j;
        String[] jieqiName = new String[]{"国庆节", "寒露", "重阳节", "霜降"};
        System.out.println("                         十月                        \n");
        System.out.println("星期一   星期二    星期三   星期四    星期五   星期六   星期天");
        for (int i = 20; i < 31+start_10+20; i++) {
            j = i % 29;
            if ((i - 20) % 7 == 0) {
                System.out.println();
            }
            switch (i) {
                case 24:
                    System.out.print(jieqiName[0]+"   ");
                    break;
                case 32:
                    System.out.print(jieqiName[1]+"     ");
                    break;
                case 38:
                    System.out.print(jieqiName[2]+"   ");
                    break;
                case 47:
                    System.out.print(jieqiName[3]+"   ");
                    break;
                default:
                    if (j < 10) {
                        System.out.print(lunarHead[0] + lunarNumber[j] + "     ");
                    } else if (j < 19) {
                        System.out.print(lunarHead[1] + lunarNumber[j - 10] + "     ");
                    } else if (j < 20) {
                        System.out.print("二十     ");
                    } else {
                        System.out.print(lunarHead[2] + lunarNumber[j - 20] + "     ");
                    }break;
            }
        }
    }
}
