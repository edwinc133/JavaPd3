
let data;

async function init(){
  let link ="https://upgraded-potato-x57xvq7wg99fvq7q-8500.app.github.dev/";
  let route="customers"
  info = await fetch(link+route);
  data = await info.json();

  //first dump the array to the console and examine 
  //the content
  console.log(data);

}