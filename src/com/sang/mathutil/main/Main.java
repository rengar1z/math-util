/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang.mathutil.main;

import com.sang.mathutil.MathUtility;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long expected = 120; //tui hi vọng 120 là giá trị trả về
        int n = 5; //nếu tui tính 5!
        long actual = MathUtility.getFactorial(n);
        //actual la cai value hàm thực sự trả về
        //ta đi so sánh = mắt để luận xem hàm ta viết chạy đúng hay không
        System.out.println("5!: expected: " + expected + "; Actual: " + actual);
        //tính huống test số 2, 0! giai thừa xem sao?
        //Tình huống test, tình huống xài, gọi là test CASE
        n=0; //tui muốn tính 0!
        expected = 1; //hi vọng nhận 1
        actual = MathUtility.getFactorial(n);
        System.out.println("5!: expected: " + expected + "; Actual: " + actual);
        //nếu nhiều test case cần phải test, ta sẽ rất dễ bỏ sót, nhìn là sai kết quả
        //kĩ thuật test như ở trên gọi là manual test
        //test khi code vừa mới xong từng hàm gọi là unit test
        
       
        //System.out.println("Hello GitHub");
        //System.out.println("This is 1st upload connects to remote GitHub sever ");
        // TODO code application logic here
    }
    
}

//Trong quy trình lập trình chuyên nghiệp ở các công ty đặc biệt làm cho JP
//Mọi hàm và class bạn viết ra đều phải được test kĩ càng trước khi ghép
//Nó vào trong các cụm tính năng, và ghép với UI, Back-end
//Làm sao để test các hàm, các class
//Dân dev có nhiều cách
//1. Cách 1:sout (kết quả xử lý hàm)
//2. Cách 2:JOptionPane(pop up lên kết quả xử lý hàm) bên trong java Desktop
//3. Cách 3:Ghi vào LOG file trong môn java web, hay in ra kết quả xử lý ra 1 trang web tạm nào đó
//với 3 cách này, ta gọi hàm, nhìn kết quả mà ta tự tính trước đó
//khi chưa gọi hàm - ta gọi giá trị kì vọng - expected value
//nếu expected value == actual value(thực tế và kì vọng khớp với nhau)
//Á ĐÙ , hàm chạy  đúng
//nếu không bằng, Đù, hàm xử lý sai
//nếu không bằng, đù , hàm xử lý sai
//3 cách trên đòi hỏi dev phải dùng mắt để luận kết quả đúng sai
// còn cách xử lý thứ 4 
//ta không cần nhìn = mắt từng trường hơp sử dụng hàm
//ta nhờ máy so sánh dùm actual với expected luôn
//và nếu hầu hết đều khớp , chỉ có ít nhất 1 cái không khớp, hàm không ổn định
//ném ra màu đỏ -> cảnh báo dân dev code có trục trặc
//vậy lúc này  ta chỉ cần nhìn màu là đủ, không cần luận từng kết quả
//kĩ thuật này gọi là test driven development + test automation
//vừa viết code vừa test

//mún làm được điều này, ta cần thêm thư viện phụ trợ để tung ra màu
// thư viện này đều có tương ứng ở các ngôn ngữ lập trình

//JAVA: JUnit, TestNG...
//C# : PHPUnit
//...
