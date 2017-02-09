package by.epamproject.controller;

import by.epamproject.dto.object.ProductDto;
import by.epamproject.service.HelperSoapService;
import by.epamproject.service.ProductService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private HelperSoapService helperSoapService;

    @CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
    @ResponseBody
    @RequestMapping(value = "/products", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public ResponseEntity<String> getAllProduts() {

        List<ProductDto> productDtoList = productService.getAllProduct();
        for (ProductDto product : productDtoList) {
            try {
                product.setPrice(helperSoapService.getCostByIdSoap(product.getId()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Gson gson = new Gson();
        String jsonProductList = gson.toJson(productDtoList);

        return new ResponseEntity<>(jsonProductList, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public ResponseEntity getProductById(@PathVariable int id) throws Exception {

        ProductDto productDto = productService.getProductById(id);
        productDto.setPrice(helperSoapService.getCostByIdSoap(id));

        Gson gson = new Gson();
        String jsonProductDto = gson.toJson(productDto);
        return new ResponseEntity<>(jsonProductDto, HttpStatus.OK);
    }

}