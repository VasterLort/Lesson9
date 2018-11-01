package by.it_academy.VasterLord.realization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Realization {
	public void start(){
		int s = 0;
		while(s!=3) {
			System.out.println("1 - Поменять символ");
			System.out.println("2 - Вставка указанного слова");
			System.out.println("3 - Выход");
			s = input();
			System.out.println();
			
			if(s == 1)changeSymbol();
			else if(s==2)insertIntoString();
			
		}
	}
	
	private void changeSymbol() {
		System.out.print("Введите строку: ");
		String str = inputS();
		System.out.print("Введите символ, для замены: ");
		char sym = inputC();
		System.out.print("Номер символа в слове, которое хотите заменить: ");
		int index = input();
		String[] str_array = str.split("\\s");
		String string = "";
		int j = 0;
		
		for(int i = 0; i < str_array.length; i++){
			char[] symbol = str_array[i].toCharArray();
			if(symbol.length >= index) {
				int ind = index - 1;
				symbol[ind] = sym;
			}
			String s = new String(symbol);
			string += s + " ";
			j++;
		}
		System.out.println("Измененная строка: " + string);
		System.out.println();
	}
	
	private void insertIntoString() {
		System.out.print("Введите строку: ");
		String str1 = inputS();
		System.out.print("Введите подстроку для замены: ");
		String str2 = inputS();
		System.out.print("Введите строку для подстановки: ");
		String str3 = inputS();
	
		String[] str_array = str1.split("\\s");
		StringBuilder str = new StringBuilder(str1);
		
		int line = 0;
		int n = str2.length()-1;
		for(int i = 0; i<str_array.length; i++) {
			int k = str_array[i].length()-1;
			int num = k - n + line;
			line +=	str_array[i].length();
			String s = str.substring(num, line);
			if(str_array[i].contains(str2) && s.equals(str2)){
				str.insert(line, str3);
				line += str3.length();
			}
			line++;
		}
		System.out.println(str);
		System.out.println();
	}
	private int input(){
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int index = 0;
		try{
			index = Integer.parseInt(read.readLine());
		}catch(IOException e){e.printStackTrace();}
		return index;
	}
	
	private String inputS(){
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try{
			str = read.readLine();
		}catch(IOException e){e.printStackTrace();}
		return str;
	}
	
	private char inputC(){
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try{
			str = read.readLine();
		}catch(IOException e){e.printStackTrace();}
		return str.charAt(0);
	}
}
