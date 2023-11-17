import { Component } from '@angular/core';
import { ListaService } from 'src/app/services/lista.service';

@Component({
  selector: 'app-itemadd',
  templateUrl: './itemadd.component.html',
  styleUrls: ['./itemadd.component.css']
})
export class ItemaddComponent {
  newItem: string = '';

  constructor(private listaService: ListaService) { }

  addItem(){
    this.listaService.addItem(this.newItem);
    this.newItem = '';
  }
}
