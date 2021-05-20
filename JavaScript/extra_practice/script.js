let dataToSave= "Nothing yet";

window.addEventListener("load", function() {
    const fetchPromise = fetch("https://pokeapi.co/api/v2/pokemon/dugtrio").then( function(response) {
        response.json().then( function(json) {
            const div = document.getElementById("data");
            // Add HTML that includes the JSON data
            div.innerHTML = `
                <ul>
                <li>name: ${json.species.name}
                <li>picture: <img src =${json.sprites.other.dream_world.front_default}></img></li>
                </ul>
            `;
        });
    });

    function display(dataToSave){
        const saved = document.getElementById("saved");
        saved.innerHTML = fetchPromise.species.name
    }
});
