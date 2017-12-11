package com.wsx.chapterdemo4;

import java.util.Arrays;

public class Num2Rmb {
	public static void main(String[] args){
		Num2Rmb nr = new Num2Rmb();
		System.out.println(Arrays.toString(nr.divide(475786939.442)));
		System.out.println(nr.toHanStr("3421"));
	}
	private String[] hanArr = {"��", "Ҽ", "�E", "��", "��", "��", "½", "��", "��", "��"};
	private String[] unitArr = {"ʮ", "��", "Ǫ"};
	//��һ������ֵ��ֳ�������С���������ַ���
	private String[] divide(double num){
		//��������ǿת��long���õ���������
		long zheng = (long) num;
		//�����ȥ�����õ�С����С����100ȡ���õ���λС��
		long xiao = Math.round((num - zheng) * 1000);
		return new String[]{zheng + "", String.valueOf(xiao)};
	}
	//����λ�����ַ�����ɺ����ַ���
	private String toHanStr(String numStr){
		String result = "";
		int numLen = numStr.length();
		//���α���
		for(int i = 0; i < numLen; i++){
			//char���ͺ�int����ASCII�����48���������ת��,��'4'ת����4
			int num = numStr.charAt(i) - 48;
			//����������һλ�����Ҳ�Ϊ�㣬��ӵ�λ
			if(i != numLen - 1 && num != 0){
				result += hanArr[num] + unitArr[numLen - 2 -i];
			}
			//���򲻼ӵ�λ
			else{
				result += hanArr[num];
			}
		}
		return result;
	}
}
