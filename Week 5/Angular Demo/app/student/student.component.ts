import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit
{
imgsrc ="../../assets/merc.jpg";

  sid:number = 0;
  sname:string='';
  dob:Date = new Date();
  
  ngOnInit(): void 
  {
    this.sid = 66;
    this.sname = "Devanshu";
    
  }
  

}
