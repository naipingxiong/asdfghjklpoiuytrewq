package practice;


/**
 * @author wenjian.cui
 *
 */
public class YiWeiShuZuTest 
{
    /**
     * @param arguments
     */
    public static void main(String[] arguments) 
    {
        String[] titles = {"MR","MRS","MISS","DR","MS"};
        int[] number1 = {new Integer(1),new Integer(2),new Integer(3),new Integer(4)};
        int[] number4 = {111,222,333,444};
        int[] number2 = new int[4];
        number2[0] = 15;
        number2[1] = new Integer(14);
        number2[2] = new Integer(13);
        number2[3] = number1[1];
        Integer[] number3 = new Integer[4];/*数字数组和对象数组区别*/
        number3[0] = new Integer(10);
        number3[1] = new Integer(9);
        number3[2] = new Integer(8);
        /*System.out.println(series[0]);*/
        int i;
        for (i=0;i<4;i++)
        {   System.out.println(number1[i]);
            System.out.println(number2[i]);
            System.out.println(number3[i]);
            System.out.println(titles[i]);
            System.out.println(number4[i]);
        }
        System.out.println(number1.length);
    }      
}