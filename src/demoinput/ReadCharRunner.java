/*Программа читает символы которые вводит пользователь.
После каждого ввода необходимо нажимать пробел.
Программа подсчитывает и выводит количество введеных
пользователем символов и пробелов. Программа 
выводит количество символов и пробелов после ввода
символа "точка".
*/
package demoinput;

public class ReadCharRunner {
public static void main(String[] args) {
int userinput, symbolcount = 0, spacecount = 0;
char symbol;
System.out.println("Поехали!Вводите сивол и нажимайте <Enter>.");
System.out.println("Для выхода из програмы введите символ"."(точка)");

try {
		do{
			userinput = System.in.read();
			symbol = (char)userinput;

			if(symbol != '\u0020' && symbol != 10){
				symbolcount++;
			}if(symbol == '\u0020'){
				spacecount++;
			}

		}while(symbol != '\u002e');

		System.out.println("введено символов = " + symbolcount + " и пробелов = " + spacecount);

} catch (java.io.IOException e) {
e.printStackTrace();
}
}
}