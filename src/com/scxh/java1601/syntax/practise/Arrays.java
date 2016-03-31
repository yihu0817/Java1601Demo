package com.scxh.java1601.syntax.practise;

public class Arrays {

	public static void main(String[] args) {
//		showSum();
		triangle();
	}
	/**
	 *  构造一个3x3的二维数组a,按行顺序为a赋1到9的自然数.
       	按矩阵形式输出数组元素、计算正对角线元素之和。
       	
       	分析: {  1  2  3  }   { a[0][0]  a[0][1]  a[0][2] }
       	     {  4  5  6  }   { a[1][0]  a[1][1]  a[1][2] }
       	     {  7  8  9  }   { a[2][0]  a[2][1]  a[2][2] }
	 */
	public static void showSum(){
		int k = 0;
		int[][] a = new int[3][3];  
		//=====按行顺序为a赋1到9的自然数.========
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				a[i][j] = ++k;
			}
		}
		
		//=====按矩阵形式输出数组元素======
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();//换行
		}
		
		//=====计算正对角线元素之和=========
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				if(i == j){
					sum = sum + a[i][j];
				}
			}
		}
		System.out.println("正对角线元素之和 :"+sum);
	}

	/**
	 * 按行顺序为一个5×5的二维数组a赋1到25的自然数，
       	然后输出该数组的左下半三角元素。
        
	        *
			*   *
			*   *   *
			*   *   *   *
			*   *   *   *   *
			                            a[i][j]
			1	                        a[0][0]  //i==j
			6	7	                    a[1][0]  a[1][1]     //i>=j 
			11	12	13	                a[2][0]  a[2][1]  a[2][2]  // i>=j
			16	17	18	19	            a[3][0]  a[3][1]  a[3][2]  a[3][3]  // i >= j
			21	22	23	24	25          a[4][0]  a[4][1]  a[4][2]  a[4][3]  a[4][4]  //i>=j
			
	 */
	public static void triangle(){
		int k = 0;
		int[][] a = new int[5][5];  
		//=====按行顺序为a赋1到9的自然数.========
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				a[i][j] = ++k;
			}
		}
		
		//=====按矩阵形式输出数组元素======
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				if(i >= j){
					System.out.print(a[i][j] + "\t");
				}
			}
			System.out.println();//换行
		}
	}
}
