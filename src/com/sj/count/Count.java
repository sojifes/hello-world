package com.sj.count;

import java.util.Scanner;

/*
 * ����ѧУ�۲�ֵ�С����
 * �ܷ� = ˼�� * 0.25 + רҵ * 0.6 + ���� * 0.15
 * ˼��������ʷ� = ������ + �Ƽӷ� - �ƿ۷�
 * ѧҵ���ʷ� = ���ޡ�ѡ�޿μ�Ȩƽ���ɼ���ѧ�ּ�Ȩƽ���֣� �� 0.8 �� �ԡ����޿μ���������ÿ�żӣ��֣��� ѧ�����Ƽ����ܼӷ�
 * �������ʷ� = (�Ļ����ʻ����� + ���ʽ������Գɼ� * 0.4) + �Ƽӷ� - �ƿ۷�
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
		System.out.println("��������ѡ��ӷֻ�۷ֵ���Ŀ��");
		System.out.println("(1)��˼��������ʷ֣�");
		System.out.println("(2)��ѧҵ���ʷ֣�");
		System.out.println("(3)���������ʷ֣�");
		System.out.print("(������)��");
		Scanner in = new Scanner(System.in);
		double flag = in.nextDouble();
		System.out.println();
		if(flag == 1) {
			System.out.println("(1)��˼��������ʷ֣�");
			nums += num1;
			System.out.println("�Ѹ��������֣�" + nums);
			num1 = entry(nums);
			System.out.println("˼��������ʷ֣�" + num1);
		} else if(flag == 2) {
			System.out.println("(2)��ѧҵ���ʷ֣�");
			System.out.print("���������ѧ�ּ�Ȩƽ���֣�");
			double goal = in.nextDouble(); //ѧ�ּ�Ȩƽ����
			nums = (nums += goal) * 0.8;
			System.out.println("�Ѹ��������֣�" + nums);
			num2 = entry(nums);
			System.out.println("ѧҵ���ʷ֣�" + num2);
		} else if(flag == 3) {
			System.out.println("(3)���������ʷ֣�");
			nums += num3;
			System.out.println("�Ѹ��������֣�" + nums);
			num3 = entry(nums);
			System.out.println("�������ʷ֣�" + num3);
		} else {
			System.out.println("�����˳�" + nums);
			System.exit(0);
		}
	}
	
	public double entry(double nums) {
		int choice = 0;
		double goal = 0; //�ӷֻ����
		Scanner in = new Scanner(System.in);
		System.out.println("��ʼ��Ϊ��"+ nums);
		System.out.println("����ѡ��Ը���Ŀ�ӷֻ����(1��2)�����������˳���");
		choice = in.nextInt();
		
		//System.out.println("������Ϊ" + choice);
		switch(choice) {
		case 1:
			System.out.println("�����������е��Ǽӷ����㣬����0�˳����㣺");
			System.out.println("������ӷ��������Կո����ͬʱ���������ݣ���");	
			while(true) {
				goal = in.nextDouble();
				if(nums >= 100) {
					System.out.println("����Ŀ�����Ѿ�����100����100����");
					nums = 100;
					System.out.println("����Ŀ����Ϊ��"+ nums);
					break;
				}
				if(goal == 0) {
					System.out.println("����Ŀ����Ϊ��"+ nums);
					break;
				}
				nums += goal;
			}
			break;
		case 2:
			System.out.println("�����������е��Ǽ������㣬����0�˳����㣺");
			System.out.println("����������������Կո����ͬʱ���������ݣ���");	
			while(true) {
				goal = in.nextDouble();
				if(goal == 0) {
					System.out.println("����Ŀ����Ϊ��"+ nums);
					break;
				}
				nums += goal;
			}
			break;
		/*
		default:
	
			System.out.println("�����˳�");
			System.exit(0);
		*/
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
	public void count() {
		//�������յ÷�
		//System.out.println(num1 + " " + num2 + " " + num3);
		System.out.print("������ܷ�Ϊ��");
		num1 *= 0.25;
		num2 *= 0.6;
		num3 *= 0.15;
		//System.out.println(num1 + " " + num2 + " " + num3);
		sum = num1 + num2 + num3;
		System.out.println(sum);
	}

}
