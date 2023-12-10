import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import { decrement, increment, reset } from '../actions/counter.actions';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-my-counter',
  templateUrl: './my-counter.component.html',
  styleUrls: ['./my-counter.component.css']
})
export class MyCounterComponent {

  count$: Observable<number> = new Observable();
 
  constructor(private store: Store<{ count: number }>) {
    this.count$ = store.select('count');
  }
 
  increment() {
    this.store.dispatch(increment());
    console.log("Inc Called");
  }
 
  decrement() {
    this.store.dispatch(decrement());
    console.log("Dec Called");
  }
 
  reset() {
    this.store.dispatch(reset());
    console.log("Reset Called");
  }
}
