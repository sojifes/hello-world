package com.sj.count;

/*
 * ����ѧУ�۲�ֵ�С����
 * �ܷ� = ˼�� * 0.25 + רҵ * 0.6 + ���� * 0.15
 * ˼��������ʷ� = ������ + �Ƽӷ� - �ƿ۷�
 * ѧҵ���ʷ� = ���ޡ�ѡ�޿μ�Ȩƽ���ɼ���ѧ�ּ�Ȩƽ���֣� �� 0.8 �� �ԡ����޿μ���������ÿ�żӣ��֣��� ѧ�����Ƽ����ܼӷ�
 * �������ʷ� = (�Ļ����ʻ����� + ���ʽ������Գɼ� * 0.4) + �Ƽӷ� - �ƿ۷�
 */
public class CountDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("����ѧ���۲�ֵ�С����");
		System.out.println("��Դ��ַ��https://github.com/sojifes/hello-world.git");
		Count a = new Count();
		for(int i = 0; i < 3; i++) {
			a.start();
		}
		a.count();
	}

}
