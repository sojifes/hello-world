package com.sj.count;

import java.util.Scanner;

/*
 * 计算学校综测分的小程序
 * 总分 = 思德 * 0.25 + 专业 * 0.6 + 文体 * 0.15
 * 思想道德素质分 = 基础分 + ∑加分 - ∑扣分
 * 学业素质分 = 必修、选修课加权平均成绩（学分加权平均分） × 0.8 ＋ 自、辅修课及格门数（每门加１分）＋ 学术及科技技能加分
 * 文体素质分 = (文化素质基础分 + 体质健康测试成绩 * 0.4) + ∑加分 - ∑扣分
 */
public class Count implements Info{
	private double num1 = goal1;
	private double num2 = 0;
	private double num3 = goal3;
	
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
	
	public void start() {
		double nums = 0;
		System.out.println("请选择加分或扣分的项目：");
		System.out.println("(1)、思想道德素质分：");
		System.out.println("(2)、学业素质分：");
		System.out.println("(3)、文体素质分：");
		System.out.println("(0)、退出程序");
		System.out.print("输入编号：");
		Scanner in = new Scanner(System.in);
		double flag = in.nextDouble();
		System.out.println();
		if(flag == 1) {
			System.out.println("(1)、思想道德素质分：");
			nums += num1;
			System.out.println("已设定基础分：" + nums);
			num1 = getInput(nums);
			System.out.println("思想道德素质分：" + num1);
			System.out.println();
		} else if(flag == 2) {
			System.out.println("(2)、学业素质分：");
			System.out.print("你想输入的是？1、学分加权平均分；2、基本分，输入其他退出程序:");
			int num = in.nextInt();
			if(num == 1) {
				System.out.print("请输入你的学分加权平均分：");
				double goal = in.nextDouble(); //学分加权平均分
				nums = (nums += goal) * 0.8;
				System.out.println("已设定基本分：" + nums);
			} else if(num ==2) {
				System.out.print("请输入你的基本分：");
				nums = in.nextDouble();
				System.out.println("已设定基础分：" + nums);
			} else {
				System.out.println("程序退出");
				System.exit(0);
			}
			num2 = getInput(nums);
			System.out.println("学业素质分：" + num2);
			System.out.println();
		} else if(flag == 3) {
			System.out.println("(3)、文体素质分：");
			nums += num3;
			System.out.println("已设定基础分：" + nums);
			num3 = getInput(nums);
			System.out.println("文体素质分：" + num3);
			System.out.println();
		} else {
			System.out.println("程序退出");
			System.exit(0);
		}
	}
	
	public double getInput(double nums) {
		int choice = 0;  //选择
		Scanner in = new Scanner(System.in);
		System.out.print("请你选择对该项目加分或减分(1或2)，输入其他退出：");
		choice = in.nextInt();
		
		//System.out.println("输入结果为" + choice);
		switch(choice) {
		case 1:
			System.out.println("程序正在运行的是加法计算，输入0退出计算：");
			System.out.print("请输入加分数（可以空格隔开同时输入多个数据）：");	
			nums = getGoal(nums);
			break;
		case 2:
			System.out.println("程序正在运行的是减法计算，输入0退出计算：");
			System.out.print("请输入减分数（可以空格隔开同时输入多个数据）：");	
			nums = getGoal(nums);
			break;
		default:
			System.out.println("已退出计算，请选择下一个项目");
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
	
	public double getGoal(double nums) {
		double goal = 0;
		Scanner in = new Scanner(System.in);
		while(true) {
			goal = in.nextDouble();
			if(nums >= 100) {
				System.out.println("该项目分数已经超过100，按100计算");
				nums = 100;
				break;
			}
			if(goal == 0) {
				System.out.println("已退出计算");
				break;
			}
			nums += goal;
		}
		return nums;
	}
	
	public void count() {
		//计算最终得分
		double sum = 0;
		//System.out.println(num1 + " " + num2 + " " + num3);
		num1 *= rate1;
		num2 *= rate2;
		num3 *= rate3;
		System.out.println(num1 + " " + num2 + " " + num3);
		sum = num1 + num2 + num3;
		System.out.print("计算该学生综测总分为：");
		System.out.println(sum);
	}

}
