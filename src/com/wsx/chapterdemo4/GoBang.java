package com.wsx.chapterdemo4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GoBang {
	public static void main(String[] args) throws Exception{
		GoBang gb = new GoBang();
		gb.initBoard();
		gb.printBoard();
		//��ȡ��������ķ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		//br.readLine():�ڼ���������һ�����ݰ��س�������������ݱ�br��ȡ
		while((inputStr = br.readLine()) != null){
			//���û�������ַ����Զ���(,)���ָ�����ָ��������ַ���
			String[] posStrArr = inputStr.split(",");
			//�������ַ���ת�����û����������
			int xPos = Integer.parseInt(posStrArr[0]);
			int yPos = Integer.parseInt(posStrArr[1]);
			//�Ѷ�Ӧ����Ԫ�ظ�ֵΪ"��"
			gb.board[yPos - 1][xPos - 1] = "��";
			gb.printBoard();
			System.out.println("����������������꣬Ӧ��(x,y)�ĸ�ʽ��");
		}
	}
	
	//�������̴�С
	private static int BOARD_SIZE = 15;
	//�����ά���鵱������
	private String[][] board;
	
	public void initBoard(){
		//��ʼ����������
		board = new String[BOARD_SIZE][BOARD_SIZE];
		//��ÿ��Ԫ�ظ�ֵΪ"+"�������ڿ���̨��������
		for(int i = 0; i < BOARD_SIZE; i++){
			for(int j = 0; j < BOARD_SIZE; j++){
				board[i][j] = "+";
			}
		}
	}

	//�ڿ���̨������̵ķ���
	public void printBoard(){
		//��ӡÿ������Ԫ��
		for(int i = 0; i < BOARD_SIZE; i++){
			for(int j = 0; j < BOARD_SIZE; j++){
				//��ӡ����֮�󲻻���
				System.out.print(board[i][j]);
			}
			//ÿ��ӡ��һ������Ԫ�غ����һ�����з�
			System.out.print("\n");
		}
	}
}
