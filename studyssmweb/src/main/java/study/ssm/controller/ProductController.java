package study.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import study.ssm.domain.Product;
import study.ssm.service.IProductService;

import java.util.List;
/*
* Controller调用service
* service调用dao
*
* */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;


//调用service完成操作

    //查询全部产品
@RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> ps = productService.findAll();
        mv.addObject("productList",ps);
        mv.setViewName("product-list");
        return mv;
    }
}
