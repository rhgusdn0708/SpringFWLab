package mylab.CustomerSpringTest;

import java.util.List;
import org.springframework.context.support.GenericXmlApplicationContext;
import mylab.customer.service.CustomerService;
import mylab.customer.vo.CustomerVO;

public class CustomerSpringTest {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = 
            new GenericXmlApplicationContext("classpath:spring-beans.xml");
        
        CustomerService customerService = 
            context.getBean("customerServiceImpl", CustomerService.class);
        
        // 고객 등록 테스트
        CustomerVO newCustomer = new CustomerVO();
        newCustomer.setEmail("test@example.com");
        newCustomer.setName("홍길동");
        newCustomer.setAge(30);
        customerService.insertCustomer(newCustomer);
        
        // 고객 조회 테스트
        CustomerVO customer = customerService.getCustomerInfo(1);
        System.out.println("조회된 고객 정보: " + customer);
        
        // 전체 고객 목록 조회 테스트
        List<CustomerVO> customerList = customerService.getAllCustomerList();
        System.out.println("전체 고객 목록:");
        for (CustomerVO vo : customerList) {
            System.out.println(vo);
        }
        
        context.close();
    }
}