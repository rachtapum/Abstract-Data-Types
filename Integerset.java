import java.util.ArrayList;

/**ADT ที่เก็บ Number  แบบไม่ซ้ำกันและเรียงลำดับจากน้อยไปมาก
 */
public class Integerset {
    ArrayList<Integer> Number;

    public Integerset(){
        Number = new ArrayList<>();
        CheckRep();
    }
    /**
     * ตรวจสอบว่า Number เป็น  Null หรือไม่
     * ตรวจสอบว่า Set ใน Number เรียงจากมากไปน้อยหรือไม่
     */

    private void CheckRep(){
         if (Number == null) {
           throw new RuntimeException("Fail");
    }
        if (Number.size() > 1) {
            for (int i = 0; i < Number.size() - 1; i++) {
                if (Number.get(i).equals(Number.get(i+1))) {
                    throw new RuntimeException("sum sum");
                }else if (Number.get(i) > Number.get(i+1)) {
                    throw new RuntimeException("naber is big");
                }
       }
    }
}
    public void add(Integer x ){
        Number.add(x);
        CheckRep();
    }
    /**
     * ลบตัวเลขออกจากเซต
     * @param x ตัวอักษรที่ต้องการลบ
     */
    public void remove(Integer x ){  
        for (int i = 0; i < Number.size(); i++) {    
            if (x == Number.get(i)) {
                  Number.remove(x);
            }
        }
         CheckRep();
    }
     /**
     * ตรวจสอบว่ามีตัวอักษรนี้อยู่ในเซตหรือไม่
     * @param x ตัวอักษรที่ต้องการตรวจสอบ
     * @return ถ้าไม่มีตัวอักษร x แสดงว่า Fail ให้ทำการเติมเพื่อวนลูป ผลที่ได้จะเป็น Pass
     */
    public boolean contains(Integer x) {
       for (int i = 0; i < Number.size(); i++) {
        if (x == Number.get(i)) {
            return true;
        }
       }
       return false;
    }
}