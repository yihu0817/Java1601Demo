package com.scxh.java1601.syntax.ex01;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Utils {
	public static void main(String[] args) {
//		testRandom();
		testDateTime();
	}
	/**
	 * 日期日间
	 */
	public static void testDateTime(){
//		long timeM = System.currentTimeMillis();
//		System.out.println(timeM);
		
		Calendar calendar = Calendar.getInstance();
		Date data = calendar.getTime();
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		String str = simpleFormat.format(data);
		
		System.out.println(str);
	}
	
	/**
	 * 随机数
	 */
	public static void testRandom(){
		
		for(int i = 0; i < 100; i++){
			double number = Math.random(); // 产生一个0.0 - 1.0之间的随机数
			int randomInt = (int) (number * 100);
			
			System.out.print(randomInt + "\t");
			if((i+1)% 4== 0){
				System.out.println();
			}
		}
		
	}
	/**
	 * Arrays类测试
	 * @param a
	 */
	public static void testArrays(int [] a){
		Arrays.sort(a);
	}
	
	
	/**
     * 获取前一天日期yyyyMMdd
     * @see 经测试，针对闰年02月份或跨年等情况，该代码仍有效。测试代码如下
     * @see calendar.set(Calendar.YEAR, 2013);
     * @see calendar.set(Calendar.MONTH, 0);
     * @see calendar.set(Calendar.DATE, 1);
     * @see 测试时，将其放到<code>calendar.add(Calendar.DATE, -1);</code>前面即可
     * @return 返回的日期格式为yyyyMMdd
     */
    public static String getYestoday(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        return new SimpleDateFormat("yyyyMMdd").format(calendar.getTime());
    }
    
    
    /**
     * 获取当前的日期yyyyMMdd
     */
    public static String getCurrentDate(){
        return new SimpleDateFormat("yyyyMMdd").format(new Date());
    }
    
    
    /**
     * 获取当前的时间yyyyMMddHHmmss
     */
    public static String getCurrentTime(){
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    }
}
