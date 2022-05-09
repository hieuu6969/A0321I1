import {Component, Input, OnInit} from '@angular/core';
import {IRatingUnit} from "../irating-unit";

@Component({
  selector: 'app-rating-bar-component',
  templateUrl: './rating-bar-component.component.html',
  styleUrls: ['./rating-bar-component.component.css']
})
export class RatingBarComponentComponent implements OnInit {
  backgroundColor = "#E4E4E4";
  ratingColor = "#FFCC0B"
  @Input() ratingScore: number;
  @Input() ratingUnits: IRatingUnit[] = [
    {
      value:1,
      active: false
    },{
      value:2,
      active: false
    },{
      value:3,
      active: false
    },{
      value:4,
      active: false
    },{
      value:5,
      active: false
    },{
      value:6,
      active: false
    },{
      value:7,
      active: false
    },{
      value:8,
      active: false
    },{
      value:9,
      active: false
    },{
      value:10,
      active: false
    },
  ];
  constructor() { }

  ngOnInit(): void {
  }

  changeRating(ratingUnit:IRatingUnit) {
    this.ratingScore = ratingUnit.value;
    for (let rating of this.ratingUnits) {
      if (rating.value <= ratingUnit.value ){
        rating.active = true;
      } else {
        rating.active = false;
      }
    }
  }
}
