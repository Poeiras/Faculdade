import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ListaService {
  private itemList: string[] = [];

  addItem(item: string) {
    this.itemList.push(item);
  }
  getItemList(): string[] {
    return this.itemList;
  }

  /*private itemListaObservableSubject: BehaviorSubject<string[]> = new BehaviorSubject<string[]>([])

  getItemsObservable(): Observable<string[]>[
    return this.itemListaObservableSubject.asObservable();
  ]

  addItemObservable(item: string){
    let current = this.itemListaObservableSubject.getValue();
    const newItems = [...current, item];
    this.itemListaObservableSubject.next(newItems);
  }*/


}
