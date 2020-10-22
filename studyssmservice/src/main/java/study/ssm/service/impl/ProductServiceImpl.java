package study.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.ssm.dao.IProductDao;
import study.ssm.domain.Product;
import study.ssm.service.IProductService;

import java.util.List;

//实现IProductService
//重写findAll方法
//通过IProductDao完成
//通过productDao的findAll完成操作

@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }


}
