package others;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTest {
	//java.Util.regex.pattern
	public static void main(String[] args) {
		//System.out.println(isNumber("qweqwrwee12323"));
		//System.out.println("123".matches("\\d+"));//正则表达式，对于字符串验证简单化
		//System.out.println("1".matches("\\w"));
		
		System.out.println("RWERER34354@$$#@%#%".replaceAll("[^a-zA-Z]", ""));
		String str ="q1w2e123224";
		String [] strs = str.split("\\d"); //按照数字进行拆分
		for (int i=0;i<strs.length;i++){
			System.out.println(strs[i]);
		}
		System.out.println("10101".matches("\\d+(\\.\\d+)?")); //11.212
		System.out.println("11.213".matches("\\d+(\\.\\d+)?"));
		
		
		//Pattern ,Matchers
		String str1 = "insert into member(a,b,c) values (#{member.a},#{member.b},#{member.c})";
		String regex = "#\\{[a-zA-Z_0-9\\.]+\\}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str1);
		while(m.find()){
			System.out.println(m.group());
		}	
	}
	//判断一个字符串是否有数字
	public static boolean isNumber(String str){
		char[] strarry = str.toCharArray();
		char x;
		for ( int i = 0 ;i<strarry.length;i++){
			x= strarry[i];
			if (x>'9' || x<'0'){
				return false;
			}
		}		
		return true;
	}
}

//x  , \\ , \t  ,\n  [abc] ,[^abc] ,[0-9] : "'0' ~'9'", [a-zA-Z],  .:表示任意字符  ,\d :表示数字0~9
// \s :空格 , \w :字母数字下划线


//String对支持 正则表达式  matches , replaceAll ,split , 