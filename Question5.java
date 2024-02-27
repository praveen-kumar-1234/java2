public class Question5
{
    public static void main(String[] args)
    {
        String input="Welcome to CJSS Technologies 2024 **##^^";
        System.out.println("Given String is : "+input);
        String parse=input.toLowerCase();
        System.out.println(parse);
        char[] ch=parse.toCharArray();
        System.out.println("Counting the vowels & consonants:");
        int vowelCount=0,consonantCount=0;
        for (char c : ch)
        {
            if (Character.isAlphabetic(c))
            {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                {
                    vowelCount++;
                }
                else
                {
                    consonantCount++;
                }
            }
        }
        System.out.println("vowels in given String="+vowelCount);
        System.out.println("consonants in given String="+consonantCount);

    }

}
