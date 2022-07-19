import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<News> newsArrayList = new ArrayList<News>();
        boolean b = true;

        while (b) {
            System.out.printf("Nhập số tương ứng: \n 1. Thêm mới một news \n " +
                    "2. Xem danh sách news \n 3. Tính đánh giá trung bình \n 4. Thoát \n");
            int a = Integer.parseInt(scanner.nextLine());
            if(a == 1 || a == 2 || a == 3 || a == 4){
                switch (a) {
                    case 1:
                        News news = new News();

                        System.out.println("Nhập title: ");
                        news.setTitle(scanner.nextLine());

                        System.out.println("Nhập publish date: ");
                        news.setPublishDate(scanner.nextLine());

                        System.out.println("Nhập author: ");
                        news.setAuthor(scanner.nextLine());

                        System.out.println("Nhập content: ");
                        news.setContent(scanner.nextLine());

                        System.out.println("Nhập rate list là 3 số nguyên: ");
                        try {
                            news.getRateList()[0] = Integer.parseInt(scanner.nextLine());
                            news.getRateList()[1] = Integer.parseInt(scanner.nextLine());
                            news.getRateList()[2] = Integer.parseInt(scanner.nextLine());
                        } catch (Exception e){
                            System.out.println("Nhập vào phải là 3 chữ số kiểu nguyên: ");
                            System.out.println("Hãy nhập lại news mới");
                            break;
                        }
                        newsArrayList.add(news);
                        break;
                    case 2:
                        Iterator<News> iterator = newsArrayList.iterator();
                        while (iterator.hasNext()) {
                            iterator.next().display();
                        }
                        break;
                    case 3:
                        for (int i = 0; i<newsArrayList.size(); i++){
                            newsArrayList.get(i).calculate();
                            newsArrayList.get(i).display();
                        }
                        break;
                    case 4:
                        b = false;
                        System.out.println("\nKết thúc chương trình");
                        break;
                    default:
                        break;
                }

            } else {
                System.out.println("Menu không hợp lệ .Kết thúc chương trình");
                break;
            }
        }
    }
}
