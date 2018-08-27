package com.aranyacreations.ecom;

import com.aranyacreations.ecom.controller.ProductController;
import com.aranyacreations.ecom.model.Product;
import com.aranyacreations.ecom.service.impl.ProductServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EcomApplicationTests {


	@Autowired
	ProductServiceImpl productService;

	@Test
	public void contextLoads() {
	}


	@Test
	public void testProductService() {

		Product p1 = new Product();
		p1.setName("prod1"); p1.setPrice(56.78); p1.setPriceUrl("/api/product/p2/price");

		Product p2 = new Product();
		p2.setName("prod2"); p2.setPrice(101.89); p2.setPriceUrl("/api/product/p2/price");

		productService.save(p1);
		productService.save(p2);

		Product[] pList = new Product[2];
		pList[0] = p1; pList[1] = p2;

		Iterable<Product> products =  productService.getAllProducts();

		products.forEach( p -> {
			System.out.println(p.toString());

		});

		int i = 0;
		Iterator<Product> iter = products.iterator();
		while (iter.hasNext()) {
			pList[i] = iter.next();
			i++;
		}
		validateProducts(p2, pList[1]);
		validateProducts(p1, pList[0]);

	}

	private void validateProducts (Product src, Product target) {
		Assert.assertEquals(src.getName(), target.getName());
		Assert.assertEquals(src.getPriceUrl(), target.getPriceUrl());
		Assert.assertEquals(src.getPrice(), target.getPrice());
		Assert.assertEquals(src.getId(), target.getId());

	}

}
