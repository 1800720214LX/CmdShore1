import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        /*
        开始读取文件
         */
        String pathname;
        File file=new File(pathname:"G:\\文件接收柜\\users.xlsx");
        ReadExcel readExcel=new ReadExcel();//创建对象
        User users[]=readExcel.readExcel(file);
        
        System.out.println("请输入用户名：");

        Scanner sc=new Scanner(System.in);
        String username=sc.next();

        System.out.println("请输入密码 : ");
        String password=sc.next();
        
        
        for(User user:users){
            if(username.equals(user.getUsername()) && password.equals(user.getPassword()))
                System.out.println("登陆成功");
        }
    }
}

