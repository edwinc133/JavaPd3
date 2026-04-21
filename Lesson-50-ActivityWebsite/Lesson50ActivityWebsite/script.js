
let data,songs;
function init(){
    $.ajaxSetup({async: false});
  let link = "https://upgraded-potato-x57xvq7wg99fvq7q-8500.app.github.dev/"
  let route = "/songs"
  data = $.getJSON(link+route).responseJSON; 
  
  generateCards(songs)

  }

  function generateCards(songs){
    let output = document.getElementById("output");
    let build = "";

    for(let x=0; i<songs.length; x++){
      let songs = songs[i]; 
      build += '<div class="card">'
      build += '<h3> Song Name </h3>'; 
      build += '<p> Name: ${track.name} </p>';
      build += '<h3> Album </h3>';
      build += '<p> Album: ${track.trackid} </p>';
      build += '<h3> Composer </h3>';
      build += '<p> Album: ${track.composer} </p>';
      build += '</div>'

    }
    output.innerHTML = build;
  }






