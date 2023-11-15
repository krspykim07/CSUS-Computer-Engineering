
/* Function that creates an alert with the message "Hello, World! */
function showAlert() {
    alert("Hello, world!");
}

/* Function to make the input text bigger */
function makeBigger() {
    document.getElementById("inputText").style.fontSize = "24pt";           // Set input text font size to 24 pt
}


/* Function to apply style on input text
   Selecting FancyShmancy radio button should make the text bold, underline, and blue
   Selecting BoringBetty (or other than FancyShmancy) radio button should make the text go back to normal*/
function applyingStyles() {
    var inputText = document.getElementById("inputText");                   // Create variable for input text

    if (document.getElementById("FancyShmancy").checked) {                  // If the user checked FancyShmancy
        inputText.style.fontWeight = "bold";                                // Set Font Weight to bold
        inputText.style.color = "blue";                                     // Set Font Color to blue
        inputText.style.textDecoration = "underline";                       // Set Text Decoration to underline
    } else {
        inputText.style.fontWeight = "normal";                              // Set Font Weight to normal
        inputText.style.color = "black";                                    // Set Font Color to black
        inputText.style.textDecoration = "none";                            // Set Text Decoration to none
    }
}

/* Function that set the text to uppercase and add suffix "-Moo" at the end of the sentence */
function addMoo() {
    var inputText = document.getElementById("inputText");                   // Create variable for input text
    var words = inputText.value.split(" ");                                 // Create a variable array of words splitted from the input text

    for (var i = 0; i < words.length; i++) {                                // Loop that checks each word
        
        if (words[i].endsWith(".")) {                                       // Condition if the word ends with "." considering as a sentence
            var lastWord = words[i].substring(0, words[i].length - 1);      // Removing the "." from the word
            words[i] = lastWord.toUpperCase() + "-Moo.";                    // Adds "-Moo." from the word
        } else {
            words[i] = words[i].toUpperCase();                              // Change the word to uppercase
        }
    }

    inputText.value = words.join(" ");                                      // Combining all the words
}