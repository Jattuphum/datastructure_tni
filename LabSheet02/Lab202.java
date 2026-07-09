import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // นำข้อมูลจาก array ใส่เข้า ArrayList
        for (int num : initial_numbers) {
            numbers.add(num);
        }

        // แสดงข้อมูลเริ่มต้น
        System.out.println(numbers);

        // 1. รับค่าเพื่อเพิ่มต่อท้าย
        System.out.print("\nEnter element to append: ");
        int numTail = scan.nextInt();
        numbers.add(numTail);
        System.out.println(numbers);

        // รหัส:2513310033
        // 2. รับค่าเพื่อแทรกตามตำแหน่งเลขสุดท้ายของรหัส (index 3)
        int lastDigit = 3;
        System.out.print("\nEnter element to insert at index " + lastDigit + ": ");
        int numInsert = scan.nextInt();
        numbers.add(lastDigit, numInsert);
        System.out.println(numbers);

        // 3. ลบข้อมูลตำแหน่งเลขรองสุดท้ายของรหัส (index 3)
        int secondLastDigit = 3;
        System.out.println("\nRemove element at index: " + secondLastDigit);
        numbers.remove(secondLastDigit);
        System.out.println(numbers);

        // คลาสวันที่อาจาร์ยสอนคือ วันที่ 7
        // 4. อัปเดตข้อมูลตำแหน่งเลขก่อนรองสุดท้าย (index 0) เป็นวันที่เรียน (7)
        int thirdLastDigit = 0;
        int studyDate = 7;
        System.out.println("\nUpdate element at index " + thirdLastDigit + " to " + studyDate);
        numbers.set(thirdLastDigit, studyDate);

        // แสดงผลลัพธ์สุดท้าย
        System.out.println(numbers);

        scan.close();
    }
}