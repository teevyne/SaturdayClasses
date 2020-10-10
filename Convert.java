public class Convert {

    private static String[] units = {
        "",
        "One ",
        "Two ",
        "Three ",
        "Four ",
        "Five ",
        "Six ",
        "Seven ",
        "Eight ",
        "Nine "
    };

    private static String[] tensToNineteen = {
          "Ten ",
          "Eleven ",
          "Twelve ",
          "Thirteen ",
          "Fourteen ",
          "Fifteen ",
          "Sixteen ",
          "Seventeen ",
          "Eighteen ",
          "Nineteen ",
    };

    private static String[] tensToNinety = {
            "",
            "",
            "Twenty",
            "Thirty",
            "Forty",
            "Fifty",
            "Sixty",
            "Seventy",
            "Eighty",
            "Ninety",
    };
    private static String[] unitsForHundreds = {
            "",
            "One hundred ",
            "Two hundred ",
            "Three hundred and ",
            "Four hundred and ",
            "Five hundred ",
            "Six hundred and ",
            "Seven hundred and ",
            "Eight hundred and ",
            "Nine hundred and "
    };

    private static String[] zerothValue = {
            "",
            "Thousand ",
            "Million ",
            "Billion ",
    };

    public static void main(String[] args) {

//        System.out.println(thousandOperation(9));
//        System.out.println(thousandOperation(19));
//        System.out.println(thousandOperation(30));
//        System.out.println(thousandOperation(35));
//        System.out.println(thousandOperation(199));
//        System.out.println(thousandOperation(230));
        System.out.println(thousandOperation(305));
//        // Bug alert. the line above produces five instead of three hundred and five
////        fix later. Others seemed to work fine
//        System.out.println(thousandOperation(999));
//        System.out.println(thousandOperation(140));
//        System.out.println(mainConversion(142));
//        System.out.println(mainConversion(1142));
//        System.out.println(mainConversion(13142));
//        System.out.println(mainConversion(134142));
//        System.out.println(mainConversion(11345142));
//        System.out.println(mainConversion(112455142));
//        System.out.println(mainConversion(100000));
//        System.out.println(mainConversion(153222));
//        System.out.println(mainConversion(14500000));

        for(int i = 100; i <= 200; i++){
            System.out.println(mainConversion(i));
        }
    }

    public static String mainConversion(long number){
        String output = "";
        int counter = 0;

        while (number > 0){
            int num = (int) (number % 1000);
            if (num != 0){
                String newOutput = thousandOperation(num);
                output = newOutput + zerothValue[counter] + output;
            }

            number = number / 1000;
            counter++;
        }

        return output;
//        return output + "Naira only";
//        int num = number % 1000;
//        output = thousandOperation(num);
//        System.out.println(output);
//
//        return  output;
//        while (num > 0){
//            finalString = thousandOperation(num) + zerothValue[counter] + initialString;
//            counter++;
//            // one hundred and thirty thousand, three hundred and twenty two
//        }
    }


    public static String thousandOperation(long number){
        int num = (int) number % 100;
        String outputString = "";
        if (num < 10){
            outputString = outputString + units[num];
        }
        else if (num < 20){
            outputString = outputString + tensToNineteen[num % 10];
        }
        else{
//            outputString = units[num] + " hundred " + tensToNinety[num / 10] + units[num % 10];
//            outputString = unitsForHundreds[(int) (number / 100)] + tensToNinety[num / 10] + " " + units[num % 10];
            outputString = tensToNinety[num / 10] + " " + units[num % 10];
        }

        if (number / 100  > 0)
            return unitsForHundreds[(int) (number / 100)] + outputString;
        else
            return outputString;
    };
}

