import { Component, ViewChild } from '@angular/core';
import { FilhoComponent } from '../filho/filho.component';

@Component({
  selector: 'app-pai',
  templateUrl: './pai.component.html',
  styleUrls: ['./pai.component.css']
})
export class PaiComponent {
  start = 0;
  end = 3;
  selecionado: number | null = null ;

  incrementarStart(){
    this.start++;
  }

  diminuirStart(){
    this.start--;
  }

  incrementarEnd(){
    this.end++;
  }

  diminuirEnd(){
    this.end--;
  }

  @ViewChild("filhote")
  filhote!: FilhoComponent;

  resetar(){
    this.filhote.reset();
  }
}