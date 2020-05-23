package com.sj.count;

import java.util.Scanner;

/*
 * 计算学校综测分的小程序
 * 总分 = 思德 * 0.25 + 专业 * 0.6 + 文体 * 0.15
 * 思想道德素质分 = 基础分 + ∑加分 - ∑扣分
 * 学业素质分 = 必修、选修课加权平均成绩（学分加权平均分） × 0.8 ＋ 自、辅修课及格门数（每门加１分）＋ 学术及科技技能加分
 * 文体素质分 = (文化素质基础分 + 体质健康测试成绩 * 0.4) + ∑加分 - ∑扣分
 */
public class Count {
	private double num1 = 80;
	private double num2 = 0;
	private double num3 = 72;
	private double sum = 0;
	
	public double getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public double getNum3() {
		return num3;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	public void choose() {
		double nums = 0;
		System.out.println("请输入你选择加分或扣分的项目：");
		System.out.println("(1)、思想道德素质分：");
		System.out.println("(2)、学业素质分：");
		System.out.println("(3)、文体素质分：");
		System.out.print("(输入编号)：");
		Scanner in = new Scanner(System.in);
		double flag = in.nextDouble();
		System.out.println();
		if(flag == 1) {
			System.out.println("(1)、思想道德素质分：");
			nums += num1;
			System.out.println("已给定基础分：" + nums);
			num1 = entry(nums);
			System.out.println("思想道德素质分：" + num1);
		} else if(flag == 2) {
			System.out.println("(2)、学业素质分：");
			System.out.print("请输入你的学分加权平均分：");
			double goal = in.nextDouble(); //学分加权平均分
			nums = (nums += goal) * 0.8;
			System.out.println("已给定基础分：" + nums);
			num2 = entry(nums);
			System.out.println("学业素质分：" + num2);
		} else if(flag == 3) {
			System.out.println("(3)、文体素质分：");
			nums += num3;
			System.out.println("已给定基础分：" + nums);
			num3 = entry(nums);
			System.out.println("文体素质分：" + num3);
		} else {
			System.out.println("程序退出" + nums);
			System.exit(0);
		}
	}
	
	public double entry(double nums) {
		int choice = 0;
		double goal = 0; //加分或减分
		Scanner in = new Scanner(System.in);
		System.out.println("初始分为："+ nums);
		System.out.println("请你选择对该项目加分或减分(1或2)，输入其他退出：");
		choice = in.nextInt();
		
		//System.out.println("输入结果为" + choice);
		switch(choice) {
		case 1:
			System.out.println("程序正在运行的是加法计算，输入0退出计算：");
			System.out.println("请输入加分数（可以空格隔开同时输入多个数据）：");	
			while(true) {
				goal = in.nextDouble();
				if(nums >= 100) {
					System.out.println("该项目分数已经超过100，按100计算");
					nums = 100;
					System.out.println("该项目分数为："+ nums);
					break;
				}
				if(goal == 0) {
					System.out.println("该项目分数为："+ nums);
					break;
				}
				nums += goal;
			}
			break;
		case 2:
			System.out.println("程序正在运行的是减法计算，输入0退出计算：");
			System.out.println("请输入减分数（可以空格隔开同时输入多个数据）：");	
			while(true) {
				goal = in.nextDouble();
				if(goal == 0) {
					System.out.println("该项目分数为："+ nums);
					break;
				}
				nums += goal;
			}
			break;
		/*
		default:
	
			System.out.println("程序退出");
			System.exit(0);
		*/
		}
		
		/*
		try(Scanner in = new Scanner(System.in)) {
			
		} catch(Exception ex) {
			System.out.println("发生异常，程序终止" + ex.toString());
		}
		*/
		//System.out.println("我到这啦！");
		return nums;
	}
	public void count() {
		//计算最终得分
		//System.out.println(num1 + " " + num2 + " " + num3);
		System.out.print("计算出总分为：");
		num1 *= 0.25;
		num2 *= 0.6;
		num3 *= 0.15;
		//System.out.println(num1 + " " + num2 + " " + num3);
		sum = num1 + num2 + num3;
		System.out.println(sum);
	}

}
