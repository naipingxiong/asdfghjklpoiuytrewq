import java.util.Scanner;  
/** 
@Yq 
���绰������ϵͳv1.0�� 
1.���    2.ɾ��    3.�޸�    4.��ѯ����  5.����������ѯ    6.�˳� 
*/  
/** 
*�Ե绰�����ݵĲ����ӿ� 
*/  
interface TelBookDAO {  
    public abstract void add();  
    public abstract void delete();  
    public abstract void update();  
    public abstract void read();  
    public abstract void nameRead();  
    public abstract void exit();  
}  
/** 
�绰�������ݴ洢�࣬���������洢�������ݣ�����ֻ������10�����ȣ�����10����ϵ�� 
*/  
class TelBook {  
    static boolean i = true; // ��Ҫ����ִ������ϵͳ��ѭ���Լ�����ѭ��ʱ  
    String[] name = new String[9];  
    String[] sex = new String[9];  
    int[] age = new int[9];  
    long[] tel = new long[9];  
    long[] qq = new long[9];  
    String[] location = new String[9];  
}  
/** 
�绰���Ĳ����࣬��ӣ�ɾ�����޸ģ���ѯ���У����ֲ�ѯ���˳���������̳����������Ա��ȡ���� 
*/  
class TellAllHandle extends TelBook implements TelBookDAO {  
//---------------------��Ӳ�������-----------------------------  
    @SuppressWarnings("resource")
    public void add() { // ��Ӳ���  
        int num=0;  
        for (int y=0 ; y < name.length;y++) { //��ӵ���ͬλ�ñ��⸲��  
            if (name[y]!=null) {  
                num++;  
            }  
        }  
        Scanner input = new Scanner(System.in);  
        System.out.print("����:");  
        name[num] = input.next();  
        System.out.print("�Ա�:");  
        sex[num] = input.next();  
        System.out.print("����:");  
        age[num] = input.nextInt();  
        System.out.print("�绰:");  
        tel[num] = input.nextLong();  
        System.out.print("Q Q:");  
        qq[num] = input.nextLong();  
        System.out.print("��ַ:");  
        location[num] = input.next();  
        System.out.println("����:"+name[num]+"��"+"�Ա�:"+sex[num]+"��"+"����:"+age[num]+"��"+"�绰:"+tel[num]+"��"+"Q Q:"+qq[num]+"��"+"��ַ:"+location[num]);  
        System.out.println("\n"+"��ӳɹ�");  
    }  
//---------------------ɾ����������-----------------------------  
    @SuppressWarnings("resource")
    public void delete() { // ɾ������  
        System.out.print("��������Ҫɾ������ϵ������:");  
        Scanner input = new Scanner(System.in);  
        String inputName = input.next();  
        int num6=0;  
        int num5=0;  
        while(num6 < name.length-1) {  
            if(inputName.equals(name[num6])) {  
                System.out.println("����:"+name[num6]+"��"+"�Ա�:"+sex[num6]+"��"+"����:"+age[num6]+"��"+"�绰:"+tel[num6]+"��"+"Q Q:"+qq[num6]+"��"+"��ַ:"+location[num6]);  
                num5 = 0;  
                break;  
            }  
            else {  
                num5 = 1;  
            }  
            num6++;  
        }  
        if (num5 != 0) {  
            System.out.println("\n"+"��Ǹ����ѯ�����޸�����Ϣ");  
        }  
        if (name[num6] != null) {  
            System.out.println("ȷ��Ҫɾ���𣿡�1(��)��0(��)��"+"\n"+"����ѡ�");  
            int ifDelete = input.nextInt();  
            switch (ifDelete) {  
                case 1:  
                    System.out.println("����ɾ����"+name[num6]+"��������Ϣ");  
                    name[num6] = null;  
                    sex[num6] = null;  
                    age[num6] = 0;  
                    tel[num6] = 0L;  
                    qq[num6] = 0L;  
                    location[num6] = null;  
                    System.out.println("\n"+"ɾ���ɹ�");  
                break;  
                case 0:  
                    System.out.println("\n"+"��δ���κ�ɾ��");  
                break;  
                default:  
                    System.out.println("\n"+"������������������ѡ��ҵ��");  
                break;  
            }  
        }  
    }  
//---------------------�޸Ĳ�������-----------------------------  
    public void update() { // �޸Ĳ���  
        System.out.print("��������Ҫ�޸ĵ���ϵ������:");  
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);  
        String inputName = input.next();  
        int num7=0;  
        int num8=0;  
        while(num7 < name.length-1) {  
            if(inputName.equals(name[num7])) {  
                System.out.println("����:"+name[num7]+"��"+"�Ա�:"+sex[num7]+"��"+"����:"+age[num7]+"��"+"�绰:"+tel[num7]+"��"+"Q Q:"+qq[num7]+"��"+"��ַ:"+location[num7]);  
                num8 = 0;  
                break;  
            }  
            else {  
                num8 = 1;  
            }  
            num7++;  
        }  
        if (num8 != 0) {  
            System.out.println("\n"+"��Ǹ����ѯ�����޸�����Ϣ");  
        }  
        if (name[num7] != null) {  
            System.out.println("������������Ϣ��");  
            System.out.print("����:");  
            name[num7] = input.next();  
            System.out.print("�Ա�:");  
            sex[num7] = input.next();  
            System.out.print("����:");  
            age[num7] = input.nextInt();  
            System.out.print("�绰:");  
            tel[num7] = input.nextLong();  
            System.out.print("Q Q:");  
            qq[num7] = input.nextLong();  
            System.out.print("��ַ:");  
            location[num7] = input.next();  
            System.out.println("����:"+name[num7]+"��"+"�Ա�:"+sex[num7]+"��"+"����:"+age[num7]+"��"+"�绰:"+tel[num7]+"��"+"Q Q:"+qq[num7]+"��"+"��ַ:"+location[num7]);  
            System.out.println("\n"+"�޸ĳɹ�");  
        }  
    }  
