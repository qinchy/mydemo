/**
 * 
 */
package com.qinchy.demo;

/**
 * @author chaoyong.qin
 *
 */
public class Git {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (String string : args) {
			System.out.println(string);
		}
		
		System.out.println("Git.main()");

		String str0 = null;
		String str1 = "Tomcat";
		String str2 = "Tom"+"cat";
		String str3 = new String("Tomcat");

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str3.intern());
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str0);
		System.out.println(str0.equals(str1));
		
		// 正常退出
		System.exit(0);

	}

}
