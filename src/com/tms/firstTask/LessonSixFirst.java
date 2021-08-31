package com.tms.firstTask;

/**
 * - Проверить содержит ли номер документа последовательность abc.
 * - Проверить начинается ли номер документа с последовательности 555.
 * - Проверить заканчивается ли номер документа на последовательность 1a2b.
 */
public class LessonSixFirst {
    public static void main(String[] args) {
        try {
            String str = new String("5554-PbC-7462-PkP-4X2X");
            System.out.println(str.substring(0, 4) + str.substring(9, 13));
            System.out.println(str.substring(0, 5) + "***" + str.substring(8, 14) + "***" + str.substring(17));
            System.out.println(str.toLowerCase().substring(5, 8) + "/" + str.toLowerCase().substring(14, 17) + "/" + str.toLowerCase().substring(19, 20) + "/" + str.toLowerCase().substring(21, 22));

            StringBuilder sb = new StringBuilder();
            sb.append("\"Letters:");
            sb.append(str.toUpperCase().substring(5, 8) + "/");
            sb.append(str.toUpperCase().substring(14, 17) + "/");
            sb.append(str.toUpperCase().substring(19, 20) + "/");
            sb.append(str.toUpperCase().substring(21, 22) + "/");
            System.out.println(sb);
            try {
                String[] array = str.split("-");
                if (array[1].toLowerCase().equals("abc")) {
                    throw new MyCustomException("abc - есть");
                } else if (array[3].toLowerCase().equals("abс")) {
                    throw new MyCustomException("abc - есть");
                } else {
                    throw new MyCustomException("abc - нет");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {


                if (str.startsWith("555")) {
                    throw new MyCustomException("Начинается с 555");
                } else {
                    throw new MyCustomException("Не начинается с 555");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {

                if (str.toLowerCase().endsWith("1a2b")) {
                    throw new MyCustomException("Заканчивается на 1a2b");
                } else {
                    throw new MyCustomException("Не заканчивается на 1a2b");
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
