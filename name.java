public class name {
    public static void main(String[] args) {
        String name = "Shruti Bhile";
        int vowelCount = 0;

        name = name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("My name is " + name);
        System.out.println("Number of vowels in my name: " + vowelCount);
    }
}
