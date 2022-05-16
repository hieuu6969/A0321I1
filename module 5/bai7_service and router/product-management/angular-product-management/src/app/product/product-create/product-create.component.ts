import { Component, OnInit } from '@angular/core';
import {ProductService} from "../../service/product.service";
import {FormBuilder, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  productForm: FormGroup;
  constructor(private productService: ProductService, private fb: FormBuilder) { }

  ngOnInit(): void {
     this.productForm = this.fb.group({
       id: [''],
       name: [''],
       price: [''],
       description:['']
    })
  }
  submit() {
    const product = this.productForm.value;
    this.productService.saveProduct(product).subscribe(() => {
      this.productForm.reset();
      alert('Tao thanh cong');
    });
  }
}
