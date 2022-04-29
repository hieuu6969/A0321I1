import { Component, OnInit } from '@angular/core';
import {Pet} from "../pet";

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})
export class PetComponent implements OnInit {
  pet: Pet = {
    name: "puppie",
    image: "https://scontent.fpnh22-4.fna.fbcdn.net/v/t1.6435-9/41290358_2103208103326197_4958826397939269632_n.jpg?_nc_cat=108&ccb=1-5&_nc_sid=8bfeb9&_nc_ohc=788RdE1g6C8AX9pUdUu&_nc_ht=scontent.fpnh22-4.fna&oh=00_AT8kZK0fr_VXoH1rmYzihFUa_H2mN_sYjp5Sgc7SZaR7wA&oe=6290DEB5"
  };
  constructor() { }

  ngOnInit(): void {
  }

}
