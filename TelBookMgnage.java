import java.util.Scanner;  
/** 
@Yq 
【电话本管理系统v1.0】 
1.添加    2.删除    3.修改    4.查询所有  5.根据姓名查询    6.退出 
*/  
/** 
*对电话本数据的操作接口 
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
电话本的数据存储类，用数组来存储各类数据，这里只定义了10个长度，最多存10个联系人 
*/  
class TelBook {  
    static boolean i = true; // 主要用于执行整个系统的循环以及可用循环时  
    String[] name = new String[9];  
    String[] sex = new String[9];  
    int[] age = new int[9];  
    long[] tel = new long[9];  
    long[] qq = new long[9];  
    String[] location = new String[9];  
}  
/** 
电话本的操作类，添加，删除，修改，查询所有，名字查询，退出，操作类继承了数据类以便获取数据 
*/  
class TellAllHandle extends TelBook implements TelBookDAO {  
//---------------------添加操作方法-----------------------------  
    @SuppressWarnings("resource")
    public void add() { // 添加操作  
        int num=0;  
        for (int y=0 ; y < name.length;y++) { //添加到不同位置避免覆盖  
            if (name[y]!=null) {  
                num++;  
            }  
        }  
        Scanner input = new Scanner(System.in);  
        System.out.print("姓名:");  
        name[num] = input.next();  
        System.out.print("性别:");  
        sex[num] = input.next();  
        System.out.print("年龄:");  
        age[num] = input.nextInt();  
        System.out.print("电话:");  
        tel[num] = input.nextLong();  
        System.out.print("Q Q:");  
        qq[num] = input.nextLong();  
        System.out.print("地址:");  
        location[num] = input.next();  
        System.out.println("姓名:"+name[num]+"，"+"性别:"+sex[num]+"，"+"年龄:"+age[num]+"，"+"电话:"+tel[num]+"，"+"Q Q:"+qq[num]+"，"+"地址:"+location[num]);  
        System.out.println("\n"+"添加成功");  
    }  
//---------------------删除操作方法-----------------------------  
    @SuppressWarnings("resource")
    public void delete() { // 删除操作  
        System.out.print("请输入需要删除的联系人姓名:");  
        Scanner input = new Scanner(System.in);  
        String inputName = input.next();  
        int num6=0;  
        int num5=0;  
        while(num6 < name.length-1) {  
            if(inputName.equals(name[num6])) {  
                System.out.println("姓名:"+name[num6]+"，"+"性别:"+sex[num6]+"，"+"年龄:"+age[num6]+"，"+"电话:"+tel[num6]+"，"+"Q Q:"+qq[num6]+"，"+"地址:"+location[num6]);  
                num5 = 0;  
                break;  
            }  
            else {  
                num5 = 1;  
            }  
            num6++;  
        }  
        if (num5 != 0) {  
            System.out.println("\n"+"抱歉，查询错误，无该人信息");  
        }  
        if (name[num6] != null) {  
            System.out.println("确定要删除吗？【1(是)，0(否)】"+"\n"+"输入选项：");  
            int ifDelete = input.nextInt();  
            switch (ifDelete) {  
                case 1:  
                    System.out.println("正在删除："+name[num6]+"的所有信息");  
                    name[num6] = null;  
                    sex[num6] = null;  
                    age[num6] = 0;  
                    tel[num6] = 0L;  
                    qq[num6] = 0L;  
                    location[num6] = null;  
                    System.out.println("\n"+"删除成功");  
                break;  
                case 0:  
                    System.out.println("\n"+"您未作任何删除");  
                break;  
                default:  
                    System.out.println("\n"+"您的输入有误，请重新选择业务");  
                break;  
            }  
        }  
    }  
//---------------------修改操作方法-----------------------------  
    public void update() { // 修改操作  
        System.out.print("请输入需要修改的联系人姓名:");  
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);  
        String inputName = input.next();  
        int num7=0;  
        int num8=0;  
        while(num7 < name.length-1) {  
            if(inputName.equals(name[num7])) {  
                System.out.println("姓名:"+name[num7]+"，"+"性别:"+sex[num7]+"，"+"年龄:"+age[num7]+"，"+"电话:"+tel[num7]+"，"+"Q Q:"+qq[num7]+"，"+"地址:"+location[num7]);  
                num8 = 0;  
                break;  
            }  
            else {  
                num8 = 1;  
            }  
            num7++;  
        }  
        if (num8 != 0) {  
            System.out.println("\n"+"抱歉，查询错误，无该人信息");  
        }  
        if (name[num7] != null) {  
            System.out.println("请重新输入信息：");  
            System.out.print("姓名:");  
            name[num7] = input.next();  
            System.out.print("性别:");  
            sex[num7] = input.next();  
            System.out.print("年龄:");  
            age[num7] = input.nextInt();  
            System.out.print("电话:");  
            tel[num7] = input.nextLong();  
            System.out.print("Q Q:");  
            qq[num7] = input.nextLong();  
            System.out.print("地址:");  
            location[num7] = input.next();  
            System.out.println("姓名:"+name[num7]+"，"+"性别:"+sex[num7]+"，"+"年龄:"+age[num7]+"，"+"电话:"+tel[num7]+"，"+"Q Q:"+qq[num7]+"，"+"地址:"+location[num7]);  
            System.out.println("\n"+"修改成功");  
        }  
    }  
