package by.epamproject.controller;

import by.epamproject.dto.object.ProductDto;
import by.epamproject.service.HelperSoapService;
import by.epamproject.service.ProductService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private HelperSoapService helpersoapService;

    @ResponseBody
    @RequestMapping(value = "/products", method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<String> getAllProduts(HttpServletResponse response) {

        List<ProductDto> productDtoList = productService.getAllProduct();
        Gson gson = new Gson();
        String jsonProductList = gson.toJson(productDtoList);

        response.addHeader("Access-Control-Allow-Origin", "*");
        return new ResponseEntity<>(jsonProductList, HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity getProductById(@PathVariable int id, HttpServletResponse response) throws Exception {
        ProductDto productDto = productService.getProductById(id);
        productDto.setPrice(helpersoapService.getCostByIdSoap(id));

        Gson gson = new Gson();
        String jsonProductDto = gson.toJson(productDto);
        response.addHeader("Access-Control-Allow-Origin", "*");
        return new ResponseEntity<>(jsonProductDto, HttpStatus.OK);
    }

//        Type type = new TypeToken<List<ProductDto>>(){}.getType();
//        List<ProductDto> productList = gson.fromJson(jsonProductList, type);
//        System.out.println("productList: " + productList);

}