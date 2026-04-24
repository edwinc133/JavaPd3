
let data,songs;
async function init(){
    $.ajaxSetup({async: false});
  let link = "https://upgraded-potato-x57xvq7wg99fvq7q-8500.app.github.dev/"
  let route = "songs"
  let info = await fetch(link+route)
  songs = await info.json()
  console.log(songs)



  
  generateCards(songs)

  }

  function generateCards(songs){
    let output = document.getElementById("output");
    let build = "";

    for(let x=0; x<songs.length; x++){
      let song = songs[x]; 
      build += `<div class="card">`
      build += `<h3> Song Name </h3>`; 
      build += `<p> Name: ${song.Name} </p>`;
      build += `<h3> Album </h3>`;
      build += `<p> Album: ${song.Album} </p>`;
      build += `<h3> Composer </h3>`;
      build += `<p> Composer: ${song.Composer} </p>`;
      build += `</div>`

    }
    output.innerHTML = build;
  }






