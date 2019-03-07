import { Component, OnInit } from '@angular/core';
import {MusiclistService} from '../../shared/musiclist.service';
import {Music} from '../../shared/music.model';


@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.scss']
})
export class PlayerComponent implements OnInit {
  formData: Music;
  constructor(private service: MusiclistService,
  ) {
  }

  ngOnInit() {
    this.service.refreshList();
  }

  populateForm(song: Music) {
    this.service.formData = Object.assign({}, song);
  }

}
