import { Component, OnInit } from '@angular/core';
import {Calculation} from "../calculation";

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
    // num1: number;
    // num2: number;
    result: number;
    plusNumber(num1:number,num2:number) {
      this.result = num1 + num2;
    };
    minusNumber(num1:number,num2:number) {
      this.result = num1 - num2;
    };
    multipleNumber(num1:number,num2:number) {
      this.result = num1 * num2;
    };
    divideNumber(num1:number,num2:number) {
      this.result = num1 / num2;
    };
  constructor() { }

  ngOnInit(): void {
  }

  Number(value: string) {
    return Number(value);
  }
}
