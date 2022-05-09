import { Component, OnInit } from '@angular/core';
import {
  AbstractControl,
  FormBuilder,
  FormControl,
  FormGroup,
  ValidationErrors,
  ValidatorFn,
  Validators
} from "@angular/forms";
import {ValidateFn} from "codelyzer/walkerFactory/walkerFn";

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})

export class FormComponent implements OnInit {
  countryList = [
    {id: 1, name: "Da Nang"},
    {id:2, name :"Quang Nam"},
    {id:3, name : "Hue"}];

  comparePassword() : ValidatorFn {
    return (control: AbstractControl): ValidationErrors | null => {
      const value = control.value;
      return (value.password === value.confirmPassword) ? null : {
        passwordNotMatch: true
      };
    };
  }

  registerForm: FormGroup;

  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
    this.registerForm = this.fb.group({
      email: ['',[Validators.required,Validators.email]],
      pwGroup: this.fb.group({
        password: ['',[Validators.required,Validators.minLength(6)]],
        confirmPassword: ['']
      }, [this.comparePassword()]),
      country: ['',[Validators.required]],
      age: ['',[Validators.required]],
      gender: ['',[Validators.required]],
      phone: ['',[Validators.required,Validators.pattern(/^\+84\d{9,10}$/)]]
    });
  }

  onSubmit() {
  };
}
