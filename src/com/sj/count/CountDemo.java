package com.sj.count;

/*
 * 计算学校综测分的小程序
 * 总分 = 思德 * 0.25 + 专业 * 0.6 + 文体 * 0.15
 * 思想道德素质分 = 基础分 + ∑加分 - ∑扣分
 * 学业素质分 = 必修、选修课加权平均成绩（学分加权平均分） × 0.8 ＋ 自、辅修课及格门数（每门加１分）＋ 学术及科技技能加分
 * 文体素质分 = (文化素质基础分 + 体质健康测试成绩 * 0.4) + ∑加分 - ∑扣分
 */
public class CountDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("计算学生综测分的小程序");
		System.out.println("开源地址：https://github.com/sojifes/hello-world.git");
		Count a = new Count();
		for(int i = 0; i < 3; i++) {
			a.start();
		}
		a.count();
	}

}