//---------------------查询所有操作方法-----------------------------  
    public void read() { // 查询所有  
        int num3 = 0;  
        int num4 = 0;  
        while (num3 < name.length-1) {  
            if (name[num3] != null) {  
                System.out.println("姓名:"+name[num3]+"，"+"性别:"+sex[num3]+"，"+"年龄:"+age[num3]+"，"+"电话:"+tel[num3]+"，"+"Q Q:"+qq[num3]+"，"+"地址:"+location[num3]);  
                num4 = 0;  
            }  
            else {  
                num4 = 1;  
            }  
            num3++;  
        }  
        if (num4 != 0) {  
            System.out.println("\n"+"以上为所有联系人，按 1 添加更多联系人");  
        }  
    }  
//---------------------姓名查找操作方法-----------------------------  
    public void nameRead() { // 姓名查找  
        System.out.print("请输入需要查找的联系人姓名:");  
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);  
        String inputName = input.next();  
        int num1=0;  
        int num2=0;  
        while(num1 < name.length) {  
            if(inputName.equals(name[num1])) {  
                System.out.println("姓名:"+name[num1]+"，"+"性别:"+sex[num1]+"，"+"年龄:"+age[num1]+"，"+"电话:"+tel[num1]+"，"+"Q Q:"+qq[num1]+"，"+"地址:"+location[num1]);  
                num2 = 0;  
                break;  
            }  
            else {  
                num2 = 1;  
            }  
            num1++;  
        }  
        if (num2 != 0) {  
            System.out.println("\n"+"抱歉，查询错误，无该人信息");  
        }  
    }  
//---------------------退出操作方法-----------------------------  
    public void exit() { // 退出操作  
        i = false;  
    }  
//---------------------主界面选择操作方法-----------------------------  
    public void mainSelect() {  
        while(i){  
            i = true;  
            System.out.print("\n"+"请选择业务:");  
            @SuppressWarnings("resource")
            Scanner input = new Scanner(System.in);  
            int mainSelect = input.nextInt();//加载用户选择业务输入操作  
                switch (mainSelect) {  
                case 1:  
                    System.out.println("---------------"+"添加电话本"+"---------------");  
                    add();  
                break;  
                case 2:  
                    System.out.println("---------------"+"删除电话本"+"---------------");  
                    delete();  
                break;  
                case 3:  
                    System.out.println("---------------"+"修改电话本"+"---------------");  
                    update();  
                break;  
                case 4:  
                    System.out.println("-------------"+"打印所有电话本"+"-------------");  
                    read();  
                break;  
                case 5:  
                    System.out.println("---------------"+"按姓名查询"+"---------------");  
                    nameRead();  
                break;  
                case 6:  
                    System.out.println("----------------"+"退出系统"+"----------------");  
                    exit();  
                    System.out.println("谢谢使用，已退出系统");  
                break;  
                default:  
                    System.out.println("--------------"+"您的输入有误"+"--------------");  
                break;  
            }  
        }  
    }  
}  
/** 
主界面所属类，完成主界面的初始化 
*/  
class MainInterface {  
    public void mainTitle() {  
        System.out.println("-----------------------------电话本管理系统-----------------------------");  
        System.out.println("\t"+"1.添加"+"\t"+"2.删除"+"\t"+"3.修改"+"\t"+"4.查询所有"+"\t"+"5.根据姓名查询"+"\t"+"6.退出");  
        System.out.println("-----------------------------电话本管理系统-----------------------------");  
    }  
}  
@SuppressWarnings("javadoc")
public class TelBookMgnage {  
    public static void main(String[] args) {  
        new MainInterface().mainTitle(); //加载主界面  
        TellAllHandle T = new TellAllHandle(); //加载各项操作  
        T.mainSelect(); //主界面选择操作  
    }  
}  

