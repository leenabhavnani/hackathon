import { Component, OnInit, Input } from '@angular/core';
import { HttpClient } from "@angular/common/http";
//import {MailMessage} from "./helpand-suggestion.model";
@Component({
  selector: 'app-helpand-suggestion',
  templateUrl: './helpand-suggestion.component.html',
  styleUrls: ['./helpand-suggestion.component.css']
})
export class HelpandSuggestionComponent implements OnInit {
subject: '';
suggestion:'';
data:any;
  constructor(private http: HttpClient ) { }

  ngOnInit(): void {
  }
  action(){
	   var config = {headers: {
                'accept': 'application/json'    
            }
        };
    let body = { "mail_to_address":"teaminsight.apithon@gmail.com","mail_cc_address":"teaminsight.apithon@gmail.com","mail_bcc_address":"teaminsight.apithon@gmail.com","mail_subject":this.subject,"mail_body": this.suggestion};
     this.http.post("http://localhost:8010/sendmail",body,config).subscribe((data) => this.data = data);
  }

}
