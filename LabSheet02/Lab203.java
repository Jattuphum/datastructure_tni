public class Lab203 {

    public static void main(String[] args) {
        String[] subjects = {"ITE-201", "BIS-112", "DAT-201", "JPN-201", "ENL-211"};
        displayArray("Original", subjects);

        System.out.println();
        String new_subject = "SOC-111";
        subjects = addArraySize(subjects);
        subjects[subjects.length - 1] = new_subject;
        displayArray("Already apended element", subjects);

        System.out.println();
        int delete_index1 = 3;
        subjects = deleteElement(delete_index1, subjects);
        displayArray("Already deleted index " + delete_index1, subjects);

        System.out.println();
        int delete_index2 = 0;
        subjects = deleteElement(delete_index2, subjects);
        displayArray("Already deleted index " + delete_index2, subjects);

        System.out.println();
        int delete_index3 = subjects.length - 1;
        subjects = deleteElement(delete_index3, subjects);
        displayArray("Already deleted last index", subjects);

        System.out.println();
        int index_update = 1;
        String element_update = "MTE-201";
        subjects = updateElement(index_update, element_update, subjects);
        displayArray("Already updated element", subjects);
    }

    public static void displayArray(String message, String[] subjects) {
        System.out.print(message + ": ");
        boolean first = true;
        for (String subject : subjects) {
            System.out.print((!first ? ", " : "") + subject);
            first = false;
        }
        System.out.println();
    }

    public static String[] addArraySize(String[] subjects) {
        // 1. สร้างอาร์เรย์ใหม่ที่มีขนาดใหญ่กว่าเดิม +1
        String[] newArray = new String[subjects.length + 1];

        // 2. คัดลอกข้อมูลจากอาร์เรย์เดิมมาใส่อาร์เรย์ใหม่
        for (int i = 0; i < subjects.length; i++) {
            newArray[i] = subjects[i];
        }

        // 3. คืนค่าอาร์เรย์ใหม่ที่ขยายขนาดแล้ว
        return newArray;
    }

    public static String[] deleteElement(int index, String[] subjects) {
        // 1. สร้างอาร์เรย์ใหม่ที่มีขนาดลดลง -1
        String[] newArray = new String[subjects.length - 1];

        // 2. คัดลอกข้อมูลโดยข้ามตำแหน่ง index ที่ต้องการลบไป
        int newIdx = 0;
        for (int i = 0; i < subjects.length; i++) {
            if (i == index) {
                continue; // ถ้าเจอตำแหน่งที่ต้องการลบ ให้ข้ามไป (ไม่ก็อปปี้)
            }
            newArray[newIdx] = subjects[i];
            newIdx++;
        }

        return newArray;
    }

    public static String[] updateElement(int index, String value, String[] subjects) {
        // 1. เปลี่ยนแปลงข้อมูลในตำแหน่งที่ระบุได้ทันที (เพราะขนาดอาร์เรย์เท่าเดิม)
        subjects[index] = value;

        // 2. คืนค่าอาร์เรย์เดิมที่อัปเดตค่าเรียบร้อยแล้ว
        return subjects;
    }
}