import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-color',
  templateUrl: './color.component.html',
  styleUrls: ['./color.component.css']
})
export class ColorComponent implements OnInit {
  rCode:number = 0;
  gCode:number = 0;
  bCode:number = 0;

  rgbCode:string;
  hexCode:string;
  toRgbCodeAndHexCode() {
    this.rgbCode ="rgb(" + this.rCode+ "," + this.gCode + "," + this.bCode + ")";
    this.hexCode ="#" + ((1 << 24) + (this.rCode << 16) + (this.gCode << 8) + this.bCode).toString(16).slice(1);
  }
  alertRgbCode() {
    alert(this.rgbCode)
  };
  constructor() { }

  ngOnInit(): void {
  }

}