//---------------------��ѯ���в�������-----------------------------  
    public void read() { // ��ѯ����  
        int num3 = 0;  
        int num4 = 0;  
        while (num3 < name.length-1) {  
            if (name[num3] != null) {  
                System.out.println("����:"+name[num3]+"��"+"�Ա�:"+sex[num3]+"��"+"����:"+age[num3]+"��"+"�绰:"+tel[num3]+"��"+"Q Q:"+qq[num3]+"��"+"��ַ:"+location[num3]);  
                num4 = 0;  
            }  
            else {  
                num4 = 1;  
            }  
            num3++;  
        }  
        if (num4 != 0) {  
            System.out.println("\n"+"����Ϊ������ϵ�ˣ��� 1 ��Ӹ�����ϵ��");  
        }  
    }  
//---------------------�������Ҳ�������-----------------------------  
    public void nameRead() { // ��������  
        System.out.print("��������Ҫ���ҵ���ϵ������:");  
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);  
        String inputName = input.next();  
        int num1=0;  
        int num2=0;  
        while(num1 < name.length) {  
            if(inputName.equals(name[num1])) {  
                System.out.println("����:"+name[num1]+"��"+"�Ա�:"+sex[num1]+"��"+"����:"+age[num1]+"��"+"�绰:"+tel[num1]+"��"+"Q Q:"+qq[num1]+"��"+"��ַ:"+location[num1]);  
                num2 = 0;  
                break;  
            }  
            else {  
                num2 = 1;  
            }  
            num1++;  
        }  
        if (num2 != 0) {  
            System.out.println("\n"+"��Ǹ����ѯ�����޸�����Ϣ");  
        }  
    }  
//---------------------�˳���������-----------------------------  
    public void exit() { // �˳�����  
        i = false;  
    }  
//---------------------������ѡ���������-----------------------------  
    public void mainSelect() {  
        while(i){  
            i = true;  
            System.out.print("\n"+"��ѡ��ҵ��:");  
            @SuppressWarnings("resource")
            Scanner input = new Scanner(System.in);  
            int mainSelect = input.nextInt();//�����û�ѡ��ҵ���������  
                switch (mainSelect) {  
                case 1:  
                    System.out.println("---------------"+"��ӵ绰��"+"---------------");  
                    add();  
                break;  
                case 2:  
                    System.out.println("---------------"+"ɾ���绰��"+"---------------");  
                    delete();  
                break;  
                case 3:  
                    System.out.println("---------------"+"�޸ĵ绰��"+"---------------");  
                    update();  
                break;  
                case 4:  
                    System.out.println("-------------"+"��ӡ���е绰��"+"-------------");  
                    read();  
                break;  
                case 5:  
                    System.out.println("---------------"+"��������ѯ"+"---------------");  
                    nameRead();  
                break;  
                case 6:  
                    System.out.println("----------------"+"�˳�ϵͳ"+"----------------");  
                    exit();  
                    System.out.println("ллʹ�ã����˳�ϵͳ");  
                break;  
                default:  
                    System.out.println("--------------"+"������������"+"--------------");  
                break;  
            }  
        }  
    }  
}  
/** 
�����������࣬���������ĳ�ʼ�� 
*/  
class MainInterface {  
    public void mainTitle() {  
        System.out.println("-----------------------------�绰������ϵͳ-----------------------------");  
        System.out.println("\t"+"1.���"+"\t"+"2.ɾ��"+"\t"+"3.�޸�"+"\t"+"4.��ѯ����"+"\t"+"5.����������ѯ"+"\t"+"6.�˳�");  
        System.out.println("-----------------------------�绰������ϵͳ-----------------------------");  
    }  
}  
@SuppressWarnings("javadoc")
public class TelBookMgnage {  
    public static void main(String[] args) {  
        new MainInterface().mainTitle(); //����������  
        TellAllHandle T = new TellAllHandle(); //���ظ������  
        T.mainSelect(); //������ѡ�����  
    }  
}  

