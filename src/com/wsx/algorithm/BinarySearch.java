package com.wsx.algorithm;

public class BinarySearch {
	public static void main(String[] args) {
		int[] intArray = {1, 3, 5, 7, 9};
		binarySearch(intArray, 7);
		binarySearch(intArray, 10);
	}

	//���ַ�����
	public static void binarySearch(int[] intArray, int item) {
		//������Сֵ�±�
		int low = 0;
		//�������ֵ�±�
		int high = intArray.length -1;
		//�����鷶Χ��ѭ������
		while(low <= high) {
			//�����м�ֵ�±�
			int mid = (low + high) / 2;
			//�����м�ֵ
			int guess = intArray[mid];
			//���ҵ���ֵ�� ��ӡ��ֵ����λ�ò��ж�ѭ��
			if(guess == item) {
				System.out.println(mid + 1);
				break;
			}
			//���м�ֵ����ֵ�����ֵ�±��Ϊ�м�ֵ�±��һ������Сֵ��Χ�ڲ���
			else if(guess > item) {
				high = mid - 1;
			}
			//���м�ֵ����ֵС����Сֵ�±��Ϊ�м�ֵ�±��һ�����ڴ�ֵ��Χ�ڲ���
			else {
				low = mid + 1;
			}
		}
		//���������鷶Χ��˵����������������
		if(low > high) {
			System.out.println("None");
		}
	}
}
