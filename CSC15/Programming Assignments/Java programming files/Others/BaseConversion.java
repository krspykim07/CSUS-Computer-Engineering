public class BaseConversion {
    
    public static void main(String[] args){
        int integer = 62;
        String binary = "111110";
        String hexadecimal = "3e";

        System.out.println(toInt(hexadecimal,16));
        System.out.println(toInt(binary,2));
        System.out.println(toHex(binary));
        System.out.println(toHex(integer));
        System.out.println(toBinary(hexadecimal));
        System.out.println(toBinary(integer));
    }
    
    public static int toInt(String number,int base){
        int integer = Integer.parseInt(number,base);
        return integer;
    }
    
    public static String toHex(String number){
        int integer = toInt(number,2);
        String hexadecimal = Integer.toHexString(integer);
        return hexadecimal;
    }

    public static String toHex(int number){
        String hexadecimal = Integer.toHexString(number);
        return hexadecimal;
    }
    
    public static String toBinary(String number){
        int integer = toInt(number, 16);
        String binary = Integer.toBinaryString(integer);
        return binary;
    }

    public static String toBinary(int number){
        String binary = Integer.toBinaryString(number);
        return binary;
    }
}