/* Программа считывает символы, которые вводит пользователь 
до тех пор пока пользователь не введет ".". Программа выводит 
количество символов и пробелов 
*/
package demoinput;

import java.util.Scanner;

public class CharCountApp{
	public static void main(String[] args){
		//System.out.println("Вводите символы через пробел. Для выхода введите символ . (точка)");

		char [] symbol;
		char end = '\u0000';
		int spacecount = 0;
		int symbolcount = 0;
		
		System.out.println("Поехали!Вводите сивол и нажимайте <Enter>.");
        System.out.println("Для выхода из програмы введите символ '.'(точка)");

        Scanner userinput = new Scanner(System.in);


		do{
			String userline = userinput.nextLine();
			//System.out.println(userline);
			//System.out.println(userline.length());
			symbol = userline.toCharArray();
			for(int i = 0; i < userline.length(); i++){
				System.out.println(symbol[i]);
				if(symbol[i] == '\u002e'){
					symbolcount++;
					System.out.println("Вы ввели символов " + symbolcount + " и пробелов " + spacecount);
					end = symbol[i];
					break;
				}if(symbol[i] != '\u0020'){
						symbolcount++;
					System.out.println("символы " + symbolcount);
					}else
						spacecount++;
					System.out.println("пробелы " + spacecount);
				}

			System.out.println("theend" + (int)end);

			System.out.println("Для выхода из програмы введите символ '.'(точка)");
			

		}while(end != '\u002e');

		
	}
}
