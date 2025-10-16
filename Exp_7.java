import java.util.*; public class Exp_7 {
public static String gpn() { Random rnd = new Random();
StringBuilder pn = new StringBuilder();
	
for (int i = 0; i < 3; i++) {
char letter = (char) ('A' + rnd.nextInt(26)); pn.append(letter);
}

for (int i = 0; i < 4; i++) { int digit = rnd.nextInt(10); pn.append(digit);
}

return pn.toString();
}

public static void main(String[] args) { System.out.println(gpn());
}
}

