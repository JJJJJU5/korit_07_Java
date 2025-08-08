package ch13_inheritance.products;

public class ProductMain {
    public static void main(String[] args) {
        Item item1 = new Item("일반 상품", "일반 카테고리");
        System.out.println(item1.getName());
        System.out.println(item1.getCategory());



        Product product1 = new Product("전자제품", "가전 제품", 10000,10);

        product1.setCategory("백색 가전제품");

        System.out.println("해당 제품은" + product1.getCategory() + " 입니다.");




        //Item 클래스를 건드리지말고 Getter 이용해서 다음과 같은 출력문이 나오게 작성하시오
        // 이 상품은 일반 상품입니다.
        // 이 상품은 일반 카테고리입니다.
        // so ("이 상품은 일반 상품입니다.); < 이건 오답

        // 다 끝났으면
        /*
        Product 클래스의 인스턴스인 product1을 생성
        이름 -> 전자제품
        카테고리 -> 가전제품
        가격 -> 100000
        재고 -> 10으로 설정.
        setter 이용해서 가전 제품을 백색 가전제품으로 바꾸고
        getter를 활용하여 해당 제품은 백색 가전 제품입니다. 를 콘솔에 출력

         */
    }
}
