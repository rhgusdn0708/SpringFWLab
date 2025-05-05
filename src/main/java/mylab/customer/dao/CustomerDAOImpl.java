package mylab.customer.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import mylab.customer.vo.CustomerVO;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
    
    @Autowired
    private SqlSession sqlSession;
    
    @Override
    public CustomerVO selectCustomer(int id) {
        return sqlSession.selectOne("mylab.customer.mapper.CustomerMapper.selectCustomer", id);
    }
    
    @Override
    public List<CustomerVO> selectAllCustomer() {
        return sqlSession.selectList("mylab.customer.mapper.CustomerMapper.selectAllCustomer");
    }
    
    @Override
    public void insertCustomer(CustomerVO customer) {
        sqlSession.insert("mylab.customer.mapper.CustomerMapper.insertCustomer", customer);
    }
}