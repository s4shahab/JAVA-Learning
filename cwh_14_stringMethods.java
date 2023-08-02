public class cwh_14_stringMethods {
    public static void main(String[] args) {
        String name="Harry";
        System.out.println(name);
        System.out.println(name.length());
        int value=name.length();
        System.out.println("the length of name is "+value);

        String a="The harrY";
        System.out.println(a.toLowerCase());

        String tolower=a.toLowerCase();
        System.out.println("the lower case is :"+tolower);


        String notrim="   Shahab Uddin";
        System.out.println("The trimmed string is : "+ notrim.trim());

        System.out.println(name.substring(3));
        System.out.println(name.substring(1));

        System.out.println(name.substring(2,4));

        System.out.println(name.substring(1,5));

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("rry","ier"));
        System.out.println(name.replace("r","ier"));
        System.out.println(name.startsWith("r"));
        System.out.println(name.startsWith("h"));
        System.out.println(name.startsWith("H"));

        System.out.println(name.endsWith("ry"));

        System.out.println("The character at given index is : "+name.charAt(4));

        System.out.println("The first index of character is :" +name.indexOf('r',4));

        System.out.println(name.lastIndexOf('r'));
        System.out.println(name.lastIndexOf('r',1));
        System.out.println(name.equals("harry"));
        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("harRy"));

        System.out.println("My name is :\n \"Shahab Uddin\"");
        System.out.println("sadsd\\");
    }
}
