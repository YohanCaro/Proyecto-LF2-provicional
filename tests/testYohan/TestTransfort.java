package testYohan;

import com.uptc.view.JDialojInRegex;

public class TestTransfort {

	public static void main(String[] args) {
		JDialojInRegex j = new JDialojInRegex();
		String regex = j.getRegex();
		String out = "";
		
		for (int i = 0; i < args.length; i++) {
			char c = regex.charAt(i);
			
			if (c == '+') {
				
			} else if (c == '*') {
				
			} else {
				
			}
			
		}
	}

}
