import { Component } from '@angular/core';
import { ListaService } from 'src/app/services/lista.service';

@Component({
  selector: 'app-itemlista',
  template:`
  <ul>
    <li *ngFor="let item of itemList">
    {{item}} - <button (click)="remove(item)")>Remover</button>

  </li>
  </ul>
  `,
  styleUrls: ['./item-lista.component.css']
})
export class ItemListaComponent {
  itemList: string[];

  constructor(private listaservice: ListaService){
    this.itemList = this.listaservice.getItemList();
  }

  remove(item: string){
    const index = this.itemList.indexOf(item);
    this.itemList.splice(index, 1);
  }
}
