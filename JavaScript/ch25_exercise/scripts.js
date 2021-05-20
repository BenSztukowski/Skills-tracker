window.addEventListener("load",function(){
    let form = document.querySelector("form");
    let testName = document.querySelector("input[name=testName]");
    let names = ["testName", "testDate", "rocketType", "boosterCount", "wind", "productionServers"];
    let testDate = document.querySelector("input[name=testDate]");
    let rocketType = document.querySelector("select[name=rocketType]");
    let boosterCount = document.querySelector("input[name=boosterCount]");
    let wind = document.querySelectorAll("input[name=wind]");
    let productionServers = document.querySelector("input[name=productionServers]");

    // let form = document.querySelector("form");
    // form.addEventListener("submit", function(event){
    //   for(let i = 0; i<names.length; i++){
    //     let temp = (document.querySelector(`input[name=${names[i]}]`)).value;
    //     console.log(temp);
    //     if (!temp || temp === "null"){
    //       alert("All fields must have a value");
    //       event.preventDefault();
    //       break;
    //     }
    //   }
    // })

    form.addEventListener("submit", function(event){
        if(testName.value === ""){
            alert("Must have a name");
            event.preventDefault();
        }

        if(testDate.value === ""){
            alert("must choose a test date");
            event.preventDefault();
        }

        if (rocketType.value === "null"){
            console.log(`rocketType: ${rocketType}`);
            alert("Must choose rocket type");
            event.preventDefault();
        }
        
        let accumulator = 0;
        for (let i =0; i < wind.length; i++){
            if (wind[i].checked){
                accumulator += 1;
                console.log(`total checked: ${accumulator}`);
            }
        }
        
        if (accumulator < 1){
            alert("Must select a wind speed");
            event.preventDefault();
        }

       
    })
    
  })