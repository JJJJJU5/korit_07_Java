package ch09_classes.products;

public class ProductMain {
    public static void main(String[] args) {
        //기본 생성자를 통한 생성
        Product product1 = new Product();
        // 매개변수 생성자를 통한 생성               2번

        Product product2 = new Product(9876564);
        Product product3 = new Product("USB - C 케이블 ");
        Product product4 = new Product(951753,"GFlip6");

        // 속성 값 대입
        product1.productNum = 123465;
                product1.productName = "LG엘패드";
        product2.productName = "다이소충전기";
        product3.productNum = 159357;


        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();








    }
}
