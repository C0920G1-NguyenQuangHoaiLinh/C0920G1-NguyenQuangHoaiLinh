import {NgModule} from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {DeleteDialogComponent} from "./components/employees/delete-dialog/delete-dialog.component";
import {MatDialogModule} from "@angular/material/dialog";
import {CreateEmployeeComponent} from "./components/employees/create-employee/create-employee.component";
import {EditEmployeeComponent} from "./components/employees/edit-employee/edit-employee.component";
import {CreateCustomerComponent} from "./components/customer/create-customer/create-customer.component";
import {DeleteCustomerComponent} from "./components/customer/delete-customer/delete-customer.component";
import {EditCustomerComponent} from "./components/customer/edit-customer/edit-customer.component";
import {MatDatepickerModule} from "@angular/material/datepicker";
import {MatNativeDateModule} from "@angular/material/core";
import {MatInputModule} from "@angular/material/input";
import {MatFormFieldModule} from "@angular/material/form-field";

@NgModule({
  imports: [
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatDialogModule
  ],
  exports: [
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatDialogModule
  ],
  providers: [MatDatepickerModule],
  entryComponents: [DeleteDialogComponent, CreateEmployeeComponent, EditEmployeeComponent,
    CreateCustomerComponent, DeleteCustomerComponent, EditCustomerComponent]
})

export class MaterialModule {
}
