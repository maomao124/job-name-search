import java.util.Scanner;

/**
 * Project name(项目名称)：作业_substring()方法与indexOf()方法的使用
 * Package(包名): PACKAGE_NAME
 * Class(类名): NameSearch
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/15
 * Time(创建时间)： 19:40
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class NameSearch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int start;
        int end;
        String data;
        String SearchName;
        data = input.nextLine();
        SearchName = input.nextLine();
        end = data.length();
        start = 0;
        int n = 0;

        /*
        start=data.indexOf(SearchName);
        data=data.substring(start+1);
        System.out.println(start);
        System.out.println(data);
        n=start+n+1;
        start=data.indexOf(SearchName);
        data=data.substring(start+1);
        System.out.println(start+n);
        System.out.println(data);
        n=start+n+1;
        start=data.indexOf(SearchName);
        data=data.substring(start+1);
        System.out.println(start+n);
        System.out.println(data);
        */

        while (n < end)
        {
            start = data.indexOf(SearchName);
            data = data.substring(start + 1);
            System.out.println(start + n);
            System.out.println(data);
            n = start + n + 1;
            if (data.indexOf(SearchName) < 0)
            {
                break;
            }
        }
    }
}
