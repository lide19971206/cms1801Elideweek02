package com.lide.utils;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class RandNumUtil {
	
	//获得指定范围的随机小数,精度scale表示小数点后位数
	public static double getValue(final double min, final double max,final int scale){
			//TODO 实现代码
			double newNum = Math.random()*(max-min+1)+min;
			String str = "0.0";
			//循环判定取几位小数
			if (scale==0) {
				String st = newNum+"";
				String string = st.substring(0,st.indexOf(".")-1);
				return Double.parseDouble(string);
			}else {
				for (int i = 1; i < scale; i++) {
					str+="0";
					
				}	
			}
			DecimalFormat format = new DecimalFormat(str);
			return Double.parseDouble(format.format(newNum));
		}
	//返回min-max之间的随机整数（包含min和不包含max值)
	public static int random(int min, int max){
		Random r = new Random();
		int i = r.nextInt(max-min)+min;
		return  i;
		//TODO 实现代码
		} 

}
