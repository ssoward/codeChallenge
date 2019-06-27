//Javascript for PCIT app

// play the selected video

function playVideo(e) {
    // alert("success! " + e);

    var videoNode = document.querySelector('video');
    var fileURL = "./media/video/" + e + ".mp4";

    // alert(fileURL);

    videoNode.src = fileURL;
}

// JSON object for storing tally of each behavior
// id, inner text, count
var myJSON =    [   {"id":"q", "text":"Question:", "count":0}, 
                    {"id":"c", "text":"Command:", "count":0}, 
                    {"id":"i", "text":"Imitate:", "count":0},
                    {"id":"e", "text":"Use Enthusiasm:", "count":0},
                    {"id":"d", "text":"Ignore Disruptive Bx:", "count":0},
                    {"id":"n", "text":"Neutral Talk:", "count":0},
                    {"id":"b", "text":"Behavior Description:", "count":0},
                    {"id":"r", "text":"Reflection:", "count":0},
                    {"id":"l", "text":"Labeled Praise:", "count":0},
                    {"id":"u", "text":"Unlabeled Praise:", "count":0},
                    {"id":"g", "text":"Negative Talk:", "count":0}
                ]

// Add a point on button push
function addPoint(id) {

    // alert("addPoint id: " + id);

      
    // iterate through JSON object
    for (var i = 0; i < myJSON.length; i++) {
    
        // alert("myJSON[i].id: " + myJSON[i].id);

        // if item id and button id are the same
        // increase the tally
        // update the count value in the button text
        // return on positive match
        if (myJSON[i].id == id) {
            
            //alert("match!");

            //alert("current count: " + myJSON[i].count);

            myJSON[i].count++;

            //alert("after add: " + myJSON[i].count);
            
            // to keep text spacing more consistent, add two spaces when count is single digit
            // otherwise add two spaces when it's double digits
            if (myJSON[i].count < 10) {
                //alert ('count less than 10');
                document.getElementById(id).innerHTML = myJSON[i].text + "&nbsp;&nbsp;" + myJSON[i].count;
                //alert ('text should have changed');
            } else {
                //alert ('count greater than 10');
                document.getElementById(id).innerHTML = myJSON[i].text + "&nbsp;" + myJSON[i].count;
                //alert ('text should have changed'); 
            }
            return;
        }
    }

}

function subPoint(id) {
    
    // iterate through JSON object
    for (var i = 0; i < myJSON.length; i++) {

        // if item id and button id are the same
        // decrease the tally
        // update the count value in the button text
        if (myJSON[i].id == id) {

            // if count already == 0, do nothing
            if (myJSON[i].count == 0) {

                return;

            }

            myJSON[i].count--;

            // to keep text spacing more consistent, add two spaces when count is single digit
            // otherwise add two spaces when it's double digits
            if (myJSON[i].count < 10) {
                //alert ('count less than 10');
                document.getElementById(id).innerHTML = myJSON[i].text + "&nbsp;&nbsp;" + myJSON[i].count;
                //alert ('text should have changed');
            } else {
                //alert ('count greater than 10');
                document.getElementById(id).innerHTML = myJSON[i].text + "&nbsp;" + myJSON[i].count;
                //alert ('text should have changed'); 
            }

            return;
        }
    }
}

// Before opening report page, need to store JSON
function storeJSON() {
        localStorage.setItem('mySJON', JSON.stringify(myJSON));  
}

// Open the report page
function openReport() {
    window.location.href='report.html';
}

// fills the table to generate the report

function fillTable() {

    // retrieve JSON  with current tallies
    var retrieved = JSON.parse(localStorage.getItem('mySJON'));

    // iterate through object
    for (var i = 0; i < retrieved.length; i++) {

        // change innerHTML to tally value
        document.getElementById(retrieved[i].id).innerHTML = retrieved[i].count;

    }
}


// this section captures keypresses
document.addEventListener("keydown", keyDownTextField, false);

function keyDownTextField(e) {

    var keyCode = e.keyCode;
    if(keyCode==81 || keyCode==65) {
        addPoint('q');
    } else if(keyCode==67 || keyCode==83) {
        addPoint('c');
    } else if(keyCode==78 || keyCode==68) {
        addPoint('n');
    } else if(keyCode==66 || keyCode==74) {
        addPoint('b');
    } else if(keyCode==82 || keyCode==75) {
        addPoint('r');
    } else if(keyCode==76) {
        addPoint('l');
    }
}

