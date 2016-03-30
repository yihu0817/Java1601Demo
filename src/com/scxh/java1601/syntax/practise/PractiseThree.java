package com.scxh.java1601.syntax.practise;

import java.util.Scanner;

public class PractiseThree {

	public static void main(String[] args) {
//		getAverage();
//		getStudentNumberByScore();
//		getStudentNumberByScoreTwo();
		
		int[] scores;
		scores = getData();
		for(int i = 0; i < scores.length; i++){
			System.out.print(scores[i] + " ");
		}
		
		int avg = getAverage(scores);
		System.out.println("平均值是 :"+avg);
		
		
		int[] greaterAvgs = getGreaterData(scores,avg);
		System.out.print("大于平均值的数有 :");
		for(int i = 0; i < greaterAvgs.length; i++){
			System.out.print(greaterAvgs[i] + " ");
		}
	}
	/**
	 * 返回从键盘输入的10个整数
	 * @return
	 */
	public static int[] getData(){
		Scanner scanner = new Scanner(System.in);
		int[] arrays = new int[3];
		int length = arrays.length;  //length 数组长度
		for (int i = 0; i < length; i++) {
			System.out.println("请输入数据:");
			arrays[i] = scanner.nextInt();
		}
		return arrays;
		
	}
	/**
	 * 返回传入数组平均值
	 * @param arrays
	 * @return
	 */
	public static int getAverage(int[] arrays){
		int sum = 0; // 总和
		int length = arrays.length;
		for (int i = 0; i <length; i++) {
			sum = sum +  arrays[i];
		}
		int avg = sum/length;

		return avg;
		
	}
	/**
	 * 返回大于平均值的所有数
	 * @param arrays
	 * @param avg
	 * @return
	 */
	public static int[] getGreaterData(int[] arrays,int avg){
		//第一步：求大于平均值数的个数
		int count = 0;
		for(int i = 0; i< arrays.length; i++){
			if(arrays[i] > avg){
				count++;
			}
		}
		System.out.println("大于平均值数的个数 ："+count);
		
		int[] greaterArrays = new int[count]; //存储大于平均的所有数
		
		int k = 0;
		for(int i = 0; i< arrays.length; i++){
			if(arrays[i] > avg){
				greaterArrays[k++] = arrays[i];
			}
		}
		
		return greaterArrays;
	}
	/**
	 * 从键盘输入10个整数，输出它们的平均值以及所有超过平均值的数.用数组实现
	 * 
	 * 分析: 第一步 ： 从键盘输入10个整数存储至数组
	 *      第二步: avg = sum/10
	 *      第三步： 大于平均值的数
	 */
	public static void getAverage() {
		//====第一步 ： 从键盘输入10个整数存储至数组======
		Scanner scanner = new Scanner(System.in);
		int[] arrays = new int[10];
		int length = arrays.length;  //length 数组长度
		for (int i = 0; i < length; i++) {
			System.out.println("请输入数据:");
			arrays[i] = scanner.nextInt();
		}
        //=====第二步: avg = sum/10============
		int sum = 0; // 总和
		int item = 0; // 某一项值
		for (int i = 0; i <length; i++) {
			item = arrays[i];
			sum = sum + item;
		}
		int avg = sum/length;
		System.out.println("平均值是 :"+avg);
		
		//========第三步： 大于平均值的数=============
		for(int i = 0; i < length; i++){
			if(arrays[i] > avg){
				System.out.print(" 大于平均值数是 :"+arrays[i]);
			}
		}
		
	}
	/**
	 * 对一组学生的百分制成绩，分别统计出100分、90~99分、80~89分、…0~9分的人数。
         {79,97,68,77,89,84,62, 55,78,98,79,67,85,71,65,80,100}
                分析：
          
	 */
	public static void getStudentNumberByScore(){
		int[] count = new int[11];
		int[] scoreArrays = {79,97,68,77,89,84,62, 55,78,98,79,67,85,71,65,80,100};
		int length = scoreArrays.length;
		for(int i = 0; i< length; i++){
			int score = scoreArrays[i];
			
			switch(score/10){
			case 10:
				count[10]++;
				break;
			case 9:
				count[9]++;
				break;
			case 8:
				count[8]++;
				break;
			case 7:
				count[7]++;
				break;
			case 6:
				count[6]++;
				break;
			case 5:
				count[5]++;
				break;
			case 4:
				count[4]++;
				break;
			case 3:
				count[3]++;
				break;
			case 2:
				count[2]++;
				break;
			case 1:
				count[1]++;
				break;
			default :
				count[0]++;	
			}
		}
		
		int countLength = count.length;
		for(int i = 0; i< countLength; i++){
			if(i == 10){
				System.out.print("100 :"+count[i]+"\t");
			}else{
				System.out.print(i*10 + "----"+((i*10)+9) + " :"+count[i]+"\t");
			}
			if((i+1)%4 == 0){
				System.out.println();
			}
			
		}
		
	}
	
	public static void getStudentNumberByScoreTwo(){
		int[] count = new int[11];
		int[] scoreArrays = {79,97,68,77,89,84,62, 55,78,98,79,67,85,71,65,80,100};
		int length = scoreArrays.length;
		for(int i = 0; i< length; i++){
			int score = scoreArrays[i];
			count[score/10]++; 
		}
		
		int countLength = count.length;
		for(int i = 0; i< countLength; i++){
			if(i == 10){
				System.out.print("100 :"+count[i]+"\t");
			}else{
				System.out.print(i*10 + "----"+((i*10)+9) + " :"+count[i]+"\t");
			}
			if((i+1)%4 == 0){
				System.out.println();
			}
			
		}
		
	}
}
