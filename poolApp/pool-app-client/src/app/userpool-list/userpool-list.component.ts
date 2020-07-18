
import { UserpoolDetailsComponent } from '../userpool-details/userpool-details.component';
import { Observable } from "rxjs";
import { UserPoolService } from "../user-pool.service";
import { Userpool } from "../userpool";
import { Component, OnInit } from "@angular/core";
import { Router } from '@angular/router';

@Component({
  selector: 'app-userpool-list',
  templateUrl: './userpool-list.component.html',
  styleUrls: ['./userpool-list.component.css']
})
export class UserpoolListComponent implements OnInit {
  userpoolData: Userpool[];

  constructor(private userPoolService: UserPoolService,
              private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {

         var userpoolData : Userpool[] = [];
         userpoolData.push({id:1, poolName:"pool test",amount:30000, tenorInMonths:6,active:true});
    return userpoolData;
    //  { "id": 0, "poolName": "Available" },
      //{ "id": 1, "poolName": "Ready" },
      //{ "id": 2, "poolName": "Started" }
    //this.userPoolService.getUserpoolList();
  }


  userpoolDetails(id: number){
    this.router.navigate(['details', id]);
  }
}
