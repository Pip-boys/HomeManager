package com.bibiboy.util;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import com.github.pagehelper.util.StringUtil;

/**
 * 通用工具类
* <p>Title: GeneralTool</p>  
* @author 哔哔小子
* @date 2018年12月02日
 */
public class GeneralTool {
	
	public final static String REGEX_TEL="^[1](([3][0-9])|([4][5,7,9])|([5][^4,6,9])|([6][6])|([7][3,5,6,7,8])|([8][0-9])|([9][8,9]))[0-9]{8}$";
	
	public final static String REGEX_QQ="/^[1-9][0-9]{4,14}$/";
	
	public final static String REGEX_EMAIL="^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$";
	
	public final static String[] SUPPORTPICTYPE= {"jpg","png","jpeg","PNG","JPG"};
	
	//加盐
	public final static String SALT ="bibiboy";
	
	/**
	 * 截取字符串到第N个字符处后返回之前的字符串
	 *
	 * @param string
	 * @param str
	 * @param num
	 * @return
	 */
	public static String subStringIndexOfStr(String string, String str, Integer num) {
		char[] chars = string.toCharArray();
		int i = 0;
		for (; i < chars.length; i++) {
			if (num <= 0)
				break;
			if (str.equals(String.valueOf(chars[i]))) {
				num--;
			}
		}
		return string.substring(0, i);
	}

	public static String checkStringExceptionCatelog(String string) {
    	
		if (Pattern.matches(REGEX_TEL, string)) {
			return "手机号";
		}else if(Pattern.matches(REGEX_EMAIL, string)){
			return "电子邮箱";
		}else if (Pattern.matches(REGEX_QQ, string)) {
			return "QQ号";
		}else if (StringUtil.isNotEmpty(string)) {
			return "账号";
		}else {
			return "";
		}
    }
	
	/**
	 * Md5简单加密
	 * <p>Title: getMD5Str</p>  
	 * <p>Description: </p>  
	 * @param s
	 * @return
	 */
    public static String md5Encode(String password){
    	 password = password + SALT;
         MessageDigest md5 = null;
         try {
             md5 = MessageDigest.getInstance("MD5");
         } catch (Exception e) {
             throw new RuntimeException(e);
         }
         char[] charArray = password.toCharArray();
         byte[] byteArray = new byte[charArray.length];
  
         for (int i = 0; i < charArray.length; i++)
             byteArray[i] = (byte) charArray[i];
         byte[] md5Bytes = md5.digest(byteArray);
         StringBuffer hexValue = new StringBuffer();
         for (int i = 0; i < md5Bytes.length; i++) {
             int val = ((int) md5Bytes[i]) & 0xff;
             if (val < 16) {
                 hexValue.append("0");
             }
  
             hexValue.append(Integer.toHexString(val));
         }
         return hexValue.toString();

    }
    
    public static boolean haveSupportPicType(String string) {
    	for (String s : SUPPORTPICTYPE) {
			if (string.equals(s)) {
				return true;
			}
		}
    	return false;
    }
    
    public static List<Integer> stringToIntegerList(String string) {
    	String[] split = string.split(",");
    	ArrayList<Integer> list = new ArrayList<>();
    	for (String str : split) {
    		list.add(Integer.parseInt(str));
    	}
    	return list;
    }
    
    public static void main(String[] args) {
		String string="123456";
		String md5Encode = md5Encode(string);
	}
}
