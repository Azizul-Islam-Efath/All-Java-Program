package Projects;

public class Number_conversion {

    public static void main(String[] args) {

        // Binary to Decimal
        String bin = "1010";
        Integer decimal = Integer.parseInt(bin, 2);
        System.out.println("DECIMAL = " + decimal);

        //Octal to Decimal
        String octal = "675";
        Integer Decimal = Integer.parseInt(octal, 8);
        System.out.println("DECIMAL  = " + Decimal);

        //Hexa decimal to decimal
        String HexaDecimal = "F";
        Integer DEcimal = Integer.parseInt(HexaDecimal, 16);
        System.out.println("HEXA DECIMAL TO DECIMAL = " + DEcimal);

        //**Decimal to binary
        int dec = 15;

        String binary = Integer.toBinaryString(dec);
        System.out.println("DECIMAL TO BINARY = " + binary);

        //**DECIMAL TO OCTAL
        int deci = 15;

        String oct = Integer.toOctalString(deci);
        System.out.println("DECIMAL TO OCTAL = " + oct);
        
        

    }

}
