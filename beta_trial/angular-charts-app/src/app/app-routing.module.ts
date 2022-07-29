import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BarChartComponent } from './bar-chart/bar-chart.component';
import { LineChartComponent } from './line-chart/line-chart.component';
import { AngularExcelComponent } from './angular-excel/angular-excel.component';

const routes: Routes = [
  {path: 'line-chart', component: LineChartComponent},
  {path: 'bar-chart', component: BarChartComponent},
  {path: 'upload-excel', component: AngularExcelComponent},

  {path: "**", pathMatch: 'full', redirectTo: 'home'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
