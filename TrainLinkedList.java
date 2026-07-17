public class TrainLinkedList {
    public static void main(String[] args) {
        // สร้าง Object ของ Class LinkedList
        LinkedList greenline = new LinkedList();

        // 1. เพิ่มสถานีหมอชิต (Mo-chit) ใน Linked List
        greenline.insert("Mo-chit");

        // 2. เพิ่มสถานีอารีย์ (Ari) ใน Linked List
        greenline.insert("Ari");

        // 3. เพิ่มสถานีสนามเป้า (Sanam-Pao) ใน Linked List
        greenline.insert("Sanam-Pao");

        // 4. แสดงรายการสถานีทั้งหมดที่เพิ่มเข้าโปรแกรม (ใช้เมธอด traversal() ที่คุณสร้างไว้)
        System.out.println("All Stations : " + greenline.traversal());

        // 5. แทรกสถานีราชครู (Rachakru) ระหว่างสถานี อารีย์ (index 1) กับ สนามเป้า (index 2)
        // แทรกเข้าที่ตำแหน่ง index 2 เพื่อให้สนามเป้าขยับไปแทน
        greenline.insert(2, "Rachakru");

        // 6. แสดงรายการสถานีทั้งหมด ณ ปัจจุบัน
        System.out.println("All Stations : " + greenline.traversal());

        // 7. แสดงจำนวนสถานีใน Linked List (ใช้เมธอด length())
        System.out.println("Total Station: " + greenline.length());

        // 8. แสดงชื่อสถานีแรกใน Linked List (ดึงตำแหน่ง 0 ด้วยเมธอด get())
        System.out.println("First Station: " + greenline.get(0));

        // 9. สถานี หมอชิต เปลี่ยนชื่อเป็น Mo-Chit (Central Ladprao)
        // ใช้ set() แก้ไขข้อมูลที่ตำแหน่ง index 0
        greenline.set(0, "Mo-Chit (Central Ladprao)");

        // 10. แสดงรายการสถานีทั้งหมด ณ ปัจจุบัน
        System.out.println("All Stations : " + greenline.traversal());

        // 11. ยกเลิกสถานีราชครู
        // เนื่องจากโครงสร้างคลาสรองรับ remove ด้วยเลข index และตอนนี้สถานีราชครูอยู่ที่ index 2 จึงส่งเลข 2 เข้าไป
        greenline.remove(2);

        // 12. แสดงรายการสถานีทั้งหมด ณ ปัจจุบัน
        System.out.println("All Stations : " + greenline.traversal());

        // 13. ยกเลิกสถานีปลายทาง
        greenline.removeLastElement();

        // 14. แสดงรายการสถานีทั้งหมด ณ ปัจจุบัน
        System.out.println("All Stations : " + greenline.traversal());

        // 15. ยกเลิกสถานีรถไฟฟ้าสายสีเขียวทั้งหมด
        greenline.clear();

        // 16. แสดงจำนวนสถานีทั้งหมด หลังจากยกเลิกรถไฟฟ้าสายสีเขียว
        System.out.println("Total Station: " + greenline.length());

        // 17. แสดงรายการสถานีทั้งหมด ณ ปัจจุบัน
        System.out.println("All Stations : " + greenline.traversal());
    }
}
