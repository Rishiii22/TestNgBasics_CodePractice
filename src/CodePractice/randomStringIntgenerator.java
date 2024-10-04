package CodePractice;

import java.util.Random;

public class randomStringIntgenerator {

	public String randomStringGen(int length)
	{
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
	}
	
	public int randomIntgenerator(int maxValue)
	{
		Random random=new Random();
		return random.nextInt(maxValue)+1;
	}
}
