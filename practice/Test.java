package practice;
/** 
* Created by IntelliJ IDEA. 
* User: leizhimin 
* Date: 2007-11-29 
* Time: 15:47:20 
*/ 
public class Test { 
    public static void main(String args[]) { 
        Test test = new Test (); 
/*        test.testBreak1(); */

        test.testContinue1(); 

/*        test.testBreak2(); */
        test.testContinue2(); 
    } 

    /** 
     * ����continue 
     * continue������������ѭ�� 
     */ 
    public void testContinue1() { 
        System.out.println("--------����continue-------"); 
        for (int i = 1; i <= 5; i++) { 
            if (i == 3) continue; 
            System.out.println("i=" + i); 
        } 
    } 

    /** 
     * break������������ѭ���� 
     */ 
/*    public void testBreak1() { 
        System.out.println("--------����break1-------"); 
        for (int i = 1; i <= 5; i++) { 
            if (i == 3) break; 
            System.out.println("i=" + i); 
        } 
    } */

    /** 
     * ���Դ���ǩ��break��� 
     * ��ǩֻ��д��ѭ����֮ǰ��˳��ѧϰһ��java������ǩ�Ķ����ʹ�� 
     */ 
/*    public void testBreak2() { 
        System.out.println("--------����break2-------"); 
        int i = 1; 
        int k = 4; 
        lable1: 
        for (; i <= 5; i++, k--) { 
            if (k == 0) break lable1; 
            System.out.println("i=" + i + " ; k=" + k); 
        } 
    } 
*/
    public void testContinue2() { 
        System.out.println("--------����continue2-------"); 
        lable1: 
        for (int i = 1; i < 10; i++) { 
            lable2: 
            System.out.println("i=" + i); 
            for (int j = 0; j < 10; j++) { 
                if (j == 9) continue lable1; 
            } 
        } 
    } 
}