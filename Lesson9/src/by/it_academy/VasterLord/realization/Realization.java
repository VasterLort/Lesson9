package by.it_academy.VasterLord.realization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Realization {
	public void start(){
		System.out.println("¬ведите строку");
		String str = inputS();
		System.out.println("¬ведите символ дл€ замены");
		String sym = inputS();
		System.out.println("¬ведите индекс какого элемента в слове надо заменить");
		int index = input();
		String[] str_array = str.split("\\s+");
		String str_last = null;
		
		for(int i = 0; i < str_array.length; i++){
			String[] c = str_array[i].split("[а-€]+");
			if(c.length <= index){
				for(int j = 0; j < index; j++){
					str_last += c[j];
					int cou = j;
					cou++;
					if(cou == index){
						str_last += sym;
					}
				}
				for(int j = 1 + index; j < index; j++){
					str_last += c[j];
				}
			}
		}
		System.out.println(str_last);
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
}
