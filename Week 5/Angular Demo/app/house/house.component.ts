import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-house',
  templateUrl: './house.component.html',
  styleUrls: ['./house.component.css']
})
export class HouseComponent implements OnInit
{
  

  ngOnInit(): void 
  {
    console.log('ngOninit invoked')
  }

}
