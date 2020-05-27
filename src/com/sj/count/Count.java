package com.sj.count;

import java.util.Scanner;

/*
 * ����ѧУ�۲�ֵ�С����
 * �ܷ� = ˼�� * 0.25 + רҵ * 0.6 + ���� * 0.15
 * ˼��������ʷ� = ������ + �Ƽӷ� - �ƿ۷�
 * ѧҵ���ʷ� = ���ޡ�ѡ�޿μ�Ȩƽ���ɼ���ѧ�ּ�Ȩƽ���֣� �� 0.8 �� �ԡ����޿μ���������ÿ�żӣ��֣��� ѧ�����Ƽ����ܼӷ�
 * �������ʷ� = (�Ļ����ʻ����� + ���ʽ������Գɼ� * 0.4) + �Ƽӷ� - �ƿ۷�
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
		System.out.println("��ѡ��ӷֻ�۷ֵ���Ŀ��");
		System.out.println("(1)��˼��������ʷ֣�");
		System.out.println("(2)��ѧҵ���ʷ֣�");
		System.out.println("(3)���������ʷ֣�");
		System.out.println("(0)���˳�����");
		System.out.print("�����ţ�");
		Scanner in = new Scanner(System.in);
		double flag = in.nextDouble();
		System.out.println();
		if(flag == 1) {
			System.out.println("(1)��˼��������ʷ֣�");
			nums += num1;
			System.out.println("���趨�����֣�" + nums);
			num1 = getInput(nums);
			System.out.println("˼��������ʷ֣�" + num1);
			System.out.println();
		} else if(flag == 2) {
			System.out.println("(2)��ѧҵ���ʷ֣�");
			System.out.print("����������ǣ�1��ѧ�ּ�Ȩƽ���֣�2�������֣����������˳�����:");
			int num = in.nextInt();
			if(num == 1) {
				System.out.print("���������ѧ�ּ�Ȩƽ���֣�");
				double goal = in.nextDouble(); //ѧ�ּ�Ȩƽ����
				nums = (nums += goal) * 0.8;
				System.out.println("���趨�����֣�" + nums);
			} else if(num ==2) {
				System.out.print("��������Ļ����֣�");
				nums = in.nextDouble();
				System.out.println("���趨�����֣�" + nums);
			} else {
				System.out.println("�����˳�");
				System.exit(0);
			}
			num2 = getInput(nums);
			System.out.println("ѧҵ���ʷ֣�" + num2);
			System.out.println();
		} else if(flag == 3) {
			System.out.println("(3)���������ʷ֣�");
			nums += num3;
			System.out.println("���趨�����֣�" + nums);
			num3 = getInput(nums);
			System.out.println("�������ʷ֣�" + num3);
			System.out.println();
		} else {
			System.out.println("�����˳�");
			System.exit(0);
		}
	}
	
	public double getInput(double nums) {
		int choice = 0;  //ѡ��
		Scanner in = new Scanner(System.in);
		System.out.print("����ѡ��Ը���Ŀ�ӷֻ����(1��2)�����������˳���");
		choice = in.nextInt();
		
		//System.out.println("������Ϊ" + choice);
		switch(choice) {
		case 1:
			System.out.println("�����������е��Ǽӷ����㣬����0�˳����㣺");
			System.out.print("������ӷ��������Կո����ͬʱ���������ݣ���");	
			nums = getGoal(nums);
			break;
		case 2:
			System.out.println("�����������е��Ǽ������㣬����0�˳����㣺");
			System.out.print("����������������Կո����ͬʱ���������ݣ���");	
			nums = getGoal(nums);
			break;
		default:
			System.out.println("���˳����㣬��ѡ����һ����Ŀ");
		}
		
		/*
		try(Scanner in = new Scanner(System.in)) {
			
		} catch(Exception ex) {
			System.out.println("�����쳣��������ֹ" + ex.toString());
		}
		*/
		//System.out.println("�ҵ�������");
		return nums;
	}
	
	public double getGoal(double nums) {
		double goal = 0;
		Scanner in = new Scanner(System.in);
		while(true) {
			goal = in.nextDouble();
			if(nums >= 100) {
				System.out.println("����Ŀ�����Ѿ�����100����100����");
				nums = 100;
				break;
			}
			if(goal == 0) {
				System.out.println("���˳�����");
				break;
			}
			nums += goal;
		}
		return nums;
	}
	
	public void count() {
		//�������յ÷�
		double sum = 0;
		//System.out.println(num1 + " " + num2 + " " + num3);
		num1 *= rate1;
		num2 *= rate2;
		num3 *= rate3;
		System.out.println(num1 + " " + num2 + " " + num3);
		sum = num1 + num2 + num3;
		System.out.print("�����ѧ���۲��ܷ�Ϊ��");
		System.out.println(sum);
	}

}
