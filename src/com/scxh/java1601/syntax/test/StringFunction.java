package com.scxh.java1601.syntax.test;

/**
 * 方法定义:
 * 
 * 访问修饰符 [static] 返回值类型 方法名称 (参数列表){ 方法体 }
 * 
 * 访问修饰符: public private protected 默认 返回值类型: void (没有返回值) (有返回值) return 值; 方法名称:
 * 标识符 参数列表: (参数类型 1 参数名1,参数类型 2 参数名2) 方法体: 大括号
 * 
 * 注: 有static 修饰的方法叫 "类方法" 无static 修饰的方法叫 "对象方法"
 * 
 *
 */

public class StringFunction {
	public static void main(String args[]) {
		String sentence = "The length of str is twelve";

		String s1 = "The url of warmtel is www.warmtel.com";
		String s2 = "warmtel";

		// int wordNumber = getWordNumber(sentence);
		// System.out.println(sentence + "英文句子其有 "+wordNumber + " 个单词");

		int strNum = getWordShowNumber(s1, s2);
		System.out.println(s1 + "中包含有" + strNum + " 个 " + s2);
	}

	/**
	 * 统计英文句子单词个数
	 * 
	 * @param sentence
	 * @return 例如: "The length of str is twelve"
	 */
	public static int getWordNumber(String sentence) {
		String s = sentence;
		int spaceNum = 0; // 空格个数
		char spaceChar = ' ';
		int length = s.length();

		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);
			if (c == spaceChar) {
				spaceNum++;
			}
		}

		int wordNumber = spaceNum + 1;// 单词个数
		return wordNumber;
	}

	/**
	 * 字符串s1 中 子字符串s2出现的个数
	 * 
	 * @param s1
	 *            : The url of warmtel is www.warmtel.com is www.warmtel.com
	 *            .com
	 * @param s2
	 *            : warmtel
	 * @return
	 */
	public static int getWordShowNumber(String s1, String s2) {
		int strNumber = 0;// 子字符串出现个数
		String sub = s1;
		int beginIndex = s1.indexOf(s2);
		while (beginIndex != -1) {
			strNumber++;
			sub = sub.substring(beginIndex + s2.length());
			beginIndex = sub.indexOf(s2);
		}

		return strNumber;
	}

	/**
	 * 判断S1中是否含有S2
	 * 
	 * @param s1
	 *            : www.warmtel.com
	 * @param s2
	 *            : war
	 * @return
	 */
	public boolean contain(String s1, String s2) {
		boolean isContain = false; // 是否包含
		if(s1.contains(s2)){
			isContain = true;
		}
		return isContain;
	}

}
