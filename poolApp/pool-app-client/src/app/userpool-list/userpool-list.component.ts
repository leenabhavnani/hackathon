
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
  userpoolData: Observable<Userpool[]>;

  constructor(private userPoolService: UserPoolService,
              private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.userpoolData = this.userPoolService.getUserpoolList();
  }


  userpoolDetails(id: number){
    this.router.navigate(['details', id]);
  }
}
