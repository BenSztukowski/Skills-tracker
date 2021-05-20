import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  name:string = "Ben Sztukowski";
  itemList: string[] = ["Chicken", "bacon", "ranch", "avocado"];
  title = 'This is my first Angular page';
  rectangle = {
    length: 5,
    width: 6,
    area: function() {
       return this.length * this.width;
    }
  }
}
