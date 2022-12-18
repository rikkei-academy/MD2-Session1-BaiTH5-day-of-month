package ra.academy;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in); //Khởi tạo đối tượng sc để nhập dữ liệu .
        System.out.println("Which month that you want to count days");
        int month = sc.nextInt(); // nhập vào tháng cần đếm số ngày và gán vào biến m .
        switch (month) {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("The month "+month+" has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month "+month+" has 30 days");
                break;
            case 2:
                System.out.println("The month 2 has 28 or 29 days");
                break;
            default:
                System.out.println("This month doesn't exist!");
                break;
        }
    }
}
