package com.scxh.java1601.syntax.test;

public class StringFunctuin {
	public static void main(String[] args) {
		StringFunctuin functuin = new StringFunctuin();
		String s = "java welcome to chengdu";
		int wordNuber = functuin.getWordNumber(s);
		System.out.println("单词个数为 :" + wordNuber);

		String s1 = "例如String str = newString();实际上创建了两个String对象";
		String s2 = "String";
		int wordShowNumber = functuin.getWordShowNumber(s1, s2);
		System.out.println("单词个数为 :" + wordShowNumber);
	}

	/**
	 * 参数是一个英文句子，方法的功能是取得此英文句子的单词个数。
	 * 
	 * @param s
	 * 
	 * @return
	 */
	public int getWordNumber(String s) {
		int count = 1; // 单词个数
		int length = s.length();
		for (int i = 0; i < length; i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

	/**
	 * s1: 例如String str = new String("abc");实际上创建了两个String对象 s2: String
	 * 此方法传递2个String参数，返回s1中出现s2的次数。
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public int getWordShowNumber(String s1, String s2) {
		int count = 0; // 单词个数
		int startIndex = s1.indexOf(s2);
		while (startIndex != -1) {
			count++;
			s1 = s1.substring(startIndex + 6);
			startIndex = s1.indexOf(s2);

			System.out.println("s1 :" + s1);
		}

		System.out.println("count :" + count);
		return count;
	}

}
