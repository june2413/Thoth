package thoth.spring.project.service;

import org.springframework.web.multipart.MultipartFile;
import thoth.spring.project.vo.BookImage;
import thoth.spring.project.vo.Product;

import java.util.List;

public interface ProductService {

    /* 개발 가이드
        1. 상품 조회 - 개발우선순서
        2. 상품 상세조회 - 개발우선순서 2
        3. 상품 등록 - 개발우선순서 3
        4. 상품 삭제 - 개발우선순서 4
        5. 상품 수정 - 시간이 남을 경우 구현할 것
     */
     
    
    // 상품 조회
    List<Product> readProduct(String cp); // cp: 페이지 번호(페이징에 사용)
    // 게시글 수
    int countProduct();
    // 상품 검색(내부)
    List<Product> readProduct(String cp, String ftype, String fkey);
    // 검색된 상품 수
    int countProduct(String ftype, String fkey);
    
    // 상품 상세조회
    Product readOneProduct(String tnum);

    // 상품 등록
    boolean newProduct(Product p, BookImage b, MultipartFile[] img);

    // 상품 삭제
    Product removeProduct(String tnum);

    // 상품 상세조회 - 이미지
    BookImage readOneImage(String tnum);

    // 상품 삭제 - 이미지
    BookImage removeImage(String tnum);

    // 상품 수정
    void modifyProduct(Product p);

    // 상품 수정 - 이미지
    void modifyImage(BookImage b, MultipartFile[] img);

    // 상품 조회2
    List<Product> readProduct2(String cp); // cp: 페이지 번호(페이징에 사용)

    // 게시글 수2
    int countProduct2();

    /* child */
    List<Product> read2Product(String cp);
    int count2Product();

    List<Product> read2Product(String cp, String findtype, String findkey);
    int count2Product(String findtype, String findkey);

    Product readOne2Product(String tnum);
    BookImage readOne2Image(String tnum);

    boolean newProduct2(Product p, BookImage b, MultipartFile[] img);

    Product removeProduct2(String tnum);
    BookImage removeImage2(String tnum);

    void modify2Product(Product p);
    void modify2Image(BookImage b, MultipartFile[] img);

}
