import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angulartemplate';

  email:string='';
  password:string='';

  readFormDate(data:any)
  {
    console.log(data.form.value);

  }


}
