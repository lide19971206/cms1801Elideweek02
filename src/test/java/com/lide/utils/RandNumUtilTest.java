package com.lide.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.lide.domain.TPS;

class RandNumUtilTest {

	@Test
	void test() throws Exception {
		/*
		 * double d = RandNumUtil.getValue(10.00,20.00,0); int i =
		 * RandNumUtil.random(1,3); String string = ZHStringUtil.getZHString(10); String
		 * zhName = ZHStringUtil.getZHName(); System.out.println(zhName);
		 */
		for (int j = 1; j <= 100; j++) {
			TPS t = new TPS();
			//id从1开始递增(5分)
			t.setId(BigInteger.valueOf(j));
			//专家姓名属性值调用ZHStringUtil的getZHName()(5分)
			t.setName(ZHStringUtil.getZHName());
			//年龄属性值调用RandomUtil.random()创建，必须在1-100岁之间(5分)
			t.setAge(RandNumUtil.random(1,100));
			//薪酬是3万到8万，小数点后2位的随机数(5分)
			t.setManey(BigDecimal.valueOf(RandNumUtil.getValue(30000,80000,2)));
			//聘用日期属性值模拟2012年1月1日至今任意随机时间（5分）
			Calendar c = Calendar.getInstance();
			c.set(2012, 0, 1);
			Date date = DateUtil.random(c.getTime(), new Date());
			t.setCreated(date);
			System.out.println(t);
		}
	}

}
