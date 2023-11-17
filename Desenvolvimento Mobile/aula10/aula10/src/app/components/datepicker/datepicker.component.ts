import { Component } from '@angular/core';
import { MatDatepickerModule } from '@angular/material/datepicker'
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatNativeDateModule } from '@angular/material/core';
import { MatIconModule } from '@angular/material/icon';

@Component({
  selector: 'app-datepicker',
  templateUrl: './datepicker.component.html',
  styleUrls: ['./datepicker.component.css'],
  standalone: true,
  imports:[
   MatDatepickerModule,
   MatInputModule,
   MatFormFieldModule,
   MatNativeDateModule,
   MatIconModule,   
  ]
})
export class DatepickerComponent {

}
