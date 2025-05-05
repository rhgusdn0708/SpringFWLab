package mylab.customer.dao;

import java.util.List;
import mylab.customer.vo.CustomerVO;

public interface CustomerDAO {
    // 고객 단건 조회
    CustomerVO selectCustomer(int id);
    
    // 고객 목록 조회
    List<CustomerVO> selectAllCustomer();
    
    // 고객 등록
    void insertCustomer(CustomerVO customer);
}
