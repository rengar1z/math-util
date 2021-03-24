/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang.mathutil.test;

import com.sang.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {
    //ta sẽ viết những đoạn code ở đây để test các hàm chỉnh getFactorial() xem có đúng không
    //bên MathUtility coi mày chạy có đúng hong
    //viết code để test code chính
    //đúng sai ở đây chúng tôi dùng màu sắc XANH ĐỎ
    @Test
    public void TestFactorialGivenRightArgumentReturnsGoodResult(){
  
        int n = 5; //tui muốn tính 5!
        long expected  = 120; //tui hi vọng trả về 120
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);
        //khớp máu xanh, sai lệch là màu đỏ
        //màu xanh xuất hiện khi tất cả các tình huống xài hàm đều xanh
        //màu đỏ xuất hiện ngay khi có ít nhất 1 thằng đỏ
        // một test case sai,tất cả bỏ
        //ẩn ý : hàm đã đúng thì phải đúng cho tất cả các case
        //mình test
        
        assertEquals(720, MathUtility.getFactorial(6)); //6 giai thua co dung la 720 ?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        //khi màu đỏ thì có 2 tình huống : hàm bạn tính sai, không như kì vọng
        // hàm tính đúng, bạn kì vọng
        
    }
    // ta sẽ đi test hàm có ném ra ngoại lệ như thiết kế hay không
    //hàm được thiết kế rằng : đưa tham số n ... 20 -> tính đúng n!
    //hàm được thiết kế rằng : đưa tham số cà chớn, < 0 > 20
    //ném ra ngoài ngoại lệ cảnh báo sai tham số
    //ngoài miền giá trị tính !
    //chốt : đưa tham số cà chớn phải ném về ngoại lệ
    //nếu thấy đúng là ném về ngoài lệ khi đưa tham số cà chion71
    //thì kết luận hàm đúng, xanh
    //thấy ngoại lệ khi đưa n cà chớn,  mừng rơi nước mắt vì hàm chạy đúng như thiết kế
    //ngoại lệ khi xuất hiện 5!  thì là hàm đúng mà
    //ngoại lệ thì không phải giá trị để so sánh kiểu assertEquals()
    //@Test(expected = Exception.class) // nên bắt chính xác ngoại lệ chứ không bắt cha
    //@Test(expected = IllegalArgumentException.class)
     public void getFactorialGivenWrongArgumentThrowsException(){
         MathUtility.getFactorial(40);
         MathUtility.getFactorial(-40);
         
         
     }//cá luôn 2 thằng này ném về ngoại lệ illegalArgumentException
    
    public MathUtilityTest() {
        
    }
    
}
