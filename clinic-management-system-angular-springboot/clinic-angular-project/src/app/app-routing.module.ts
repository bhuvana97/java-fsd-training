import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PatientViewComponentComponent } from './patient-view-component/patient-view-component.component';
import { HomeComponentComponent } from './home-component/home-component.component';
const routes: Routes = [{path:'',component:HomeComponentComponent},
{path:'patient-view-component',component:PatientViewComponentComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents=[HomeComponentComponent,PatientViewComponentComponent]
