public class DecimalToHexa {

    public static void main(String[] args) {
        int decimal = 2545; 

        
        String hexadecimal = convertDecimalToHexadecimal(decimal);

        System.out.println("Decimal: " + decimal + " -> Hexadecimal: " + hexadecimal);
    }


    private static String convertDecimalToHexadecimal(int decimal) {
        
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', 
                            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
      
        StringBuilder hex = new StringBuilder();

        
        while (decimal > 0) {
            
            int remainder = decimal % 16;
            hex.append(hexDigits[remainder]);

          
            decimal = decimal / 16;
        }

   
        return hex.reverse().toString();
    }
}
