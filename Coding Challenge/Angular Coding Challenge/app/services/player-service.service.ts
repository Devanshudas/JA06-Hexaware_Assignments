import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PlayerServiceService {

  url:string="http://localhost:8082/api/v1/player";

  constructor(private http:HttpClient) { }

  getPlayerWithMaxMatches()
  {
    return this.http.get(this.url+"/getmax",{responseType:'json'});
  }

  getAllPlayers()
  {
    return this.http.get(this.url+"/getall",{responseType:'json'});

  }
}
