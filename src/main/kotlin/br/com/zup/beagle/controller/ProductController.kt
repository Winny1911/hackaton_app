package br.com.zup.beagle.controller

import br.com.zup.beagle.constant.ID
import br.com.zup.beagle.constant.PRODUCT_ENDPOINT
import br.com.zup.beagle.service.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(PRODUCT_ENDPOINT)
class ProductController(private val productService: ProductService) {
	@GetMapping
	fun getProductById(@PathVariable(ID) id: String) = productService.createProduct(id)
}