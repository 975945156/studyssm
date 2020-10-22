package study.ssm.dao;

import org.apache.ibatis.annotations.Select;
import study.ssm.domain.Product;

import java.util.List;

/*
* 编写持久层接口
* 查询所有的产品信息
* */
public interface IProductDao {

    @Select("select * from product")
    public List<Product> findAll() throws Exception;

}
