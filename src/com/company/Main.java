package com.company;


import java.io.Console;
import java.io.File;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        /* Smth about beer
        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0){
            if (beerNum == 1){
                word = "botte";
            }
            System.out.println(beerNum+" "+word+" of beer on the wall");
            System.out.println(beerNum+" "+word+" of beer.");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerNum = beerNum-1;

            if (beerNum > 0){
                System.out.println(beerNum+" "+word+" of beer on the wall");
            }
            else{
                System.out.println("No more bootles of beer");
            }
        }*/


        /* Just trying smth
        int x = 0;
        int y = 0;
        while(x < 5){
            y = y+2;
            if(y>4){
                y=y-1;
            }
            System.out.print(x+""+y+" ");
            x=x+1;
        }*/

        /*int x = 0;
        while (x < 4){
            x=x+1;
            if (x < 1){
                 System.out.print("a");
            }

            if (x > 0){

            }
            if (x == 1){
                System.out.print("a ");
            }
            if (x >3){
                System.out.print("annoys");
            }
            
            System.out.println("");
            x=x+1;
        }*/
        System.out.println("Task num: ");
        int task_num = new Scanner((System.in)).nextInt();
        switch (task_num){
            case 1:
                Main.Hello_World_Name();
                break;
            case 2:
                String line = new Scanner(System.in).nextLine();
                char[] input = line.toCharArray();
                int a = 0, b;
                char symb = '+';
                String temp = "";
                for(int i=0; i<line.length(); i++){
                    if(input[i] != '-' && input[i]!='+' && input[i]!='*' && input[i]!='/'){
                        temp+=input[i];
                    }
                    else {
                        symb = input[i];
                        a = Integer.parseInt(temp);
                        temp = "";
                    }
                }
                b = Integer.parseInt(temp);
                Main.Sum_Two_Num(a, b, symb);
                break;
            case 3:
                Main.Calculate(new Scanner(System.in).nextLine());
                break;
            case 4:
                long binary1 = new Scanner(System.in).nextLong();
                long binary2 = new Scanner(System.in).nextLong();
                Main.Sum_of_Binaries(binary1, binary2);
                break;
            case 5:
                long b1 = new Scanner(System.in).nextLong();
                long b2 = new Scanner(System.in).nextLong();
                Main.Multiply_Binaries(b1, b2);
                break;
            case 6:
                int decimal = new Scanner(System.in).nextInt();
                Main.DecimalToBinary(decimal);
                break;
            case 7:
                decimal = new Scanner(System.in).nextInt();
                Main.DecimalToHex(decimal);
                break;
            case 8:
                decimal = new Scanner(System.in).nextInt();
                Main.DecimalToOctal(decimal);
                break;
            case 9:
                binary1 = new Scanner(System.in).nextLong();
                Main.BinaryToDecimal(binary1);
                break;
            case 10:
                binary1 = new Scanner(System.in).nextLong();
                Main.BinaryToHex(binary1);
                break;
            case 11:
                binary1 = new Scanner(System.in).nextLong();
                Main.BinaryToOctal(binary1);
                break;
            case 12:
                int octal = new Scanner(System.in).nextInt();
                Main.OctalToDecimal(octal);
                break;
            case 13:
                octal = new Scanner(System.in).nextInt();
                Main.OctalToBinary(octal);
                break;
            case 14:
                String octal1 = new Scanner(System.in).nextLine();
                Main.OctalToHex(octal1);
                break;
            case 15:
                String hex = new Scanner(System.in).nextLine();
                Main.HexToDecimal(hex);
                break;
            case 16:
                hex = new Scanner(System.in).nextLine();
                Main.HexToBinary(hex);
                break;
            case 17:
                hex = new Scanner(System.in).nextLine();
                Main.HexToOctal(hex);
                break;
            case 18:
                Main.IsJavaInstalled();
                break;
            case 19:
                int number = new Scanner(System.in).nextInt();
                Main.SumOfDigits(number);
                break;
            case 20:
                int side_length = new Scanner(System.in).nextInt();
                Main.AreaOfHexagon(side_length);
                break;
            case 21:
                System.out.print("Input the length of one of the sides: ");
                side_length = new Scanner(System.in).nextInt();
                System.out.print("Input the number of sides on the polygon: ");
                int num_of_sides = new Scanner(System.in).nextInt();
                Main.AreaOfPolygon(side_length, num_of_sides);
                break;
            case 22:
                System.out.print("Input string: ");
                String text = new Scanner(System.in).nextLine();
                Main.ReverseString(text);
                break;
            case 23:
                System.out.print("Text: ");
                text = new Scanner(System.in).nextLine();
                Main.Space_Num_Char(text);
                break;
            case 24:
                System.out.print("Num1: ");
                a = new Scanner(System.in).nextInt();
                System.out.print("Num2: ");
                b = new Scanner(System.in).nextInt();
                System.out.print("Num3: ");
                int c = new Scanner(System.in).nextInt();
                System.out.print("Num4: ");
                int d = new Scanner(System.in).nextInt();
                Main.Create_Unique_Nums(a, b, c, d);
                break;
            case 25:
                Main.ShowAllCharSets();
                break;
            case 26:
                Main.ShowPassword();
                break;
            case 27:
                Main.SumOfNum3(new Scanner(System.in).nextInt());
                break;
            case 28:
                Main.SizeOfFile(new Scanner(System.in).nextLine());
                break;
            case 29:
                Main.DisplaySystemTime();
                break;
            case 30:
                Main.DateTimeFormated();
                break;
            case 31:
                Main.StringToInt(new Scanner(System.in).nextLine());
                break;
            case 32:
                System.out.print("Num1: ");
                a = new Scanner(System.in).nextInt();
                System.out.print("Num2: ");
                b = new Scanner(System.in).nextInt();
                System.out.print("Num3: ");
                c = new Scanner(System.in).nextInt();
                Main.SameRightmostDigit(a, b, c);
                break;
            case 33:
                System.out.print("Seconds: ");
                int seconds = new Scanner(System.in).nextInt();
                Main.SecondsToTime(seconds);
                break;
            case 34:
                System.out.print("Input an integer: ");
                int num = new Scanner(System.in).nextInt();
                Main.FactorsOfNum(num);
                break;
            case 35:
                System.out.print("Text: ");
                text = new Scanner(System.in).nextLine();
                Main.CapitalizeFirstLetters(text);
                break;
            case 36:
                System.out.print("Text: ");
                text = new Scanner(System.in).nextLine();
                Main.ToLowercase(text);
                break;
            case 37:
                System.out.print("Text: ");
                text = new Scanner(System.in).nextLine();
                Main.PenultimateWord(text);
                break;
            case 38:
                Main.SumOfPrimeNums();
                break;
            case 39:
                Main.InsertInMiddle("Python 3.0", "Tutorial");
                break;
            case 40:
                Main.HalfOfString("Python");
                break;
            case 41:
                Main.ShortLongShort("Python", "Tutorial");
                break;
            case 42:
                Main.RemoveFirsts("Python", "Tutorial");
                break;
            case 43:
                Main.NewString(" ");
                break;
            case 44:
                int[] array = {10, -20, 0, 30, 40, 60, 10};
                Main.FirstLastSame(array);
                break;
            case 45:
                int[] array1 = {50, 20, 0};
                int[] array2 = {5, -50, 10};
                Main.NewArray(array1, array2);
                break;
            case 46:
                int[] array3 = {5, 7};
                Main.ArrayContains(array3);
                break;
            case 47:
                int[] array4 = {20, 30, 40, 50, 60, 70};
                Main.RotateArray(array4, 2);
                break;
            case 48:
                int[] array5 = {20, 30, 40, 50, 60, 70};
                Main.SwapFirstLast(array5);
                break;
            case 49:
                int[] array6 = {1, 3, -5, 4};
                int[] array7 = {1, 4, -5, -2};
                Main.MultiplyArrays(array6, array7);
                break;
            case 50:
                Main.ConcatString("Python");
                break;
            case 51:
                Main.StartsWith("Hello, how are you");
                break;
            case 52:
                Main.DivideByN(250);
                break;
            case 53:
                Main.SumOfDigitsInEnglish(52369);
                break;
            case 54:
                Main.SystemProperties();
                break;
            case 55:
                Main.isSecurityManagerInstalled();
                break;
            case 56:
                Main.environmentVariables();
                break;
            case 57:
                Main.executeTime();
                break;
            case 58:
                int[] array8 = {10, 20, 50, 5, 20, 30};
                Main.TwoNumsInArray(array8);
                break;
            case 59:
                Main.StringArray();
                break;
            case 60:
                int[] array9 = {20, 10, 50, 20, 30, 20};
                Main.NumAppears(array9, 20);
                break;
            case 61:
                int[] array10 = {20, 10, 50, 10, 30, 20};
                Main.NewArrayAfterLast(array10, 10);
                break;
            case 62:
                int[] array11 = {20, 10, 50, 10, 30, 20};
                Main.NewArrayBeforeElement(array11, 10);
                break;
            case 63:
                Main.SummOfAllDigits(5236);
                break;
            case 64:
                Main.BitOperators(55, 56);
            case 65:
                Main.SumBit(10, 12);
                break;
            case 66:
                int[] array12 = {1, 2, 5, 6};
                int[] array13 = {1, 3, 5, 8};
                Main.MergedArray(array12, array13);
            case 67:
                int[] array14 = {1,2,7,4, 8};
                Main.RotateArray(array14, 3);
                break;
            case 68:
                Main.isPolyndrome(151);
                break;
            case 69:
                Main.FizzBuzz();
                break;
            case 70:
                int[] array15 = {2, 3, 4, 5, 6, 7, 8};
                Main.ElementFound(array15, 7);
                break;
            case 71:
                int[][] matrix = new int[3][3];
                for (int row = 0; row < 3; row ++)
                    for (int col = 0; col < 3; col++)
                        matrix[row][col] = (1 + row * 3 + col);
                Main.FindInMatrix(matrix, 2);
                break;
            case 72:
                Main.RevirseLinkedList();
                break;
            case 73:
                int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
                Main.ContiguousSubarrayWithMaxSum(nums);
                break;
            case 74:
                int[] nums2 = {-2, 1, -3, 4};
                Main.ContiguousSubarrayWithMinSum(nums2);
                break;
            case 75:
                int[] nums3 = {1, 2, 4, 5, 6};
                Main.IndexInArray(nums3, 6);
                break;
            case 76:
                Main.ShowBinaryTree();
                break;
            case 77:
                int[] nums4 = {10, 20, 10, 20, 30, 40, 40, 30, 50};
                Main.AppearsOnce(nums4);
                break;
            case 78:
                Main.DepthOfTree();
                break;
            case 79:
                int[] nums5 = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
                Main.SortedArrayWithoutDuplicates(nums5);
                break;
            case 80:
                int[] nums6 = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
                Main.RemoveDublicatesTwice(nums6);
                break;
            case 81:
                int[][] grid = new int[][] {{7,4,2},
                                            {0,5,6},
                                            {3,1,2}};
                Main.minPathSum(grid);
                break;
            case 82:
                Main.ClimbToTop(5);
                break;
            case 83:
                Main.RemoveDuplicatesFromList();
                break;
            case 84:
                Main.uniquePaths(3, 4);
                break;
            case 85:
                String[] str = {
                        "cat",
                        "dog",
                        "red",
                        "is",
                        "am"
                };
                Main.LongestWord(str);
                break;
            case 86:
                int[] array16 = {1, 2, 3, -6, 5, 4};
                Main.SubarraySumZero(array16);
                break;
            case 87:
                Main.IntervalsMerge();
                break;
            case 88:
                Main.isAnagram("wxyz", "zyxw");
                break;
            case 89:
                ArrayList<Integer> list1 = new ArrayList<>();
                list1.add(1);
                list1.add(7);
                list1.add(9);
                list1.add(13);
                ArrayList<Integer> list2 = new ArrayList<>();
                list2.add(2);
                list2.add(40);
                Main.MergeLists(list1, list2);
                break;
            case 90:
                ArrayList<Integer> list3 = new ArrayList<>();
                list3.add(1);
                list3.add(7);
                list3.add(9);
                list3.add(13);
                Main.RemoveNthElement(list3, 2);
                break;
            case 91:
                Main.ArrayToBinaryTree();
                break;
            case 92:
                Main.isPermulation("xxyz", "yxzx");
                break;
            case 93:
                Main.BinaryTreeIsSubTree();
                break;
        }
    }

    public static void Hello_World_Name(){
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextLine());
    }

    public static void Sum_Two_Num(int a, int b, char symb){
        if(symb == '+'){
            System.out.println(a+b);
        }
        else if(symb == '-'){
            System.out.println(a-b);
        }
        else if(symb == '*'){
            System.out.println(a*b);
        }
        else if(symb == '/'){
            System.out.println(a/b);
        }
    }

    public static double Sum_Two_Num(double a, double b, char symb){
        if(symb == '+'){
            return a+b;
        }
        else if(symb == '-'){
            return a-b;
        }
        else if(symb == '*'){
            return a*b;
        }
        else if(symb == '/'){
            return a/b;
        }
        else return a/b;
    }

    public static void Calculate(String input){
        String bracets = "";
        boolean bracets_open = false;
        boolean bracets_close = false;
        char[] value = input.toCharArray();
        for (int i = 0; i< value.length; i++){
            if(value[i]=='('){
                bracets_open = true;
                bracets = "";
            }
            else if(value[i]==')'){
                bracets_close = true;
                Main.brackets(bracets);

                break;
            }
            else if (bracets_open == true && bracets_close == false){
                bracets+=value[i];
            }
        }
        //System.out.println(bracets);
    }

    public static double sum(String value){
        char[] input = value.toCharArray();
        double a = 0, b;
        String temp = "";
        for(int i=0; i<value.length(); i++){
            if(input[i] != '-' && input[i]!='+' && input[i]!='*' && input[i]!='/'){
                temp+=input[i];
            }
            else {
                a = Double.parseDouble(temp);
                temp = "";
            }
        }
        b = Double.parseDouble(temp);

        return Main.Sum_Two_Num(a, b, '+');
    }

    public static double divide(String value){
        char[] input = value.toCharArray();
        double a = 0, b;
        char symb = '+';
        String temp = "";
        for(int i=0; i<value.length(); i++){
            if(input[i] != '-' && input[i]!='+' && input[i]!='*' && input[i]!='/'){
                temp+=input[i];
            }
            else {
                a = Double.parseDouble(temp);
                temp = "";
            }
        }
        b = Double.parseDouble(temp);

        return Main.Sum_Two_Num(a, b, '/');
    }

    public static double multiply(String value){
        char[] input = value.toCharArray();
        double a = 0, b;
        String temp = "";
        for(int i=0; i<value.length(); i++){
            if(input[i] != '-' && input[i]!='+' && input[i]!='*' && input[i]!='/'){
                temp+=input[i];
            }
            else {
                a = Double.parseDouble(temp);
                temp = "";
            }
        }
        b = Double.parseDouble(temp);

        return Main.Sum_Two_Num(a, b, '*');

    }

    public static void brackets(String value){
        //divide
        String temp = "";
        boolean symb_found = false;
        for(int i = 0; i < value.length(); i++){
            System.out.println(temp);
            if((value.charAt(i) == '-' || value.charAt(i) == '+' || value.charAt(i) == '*') && symb_found != true){
                temp = "";
            }
            else if(value.charAt(i) == '/' && symb_found != true){
                temp += Character.toString(value.charAt(i));
                symb_found = true;
            }
            else if(symb_found == true && (value.charAt(i) == '-' || value.charAt(i) == '+' || value.charAt(i) == '*' || value.charAt(i) == '/' || value.charAt(i) == ')' || i == value.length()-1)){
                if (i == value.length()-1 && (value.charAt(i) == '-' || value.charAt(i) != '+' || value.charAt(i) != '*' || value.charAt(i) != '/' )) temp += Character.toString(value.charAt(i));
                System.out.println("Temp in brackets "+temp);
                String result = Double.toString(Main.divide(temp));
                System.out.println("Result: "+result);
                value = value.replace(temp, result);
                System.out.println(value);
                i = 0;
                symb_found = false;

            }
            else temp += Character.toString(value.charAt(i));
            if (i == value.length()-1 && symb_found != true) break;
        }

        //multiply
        for(int i = 0; i < value.length(); i++){
            System.out.println(temp);
            if((value.charAt(i) == '-' || value.charAt(i) == '+' || value.charAt(i) == '/') && symb_found != true){
                temp = "";
            }
            else if(value.charAt(i) == '*' && symb_found != true){
                temp += Character.toString(value.charAt(i));
                symb_found = true;
            }
            else if(symb_found == true && (value.charAt(i) == '-' || value.charAt(i) == '+' || value.charAt(i) == '*' || value.charAt(i) == '/' || value.charAt(i) == ')' || i == value.length()-1)){
                if (i == value.length()-1 && (value.charAt(i) == '-' || value.charAt(i) != '+' || value.charAt(i) != '*' || value.charAt(i) != '/' )) temp += Character.toString(value.charAt(i));
                System.out.println("Temp in brackets "+temp);
                String result = Double.toString(Main.multiply(temp));
                System.out.println("Result: "+result);
                value = value.replace(temp, result);
                System.out.println(value);
                i = 0;
                symb_found = false;

            }
            else temp += Character.toString(value.charAt(i));
            if (i == value.length()-1 && symb_found != true) break;
        }

        //sum
        for(int i = 0; i < value.length(); i++){
            System.out.println(temp);
            if((value.charAt(i) == '-' || value.charAt(i) == '*' || value.charAt(i) == '/') && symb_found != true){
                temp = "";
            }
            else if(value.charAt(i) == '+' && symb_found != true){
                temp += Character.toString(value.charAt(i));
                symb_found = true;
            }
            else if(symb_found == true && (value.charAt(i) == '-' || value.charAt(i) == '+' || value.charAt(i) == '*' || value.charAt(i) == '/' || value.charAt(i) == ')' || i == value.length()-1)){
                if (i == value.length()-1 && (value.charAt(i) == '-' || value.charAt(i) != '+' || value.charAt(i) != '*' || value.charAt(i) != '/' )) temp += Character.toString(value.charAt(i));
                System.out.println("Temp in brackets "+temp);
                String result = Double.toString(Main.sum(temp));
                System.out.println("Result: "+result);
                value = value.replace(temp, result);
                System.out.println(value);
                i = 0;
                symb_found = false;

            }
            else temp += Character.toString(value.charAt(i));
            if (i == value.length()-1 && symb_found != true) break;
        }


        System.out.println(value);
    }

    public static void Sum_of_Binaries(long binary1, long binary2){
        int i = 0, reminder = 0;
        int[] sum = new int[20];
        while (binary1 !=0 || binary2 !=0){
            sum[i++] = (int)((binary1 % 10+binary2 % 10 + reminder) % 2);
            reminder = (int)((binary1 % 10+binary2 % 10 + reminder) / 2);
            System.out.print("Sum: ");
            for (int var : sum) {
                System.out.print(var);
            }
            System.out.print("\nReminder: "+reminder +"\n");
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if (reminder !=0){
            sum[i++] = reminder;
        }
        --i;
        System.out.print("Sum: ");
        while (i >= 0){
            System.out.print(sum[i--]);
        }

    }

    public static int binary_sum(long binary1, long binary2){
        int i = 0, reminder = 0;
        int[] sum = new int[20];
        while (binary1 !=0 || binary2 !=0){
            sum[i++] = (int)((binary1 % 10+binary2 % 10 + reminder) % 2);
            reminder = (int)((binary1 % 10+binary2 % 10 + reminder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if (reminder !=0){
            sum[i++] = reminder;
        }
        --i;
        int binary_result = 0;
        while (i >= 0){
            binary_result = binary_result*10+sum[i--];
        }
        return binary_result;
    }

    public static void Multiply_Binaries(long binary1, long binary2){
        int digit = 0, factor = 1;
        long multiply = 0;

        while(binary2 != 0){
            digit = (int)(binary2%10);
            if(digit == 1){
                binary1 = binary1 * digit;
                multiply = Main.binary_sum(binary1, multiply);
                System.out.println("Multiply: "+ multiply);
            }
            else{
                binary1 = binary1 * factor;
            }
            binary2 = binary2/10;
            factor = 10;
        }
        System.out.print("Multiply of two binaries: "+multiply);
    }

    public static void DecimalToBinary(int decimal){
        int remainder = 0, i = 0;
        int[] bin = new int[20];
        while (decimal != 0){
            bin[i++] = decimal%2;
            decimal = decimal/2;
        }
        --i;
        while (i>=0){
            System.out.print(bin[i--]);
        }
    }

    public static void DecimalToHex(int decimal){
        Map<Integer, Character> dec_hex = new HashMap<Integer, Character>();
        dec_hex.put(0, '0');
        dec_hex.put(1, '1');
        dec_hex.put(2, '2');
        dec_hex.put(3, '3');
        dec_hex.put(4, '4');
        dec_hex.put(5, '5');
        dec_hex.put(6, '6');
        dec_hex.put(7, '7');
        dec_hex.put(8, '8');
        dec_hex.put(9, '9');
        dec_hex.put(10, 'A');
        dec_hex.put(11, 'B');
        dec_hex.put(12, 'C');
        dec_hex.put(13, 'D');
        dec_hex.put(14, 'E');
        dec_hex.put(15, 'F');
        ArrayList<Character> hex = new ArrayList<Character>();
        double temp = decimal;
        while (decimal > 0){
            hex.add(dec_hex.get(decimal%16));
            decimal = decimal/16;
        }
        String hex_result = "";
        for(int i = hex.size()-1; i>=0; i-- ){
            hex_result+=hex.get(i);
        }
        System.out.print(hex_result);
    }

    public static void DecimalToOctal(int decimal){
        Map<Integer, Character> dec_octa = new HashMap<Integer, Character>();
        dec_octa.put(0, '0');
        dec_octa.put(1, '1');
        dec_octa.put(2, '2');
        dec_octa.put(3, '3');
        dec_octa.put(4, '4');
        dec_octa.put(5, '5');
        dec_octa.put(6, '6');
        dec_octa.put(7, '7');

        ArrayList<Character> octa = new ArrayList<Character>();
        double temp = decimal;
        while (decimal > 0){
            octa.add(dec_octa.get(decimal%8));
            decimal = decimal/8;
        }
        String octal_result = "";
        for(int i = octa.size()-1; i>=0; i-- ){
            octal_result+= octa.get(i);
        }
        System.out.print(octal_result);

    }

    public static void BinaryToDecimal(long binary){
        int i = 0;
        int decimal = 0;
        while (binary != 0){
            decimal+=binary%10 * Math.pow(2, i++);
            binary = binary/10;
        }
        System.out.print(decimal);
    }

    public static void BinaryToHex(long binary){
        int i = 0;
        int decimal = 0;
        while (binary != 0){
            decimal+=binary%10 * Math.pow(2, i++);
            binary = binary/10;
        }
        Map<Integer, Character> dec_hex = new HashMap<Integer, Character>();
        dec_hex.put(0, '0');
        dec_hex.put(1, '1');
        dec_hex.put(2, '2');
        dec_hex.put(3, '3');
        dec_hex.put(4, '4');
        dec_hex.put(5, '5');
        dec_hex.put(6, '6');
        dec_hex.put(7, '7');
        dec_hex.put(8, '8');
        dec_hex.put(9, '9');
        dec_hex.put(10, 'A');
        dec_hex.put(11, 'B');
        dec_hex.put(12, 'C');
        dec_hex.put(13, 'D');
        dec_hex.put(14, 'E');
        dec_hex.put(15, 'F');
        ArrayList<Character> hex = new ArrayList<Character>();
        double temp = decimal;
        while (decimal > 0){
            hex.add(dec_hex.get(decimal%16));
            decimal = decimal/16;
        }
        String hex_result = "";
        for(int j = hex.size()-1; j>=0; j-- ){
            hex_result+=hex.get(j);
        }
        System.out.print(hex_result);
    }

    public static void BinaryToOctal(long binary){
        int i = 0;
        int decimal = 0;
        while (binary != 0){
            decimal+=binary%10 * Math.pow(2, i++);
            binary = binary/10;
        }

        Map<Integer, Character> dec_octa = new HashMap<Integer, Character>();
        dec_octa.put(0, '0');
        dec_octa.put(1, '1');
        dec_octa.put(2, '2');
        dec_octa.put(3, '3');
        dec_octa.put(4, '4');
        dec_octa.put(5, '5');
        dec_octa.put(6, '6');
        dec_octa.put(7, '7');

        ArrayList<Character> octa = new ArrayList<Character>();
        double temp = decimal;
        while (decimal > 0){
            octa.add(dec_octa.get(decimal%8));
            decimal = decimal/8;
        }
        String octal_result = "";
        for(i = octa.size()-1; i>=0; i-- ){
            octal_result+= octa.get(i);
        }
        System.out.print(octal_result);

    }

    public static void OctalToDecimal(int octal){
        int i = 0;
        int decimal = 0;
        while (octal != 0){
            decimal+=octal%10 * Math.pow(8, i++);
            octal = octal/10;
        }
        System.out.print(decimal);
    }

    public static void OctalToBinary(int octal){
        int i = 0;
        int decimal = 0;
        while (octal != 0){
            decimal+=octal%10 * Math.pow(8, i++);
            octal = octal/10;
        }

        int remainder = 0;
        i = 0;
        int[] bin = new int[20];
        while (decimal != 0){
            bin[i++] = decimal%2;
            decimal = decimal/2;
        }
        --i;
        while (i>=0){
            System.out.print(bin[i--]);
        }
    }

    public static void OctalToHex(String octal){
        int decimal = Integer.parseInt(octal, 8);
        String hex = Integer.toHexString(decimal);
        System.out.print(hex);
    }

    public static void HexToDecimal(String hex){
        int decimal = Integer.parseInt(hex, 16);
        System.out.print(decimal);
    }

    public static void HexToBinary(String hex){
        int decimal = Integer.parseInt(hex, 16);
        String binary = Integer.toBinaryString(decimal);
        System.out.print(binary);
    }

    public static void HexToOctal(String hex){
        String octal = Integer.toOctalString(Integer.parseInt(hex, 16));
        System.out.print(octal);
    }

    public static void IsJavaInstalled(){
        System.out.println("Java Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path"));
    }

    public static void SumOfDigits(int number){
        int[] digits = new int[Integer.toString(number).length()];
        int sum = 0;
        int i = 0;
        while (number > 0){
            digits[i] = number%10;
            number = number/10;
            sum+=digits[i++];
        }
        System.out.print(sum);
    }

    public static void AreaOfHexagon(int length_of_side){
        double area = (6*Math.pow(length_of_side, 2)/(4*Math.tan(Math.PI/6)));
        System.out.print("The area of the hexagon is: "+area);
    }

    public static void AreaOfPolygon(int length_of_side, int number_of_sides){
        double area = (number_of_sides*Math.pow(length_of_side, 2)/(4*Math.tan(Math.PI/number_of_sides)));
        System.out.print("The area of the polygon is: "+area);
    }

    public static void ReverseString(String text){
        int i = text.length()-1;
        while (i>=0){
            System.out.print(text.charAt(i--));
        }
    }

    public static void Space_Num_Char(String text){
        System.out.print("The string is: "+text);
        int letter = 0, space = 0, other = 0, number = 0;
        char[] charArray = text.toCharArray();
        for (char element:charArray) {
            if (Character.isDigit(element)) {
                number++;
            } else if (Character.isLetter(element)) {
                letter++;
            } else if (Character.isSpaceChar(element)) {
                space++;
            } else other++;
        }
        System.out.print("\nletters: "+letter+"\nspace: "+space+"\nnumbers: "+number+"\nother: "+other);
    }

    public static void Create_Unique_Nums(int a, int b, int c, int d){
        int max = a, min = a;
        int[] nums  = {a, b, c, d};

        boolean isrepeated = false;
        for (int num: nums) {
            int repeats = 0;
            for (int num2: nums) {
                if(num == num2){
                    repeats++;
                }
            }
            if (repeats>=2) isrepeated = true;
        }
        ArrayList<Integer> unique_nums = new ArrayList<Integer>();
        for (int num: nums) {
            if (num>=max){
                max = num;
            }
            else if(num <=min){
                min=num;
            }
        }

        for (int i=min; i<=max; i++){
            if(i == a || i == b || i == c || i == d) {
                for (int j = min; j <= max; j++) {
                    if(j == a || j == b || j == c || j == d){
                        for (int k = min; k <= max; k++) {
                            if (k == a || k == b || k == c || k == d){
                                if(i!=j && i!=k && j!=k){
                                    System.out.print(i+""+j+""+k+"\n");
                                    unique_nums.add(i*100+j*10+k);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.print("Total number of the three-digit-number is "+unique_nums.size());

    }

    public static void ShowAllCharSets(){
        Map<String, Charset> map = Charset.availableCharsets();
        for (String name:map.keySet()) {
            System.out.println(name);
        }
    }

    public static void ShowPassword(){
        System.out.print("Type password: ");
        Console cons = System.console();
        if(cons != null){
            char[] password = cons.readPassword("Password: ");
            try{
                System.out.println("Your password: "+new String(password));
            }
            finally {
                if (password != null) java.util.Arrays.fill(password, ' ');
            }
        }
        else{
            throw new RuntimeException("No console");
        }
    }

    public static void SumOfNum3(int num){
        System.out.println(num+num*10+num+num*100+num*10+num);
    }

    public static void SizeOfFile(String path){
        File file = new File(path);
        System.out.println("Size of file: "+ file.length());
    }

    public static void DisplaySystemTime(){
        System.out.format("Current Date time: %tc%n\n", System.currentTimeMillis());
    }

    public static void DateTimeFormated(){
        //2017/06/16 08:52:03.066
        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));

    }

    public static void StringToInt(String str){
        System.out.println(Integer.parseInt(str));
    }

    public static void SameRightmostDigit(int a, int b, int c){
        if(a%10==b%10 || a%10==c%10 || c%10==b%10){
            System.out.println("The result is: "+true);
        }
        else System.out.println("The result is: "+false);
    }

    public static void SecondsToTime(int seconds){
        int hour = seconds/3600;
        seconds = seconds%3600;
        int minutes = seconds/60;
        seconds = seconds%60;
        System.out.println(hour+":"+minutes+":"+seconds);
    }

    public static void FactorsOfNum(int num){
        int div = 1;
        int counter = 0;
        while (div<= num){
            if (num%div == 0) {counter++; }
            div++;
        }
        System.out.println(counter);
    }

    public static void CapitalizeFirstLetters(String text){
        String uppercase = "";
        Scanner lineScan = new Scanner(text);
        while (lineScan.hasNext()){
            String word = lineScan.next();
            uppercase += Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        System.out.println(uppercase);
    }

    public static void ToLowercase(String text){
        System.out.println(text.toLowerCase());
    }

    public static void PenultimateWord(String text){
        String last = "", penultimate = "";
        Scanner lineScan = new Scanner(text);
        while (lineScan.hasNext()){
            penultimate = last;
            last = lineScan.next();
        }
        System.out.println(penultimate);
    }

    public static void SumOfPrimeNums(){
        int sum = 0;
        for (int i = 2; i<=100; i++){
            boolean prime = true;
            for (int j = 1; j<i; j++){
                if (i%j == 0 && j != 1) prime = false;
            }
            System.out.println(i);
            if (prime == true) sum+=i;
        }
        System.out.println("Sum of the first 100 prime numbers: "+sum);
    }

    public static void InsertInMiddle(String main, String insert){
        main = main.replace(" ", " "+insert+" ");
        System.out.println(main);
    }

    public static void HalfOfString(String str){
        if (str.length()%2 == 0){
            System.out.println(str.substring(0, str.length()/2));
        }
        else System.out.println(str.substring(0, str.length()/2));
    }

    public static void ShortLongShort(String str1, String str2){
        if (str1.length() > str2.length()) System.out.println(str2+str1+str2);
        else System.out.print(str1+str2+str1);
    }

    public static void RemoveFirsts(String str1, String str2){
        System.out.print(str1.substring(1).concat(str2.substring(1)));
    }

    public static void NewString(String str){
        String text = "";
        str = str.replace(" ","#");
        if (str.length()>=3){
            text = str.substring(0, 2);
        } else {
            text = str;
            for (int i = 0; i<3-str.length(); i++){
                text+="#";
            }
        }
        System.out.print(text);
    }

    public static void FirstLastSame(int[] nums){
        if (nums.length>=2){
            if (nums[0]==nums[nums.length-1]) System.out.print(true);
        }
        else System.out.print(false);
    }

    public static void NewArray(int[] array1, int[] array2){
        int[] array3 = {array1[0], array2[array2.length-1]};
        System.out.println(Arrays.toString(array3));
    }

    public static void ArrayContains(int[] array){
        for (int a : array) {
            if (a == 4 || a == 7){
                System.out.println(true);
                break;
            }
        }
    }

    public static void RotateArray(int[] array, int rotation){
        int[] rotatedArray = new int[array.length];
        for (int i = 0; i<array.length; i++){
            if (rotation == array.length){
                rotation = 0;
            }
            rotatedArray[i] = array[rotation];
            rotation++;
        }
        System.out.println(Arrays.toString(rotatedArray));
    }

    public static void SwapFirstLast(int[] array){
        int[] result_array = array.clone();
        result_array[0] = array[array.length-1];
        result_array[result_array.length-1] = array[0];
        System.out.println(Arrays.toString(result_array));
    }

    public static void MultiplyArrays(int[] array1, int[] array2){
        int[] array = ((array1.length>=array2.length) ? new int[array2.length] : new int[array1.length]);
        for (int i = 0; i < array.length; i++){
            array[i] = array1[i]*array2[i];
        }
        System.out.println(Arrays.toString(array));
    }

    public static void ConcatString(String str){
        String text = str.substring(str.length()-3)+str+str.substring(str.length()-3);
        System.out.println(text);
    }

    public static void StartsWith(String str){
        System.out.println(str.startsWith("Hello"));
    }

    public static void DivideByN(int n){
        while (n > 1){
            if (n%2 == 0){
                System.out.println(n/2);
                n = n/2;
            }
            else {
                System.out.println(n/3+1);
                n = n/3 +1;
            }
        }
    }

    public static void SumOfDigitsInEnglish(int number){
        int[] digits = new int[Integer.toString(number).length()];
        int sum = 0;
        int i = 0;
        while (number > 0){
            digits[i] = number%10;
            number = number/10;
            sum+=digits[i++];
        }
        Map<Integer, String> digit = new HashMap<Integer, String>();
        digit.put(0, "");
        digit.put(1, "one");
        digit.put(2, "two");
        digit.put(3, "three");
        digit.put(4, "four");
        digit.put(5, "five");
        digit.put(6, "six");
        digit.put(7, "seven");
        digit.put(8, "eight");
        digit.put(9, "nine");

        Map<Integer, String> elevenths = new HashMap<Integer, String>();
        elevenths.put(10, "ten");
        elevenths.put(11, "eleven");
        elevenths.put(12, "twelve");
        elevenths.put(13, "thirteen");
        elevenths.put(14, "fourteen");
        elevenths.put(15, "fifteen");
        elevenths.put(16, "sixteen");
        elevenths.put(17, "seventeen");
        elevenths.put(18, "eighteen");
        elevenths.put(19, "nineteen");

        Map<Integer, String> tens = new HashMap<Integer, String>();
        tens.put(1, "ten");
        tens.put(2, "twenty");
        tens.put(3, "thirty");
        tens.put(4, "fourty");
        tens.put(5, "fifty");
        tens.put(6, "sixty");
        tens.put(7, "seventy");
        tens.put(8, "eighty");
        tens.put(9, "ninety");

        String text = "";
        String sum_text = Integer.toString(sum);
        if (sum_text.length() == 2){
            if (elevenths.containsKey(sum)) text = elevenths.get(sum);
            else{
                if (tens.containsKey(sum/10)) text+=tens.get(sum/10);
                if (digit.containsKey(sum%10)) text+=" "+digit.get(sum%10);
            }
        }
        if(sum_text.length() == 1){
            if (digit.containsKey(sum%10)) text+=digit.get(sum%10);
        }

        System.out.println(text);
    }

    public static void SystemProperties(){
        System.out.println("System Environemt: "+ System.getenv());
        System.out.println("System Properties: "+ System.getProperties());
    }

    public static void isSecurityManagerInstalled(){
        System.out.println("Security manager: "+ System.getSecurityManager());
    }

    public static void environmentVariables(){
        System.out.println("Environment Path: "+System.getenv("PATH"));
        System.out.println("Environment Temp: "+System.getenv("TEMP"));
        System.out.println("Environment Username: "+System.getenv("USERNAME"));
    }

    public static void executeTime(){
        long startTime = System.nanoTime();
        for (int i = 0; i< 100000; i++){
            Object obj = new Object();
        }
        long endTime = System.nanoTime() - startTime;
        System.out.println("Result time: "+endTime);
    }

    public static void TwoNumsInArray(int[] array){
        int temp = 0;
        for (int i =0; i< array.length; i++){
            if (temp == 10 && array[i]==10) System.out.println(true);
            else if (temp == 20 && array[i] == 20) System.out.println(true);
            temp = array[i];
        }
    }

    public static void StringArray(){
        String[] str = new String[10];
        for (int i = 0; i<10; i++){
            str[i] = String.valueOf(i);
        }
        System.out.println(Arrays.toString(str));
    }

    public static void NumAppears(int[] array, int num){
        int appears = 0;
        int next = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] == 20 && next!=20) appears++;
            else if (next == 20 && array[i] == 20){
                appears = 0;
                break;
            }
        }
        System.out.println(appears);
    }

    public static void NewArrayAfterLast(int[] array, int num){
        boolean isFound = false;
        ArrayList<Integer> resArray = new ArrayList<Integer>();
        for (int i = 0; i< array.length; i++){
            if (array[i] == num){
                isFound = true;
                resArray.clear();
            }
            else if(isFound == true){
                resArray.add(array[i]);
            }
        }
        int[] ret = new int[resArray.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = resArray.get(i).intValue();
        }
        System.out.println(Arrays.toString(ret));
    }

    public static void NewArrayBeforeElement(int[] array, int num){
        boolean isFound = false;
        ArrayList<Integer> resArray = new ArrayList<Integer>();
        for (int i = 0; i< array.length; i++){
            if (array[i] == num){
                isFound = true;
                break;
            }
            resArray.add(array[i]);
        }
        int[] ret = new int[resArray.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = resArray.get(i).intValue();
        }
        System.out.println(Arrays.toString(ret));

    }

    public static void SummOfAllDigits(int num){
        while (Integer.toString(num).length() > 1){
            num = SumDigits(num);
        }
        System.out.print(num);
    }

    public static int SumDigits(int number){
        int[] digits = new int[Integer.toString(number).length()];
        int sum = 0;
        int i = 0;
        while (number > 0){
            digits[i] = number%10;
            number = number/10;
            sum+=digits[i++];
        }
        return sum;
    }

    public static void BitOperators(int num1, int num2){
        System.out.printf("%d : %d \n", (10 & 12), (10 & 12));
        System.out.printf("%d : %d \n", (10 | 12), (10 | 12));
        System.out.printf("%d : %d \n", (10 ^ 12), (10 ^ 12));
        System.out.printf("%d : %d \n", (~10), (~12));
        System.out.printf("%d : %d \n", (10>>1), (12>>2));
        System.out.printf("%d : %d \n", (10>>>1), (12>>>2));
        System.out.printf("%d : %d \n", (10<<1), (12<<2));
    }

    public static void SumBit(int x, int y){
        while(y != 0){
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
            System.out.printf("Carry: %d\n", carry);
            System.out.printf("X: %d - Y: %d\n",x,y);

        }
        System.out.print("\nSum: "+x);
        System.out.print("\n");
    }

    public static void MergedArray(int[] array12, int[] array22){
        int array1[]=new int[8];
//initialization.
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
        int[] array2 = {2,5,7,8};
        System.out.println("\nArray1: "+Arrays.toString(array1));
        System.out.println("\nArray2: "+Arrays.toString(array2));
        int m =4, n=4;
        int i = m-1, j = n-1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (array1[i] > array2[j]) {
                array1[index--] = array1[i--];
            } else {
                array1[index--] = array2[j--];
            }
        }
        while (i >= 0) {
            array1[index--] = array1[i--];
        }
        while (j >= 0) {
            array1[index--] = array2[j--];
        }
        System.out.println("\nMerged array: "+Arrays.toString(array1));
    }

    public static void isPolyndrome(int num){
        String num2 = "";
        String test = Integer.toString(num);
        int i = test.length()-1;
        while (i >= 0){
            num2 += test.charAt(i);
            i--;
        }
        int rest = Integer.parseInt(num2);
        if (rest == num) System.out.print(num2+"   "+test + "  "+true);
        else System.out.print(num2+"   "+test + "  "+false);
    }

    public static void FizzBuzz(){
        for (int i = 0; i<=100; i++){
            if (i % 3 == 0) System.out.printf("%d: Fizz\n", i);
            if (i % 3 == 0 && i % 5 == 0) System.out.printf("%d: Fizz Buzz\n", i);
            if (i % 5 == 0) System.out.printf("%d: Buzz\n", i);
        }
    }

    public static void ElementFound(int[] array, int num){
        for (int i = 0; i<array.length; i++){
            if (array[i] == num) {
                System.out.printf("The index of %d is %d ", num, i);
                break;
            }
        }
    }

    public static void FindInMatrix(int[][] matrix, int num){
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j <matrix[i].length; j++){
                if (matrix[i][j] == num){
                    System.out.printf("The index of %d is %dx%d ", num, i, j);
                }
            }
        }
    }

    public static void RevirseLinkedList(){
        com.company.LinkedList list = new LinkedList();
        list.head = new LinkedList.Node(20);
        list.head.next_node = new LinkedList.Node(40);
        list.head.next_node.next_node = new LinkedList.Node(60);
        list.head.next_node.next_node.next_node = new LinkedList.Node(80);

        System.out.println("Original Linked list:");
        list.printList(list.head);
        list.head = list.reverse(list.head);
        System.out.println("");
        System.out.println("Reversed Linked list:");
        list.printList(list.head);
    }

    public static void ContiguousSubarrayWithMaxSum(int[] array){
        int sum_array = 0;
        for (int a : array) {
            sum_array+=a;
        }
        int max_sum = 0, max_start=0, max_end=0;
        int temp_sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = i; j<array.length; j++){
                temp_sum = 0;
                for (int k = i; k<=j; k++){
                    temp_sum+=array[k];
                }
                if (temp_sum >= max_sum) {
                   // if (temp_sum == sum_array) continue;
                    max_sum = temp_sum;
                    max_start = i;
                    max_end = j;
                }
            }
        }
        System.out.print("Sub array: ");
        for (int i = max_start; i <= max_end; i++){
            System.out.print(array[i]+"  ");
        }
        System.out.print("\nMax sum is "+max_sum);

    }

    public static void ContiguousSubarrayWithMinSum(int[] array){
        int sum_array = 0;
        for (int a : array) {
            sum_array+=a;
        }
        int min_sum = 0, min_start=0, min_end=0;
        int temp_sum = 0;
        for (int i = 0; i < array.length-1; i++){
            for (int j = i+1; j<array.length; j++){
                temp_sum = 0;
                for (int k = i; k<=j; k++){
                    temp_sum+=array[k];
                }
                if (temp_sum <= min_sum) {
                    // if (temp_sum == sum_array) continue;
                    min_sum = temp_sum;
                    min_start = i;
                    min_end = j;
                }
            }
        }
        System.out.print("Sub array: ");
        for (int i = min_start; i <= min_end; i++){
            System.out.print(array[i]+"  ");
        }
        System.out.print("\nMax sum is "+min_sum);

    }

    public static void IndexInArray(int[] array, int num){
        for (int i = 0; i<array.length; i++){
            if (array[i] == num) {
                System.out.printf("The index of %d is %d\n", num, i);
            }
            else if (array[i] > num && array[i-1] < num){
                System.out.printf("The possible index of %d is %d\n", num, i);
                break;
            }
        }
    }

    public static void ShowBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        TreeNode root = first;

        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

        Main.showTree(root);
    }

    public static void showTree(TreeNode node){
        if (node == null) return;
        showTree(node.left);
        showTree(node.right);
        System.out.print(node.data+" ");
    }

    public static void AppearsOnce(int[] array){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i<array.length; i++){
            int appears=0;
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j]) appears++;
            }
            if (appears < 2) nums.add(array[i]);
        }
        System.out.print("Elements appear once only: "+nums);
    }

    public static void DepthOfTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        TreeNode root = first;

        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

        System.out.println("Max: "+maxDepth(root));

    }

    public static int maxDepth(TreeNode node){
        if (node == null) return 0;
        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);
        System.out.println(leftDepth +" | "+rightDepth);
        int bigger = Math.max(leftDepth, rightDepth);
        return bigger+1;
    }

    public static void SortedArrayWithoutDuplicates(int[] array){
        int[] withoutduplicates = Main.RemoveDuplicates(array);
        System.out.print(Arrays.toString(withoutduplicates));

    }

    public static int[] RemoveDuplicates(int[] array){
        ArrayList<Integer> new_array = new ArrayList<>();
        for (int a: array) {
            if (!new_array.contains(a)) new_array.add(a);
        }
        int[] result = new int[new_array.size()];
        for (int i = 0; i< new_array.size(); i++) {
            result[i] = new_array.get(i);
        }
        return result;
    }

    public static void RemoveDublicatesTwice(int[] array){
        ArrayList<Integer> new_array = new ArrayList<>();
        for (int a: array) {
            if (!new_array.contains(a)) {
                int count = NumberOfTimesAppears(array, a);
                count = (count>2) ? 2: count;
                for (int i = 0; i<count; i++) new_array.add(a);
            };
        }
        int[] result = new int[new_array.size()];
        for (int i = 0; i< new_array.size(); i++) {
            result[i] = new_array.get(i);
        }
        System.out.print(Arrays.toString(result));
    }

    public static int NumberOfTimesAppears(int[] array, int num){
        int count = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i]==num) count++;
        }
        return count;
    }

    public static void minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        int[][] temp = new int[m][n];
        for (int i = 0; i<m; i++){
            for (int j = 0; j< n; j++){
                if (i == 0 && j == 0){
                    temp[i][j] = grid[i][j];
                    continue;
                }
                int from_up = (i == 0) ? Integer.MAX_VALUE : temp[i-1][j];
                int from_left = (j == 0) ? Integer.MAX_VALUE : temp[i][j-1];
                temp[i][j] = Math.min(from_up, from_left) + grid[i][j];
            }
        }
        System.out.print(temp[m-1][n-1]);
    }

    public static void ClimbToTop(int n){
        if (n <= 1) {
            return;
        }
        int[] s_case = new int[n + 1];
        s_case[0] = 1;
        s_case[1] = 1;
        for (int i = 2; i <= n; i++) {
            s_case[i] = s_case[i - 1] + s_case[i - 2];
            System.out.println(s_case[i]);
        }
        System.out.print(s_case[n]);
    }

    public static void RemoveDuplicatesFromList(){
        LinkedList l_list = new LinkedList();
        // Insert data into LinkedList
        l_list.push(17);
        l_list.push(17);
        l_list.push(16);
        l_list.push(15);
        l_list.push(15);
        l_list.push(14);
        l_list.push(13);
        l_list.push(12);
        l_list.push(12);

        System.out.println("Original List with duplicate elements:");
        l_list.printList(l_list.head);
        l_list.RemoveDuplicate();

        System.out.println("\nAfter removing duplicates from the said list:");
        l_list.printList(l_list.head);
    }

    public static void uniquePaths(int m, int n){
        int count = 0;
        if (m <= 0 || n <= 0) {
            count = 0;
        }
        int[][] grid = new int[m][n];
        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                grid[i][j] = get_Paths(grid, i, j);
            }
        }
        count = grid[0][0];
        for (int i = 0; i<grid.length; i++){
            for (int j = 0; j<grid[i].length; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    private static int get_Paths(int[][] grid, int i, int j) {
        if (i >= grid.length - 1 || j >= grid[0].length - 1) {
            return 1;
        }
        return grid[i][j + 1] + grid[i + 1][j];
    }

    private static void LongestWord(String[] array){
        int max_len = 0;
        for (int i = 0; i<array.length-1; i++){
            max_len = Math.max(array[i].length(), max_len);
        }
        for (String str: array) {
            if (str.length() == max_len) System.out.print(str+" ");
        }
    }

    public static void SubarraySumZero(int[] array){
        int sum_array = 0;
        for (int a : array) {
            sum_array+=a;
        }
        int min_sum = 0, min_start=0, min_end=0;
        int temp_sum = 0;
        for (int i = 0; i < array.length-1; i++){
            for (int j = i+1; j<array.length; j++){
                temp_sum = 0;
                for (int k = i; k<=j; k++){
                    temp_sum+=array[k];
                }
                if (temp_sum == 0) {
                    // if (temp_sum == sum_array) continue;
                    min_start = i;
                    min_end = j;
                }
            }
        }
        System.out.print("Sub array: ");
        for (int i = min_start; i <= min_end; i++){
            System.out.print(array[i]+"  ");
        }
        System.out.printf("\nStart: %d End: %d",min_start, min_end);

    }

    public static void IntervalsMerge(){
        ArrayList<Interval> x = new ArrayList<>();

        x.add(new Interval(1, 3));
        x.add(new Interval(2, 6));
        x.add(new Interval(8, 10));
        x.add(new Interval(15, 18));
        x.add(new Interval(17, 20));

        x = merge(x);
        for ( int i= 0; i<x.size();i++) {
            System.out.printf("(%d , %d)\n", x.get(i).start, x.get(i).end);
        }
    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals){
        if (intervals.size() == 0 || intervals.size() == 1) return intervals;

        Collections.sort(intervals, new IntervalComparator());

        for ( int i= 0; i<intervals.size();i++) {
            System.out.printf("(%d , %d)\n", intervals.get(i).start, intervals.get(i).end);
        }
        System.out.println("\n");
        Interval first = intervals.get(0);
        int start = first.start;
        int end = first.end;

        ArrayList<Interval> result = new ArrayList<>();
        for (int i = 0; i< intervals.size(); i++){
            Interval current = intervals.get(i);
            if (current.start <= end) {
                end = Math.max(current.end, end);
            } else {
                result.add(new Interval(start, end));
                start = current.start;
                end = current.end;
            }
        }
        result.add(new Interval(start, end));
        return result;
    }

    public static void isAnagram(String str1, String str2){
        if (str1.length() != str2.length()) {System.out.println("Not anagram: "+false); return;}
        boolean isAnagram = true;
        int i =0, j = str2.length()-1;
        while (i < str1.length() || j > 0){
            if (str1.charAt(i) != str2.charAt(j)) {isAnagram = false; break;}
            i++;
            j--;
        }
        System.out.println("Is anagram: "+isAnagram);
    }

    public static void MergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> result = new ArrayList<>();
        int i =0; int j = 0;
        int count = 0;
        while (result.size() <= (list1.size()+list2.size())){
            if (list1.get(i) < list2.get(j)){
                result.add(list1.get(i));
                if (i == list1.size()-1) continue;
                i++;
            }
            if (list2.get(j)<=list1.get(i)){
                result.add(list2.get(j));
                if (j == list2.size()-1) continue;
                j++;
            }
        }
        System.out.println(result);
    }

    public static void RemoveNthElement(ArrayList<Integer> list, int index){
        list.remove(list.size()-index);
        System.out.println(list);
    }

    public static void ArrayToBinaryTree(){
        int[] arr = {1, 2, 3, 4, 5, 6};
        TreeNode root = sortedArrayToBST(arr);
        traverseTree(root);
    }

    public static TreeNode sortedArrayToBST(int[] arr) {
        if (arr.length == 0) return null;
        return creation(arr, 0, arr.length - 1);
    }

    private static TreeNode creation(int[] arr, int start, int end) {
        TreeNode node = new TreeNode(0);
        if (start == end - 1) {
            node = new TreeNode(arr[start]);
            node.right = new TreeNode(arr[end]);
        } else if (start == end) {
            return new TreeNode(arr[start]);
        } else {
            int mid = (start + end) / 2;
            node.data = arr[mid];
            node.left = creation(arr, start, mid - 1);
            node.right = creation(arr, mid + 1, end);
        }
        return node;
    }

    private static void traverseTree(TreeNode root) {
        if (root != null) {
            traverseTree(root.left);
            traverseTree(root.right);
            System.out.println(root.data);
        }
    }

    public static void isPermulation(String str1, String str2){
        int contains = 0;
        boolean isPermulation = true;
        if (str1.length() != str2.length()) {System.out.println(false); return;}

        for (int i = 0; i< str1.length(); i++){
            char check = str1.charAt(i);
            if (Main.Contains(str1, check) != Main.Contains(str2, check)){
                isPermulation = false;
                break;
            }
        }
        System.out.println("Permulation: "+isPermulation);
    }

    public static int Contains(String str, char c){
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == c) count++;
        }
        return count;
    }

    public static void BinaryTreeIsSubTree(){
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        t1.left  = t2;
        t1.right = t3;

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left  = n2;
        n1.right = n3;

        System.out.println(is_Subtree(t1, n1));
    }

    public static boolean is_Subtree(TreeNode T1, TreeNode T2) {
        if (T2 == null) return true;
        if (T1 == null) return false;
        if (is_Same(T1, T2)) return true;
        if (is_Subtree(T1.left, T2) || is_Subtree(T1.right, T2)) return true;
        return false;
    }

    public static boolean is_Same(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return t1 == t2;
        } else if (t1.data != t2.data) {
            return false;
        } else {
            return is_Same(t1.left, t2.left) && is_Same(t1.right, t2.right);
        }
    }
}