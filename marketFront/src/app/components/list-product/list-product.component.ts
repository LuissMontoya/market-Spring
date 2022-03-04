import { ProductsService } from './../../services/products.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-product',
  templateUrl: './list-product.component.html',
  styleUrls: ['./list-product.component.css']
})
export class ListProductComponent implements OnInit {

  productos :any[]= [];

  constructor(private productoService: ProductsService) { }

  ngOnInit(): void {
    this.getAll();
  }

  getAll(){
    this.productoService.getAll().subscribe((producto: any)=>{
      console.log(producto);
      //this.productos = producto._embedded.producto;
    });
  }

}
