package black_box_integer;

import black_box_integer.com.peshoslav.BlackBoxInt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
		Scanner scanner = new Scanner(System.in);
		Class<BlackBoxInt> boxClass = BlackBoxInt.class;
		Constructor constr = boxClass.getDeclaredConstructor();
		constr.setAccessible(true);
		BlackBoxInt blackBox = (BlackBoxInt) constr.newInstance();

		HashMap<String, Method> methods = new HashMap<>();
		Method[] allMethods = blackBox.getClass().getDeclaredMethods();
		for (Method method : allMethods) {
			methods.put(method.getName(),method);
		}
		String debug = "";
		while(true){
			String[] line = scanner.nextLine().split("_");
			if(line[0].equals("END")){
				break;
			}
			String command = line[0];
			int n  =Integer.parseInt(line[1]);

			Method method = boxClass.getDeclaredMethod(command,int.class);
			method.setAccessible(true);
			method.invoke(blackBox,n);
			Field field = boxClass.getDeclaredField("innerValue");
			field.setAccessible(true);
			System.out.println(field.get(blackBox));
		}
	}
}
