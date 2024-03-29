import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-filho',
  templateUrl: './filho.component.html',
  styleUrls: ['./filho.component.css']
})
export class FilhoComponent implements OnInit, OnChanges{
  integers: number[] = []

  @Input()
  start = 0;

  @Input()
  end = 10;

  @Output()
  onSelected = new EventEmitter<number>()

  selectedNumber(n: number){
    this.onSelected.next(n)
  }

  makeIntegers(){
    this.integers = [];
    for (let i = this.start; i <= this.end; i++) {
      this.integers.push(i);
    }
  }

  reset(){
    this.start = 0;
    this.end = 10
    this.makeIntegers();
  }

  ngOnInit(): void {
    this.makeIntegers();
  }

  ngOnChanges(changes: SimpleChanges) {
      const start = changes['start']?.currentValue
      const end = changes['end']?.currentValue
      if(start){
        this.start = start;
      }
      if(end){
        this.end = end;
      }
      this.makeIntegers();
  }
}