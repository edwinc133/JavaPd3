
let data,players;
function init(){
  $.ajaxSetup({async: false});
  let link = "https://upgraded-potato-x57xvq7wg99fvq7q-8500.app.github.dev/"
  let route = "soccer"
  let info = await fetch(link+route)
  soccer = await info.json()
  console.log(soccer)



  
  generateCards(soccer)

  }

  function generateCards(soccer){
    let output = document.getElementById("output");
    let build = "";

    for(let x=0; x<soccer.length; x++){
      let song = soccer[x]; 
      build += `<div class="card">`
      build += `<h3> Song Name </h3>`; 
      build += `<p> Name: ${soccer.Name} </p>`;
      build += `<h3> Album </h3>`;
      build += `<p> Album: ${soccer.Album} </p>`;
      build += `<h3> Composer </h3>`;
      build += `<p> Composer: ${soccer.Composer} </p>`;
      build += `</div>`

    }
    output.innerHTML = build;
  }
 
}




