import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { PlayerServiceService } from 'src/app/services/player-service.service';

@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.css']
})
export class PlayerComponent 
{
  constructor( private router:Router,private playerService: PlayerServiceService){}
  playerDetails:any;

  getPlayerWithMaxMatches()
  {
    this.playerService.getPlayerWithMaxMatches().subscribe
    (
      (response)=>
      {
        console.log(response);
        this.playerDetails=response;
      },
      (error)=>
      {
        console.log(error);

      }
    )
  }
  getAllPlayers()
  {
    this.playerService.getAllPlayers().subscribe
    (
      (response)=>
      {
        console.log(response);
        this.playerDetails=response;
      },
      (error)=>
      {
        console.log(error);

      }
    )
  }
  addPlayer()
  {
    if(this.playerDetails!='')
    {
      this.playerDetails=undefined;
    }
    this.router.navigate(['add-player']);
    
  }


}
