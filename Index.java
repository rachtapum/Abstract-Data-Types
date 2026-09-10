public class IntegerSetTest {
    public static void main(String[] args) {
        // Test 1: การสร้าง, เพิ่มข้อมูล, และการเรียงลำดับ
        Integerset a = new Integerset();
        a.add(10);
        a.add(20);
        a.add(40);
        String Test1 = "[10, 20, 40]";
        if (a.toString().equals(Test1)) {
            System.out.println("Pass");
        }else{
        
            System.out.println("Fail");
        }
        // Test 2:  ลบข้อมูล
        a.remove(20);
          String Test2 = "[10, 40]";
        if (a.toString().equals(Test2)) {
             System.out.println("Pass");
        }else{
        
            System.out.println("Fail");
        }
        // Test 3: การตรวจสอบข้อมูล 
        if (a.contains(10) ) {
             System.out.println("Pass");
        } else {
          System.out.println("Fail");  
        }
         // Test 4: เพิ่มข้อมูลที่ซ้ำซ้อน
        a.add(50);
        String Test4 = "[10, 40, 50]";
        if (a.toString().equals(Test4)) {
            System.out.println("Pass");
        }else{
        
            System.out.println("Fail");
        } 
    }
}
