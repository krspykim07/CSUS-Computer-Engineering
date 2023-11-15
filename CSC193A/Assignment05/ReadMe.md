Test out your Javascript by writing a page where the user can type text into a box, and by clicking on UI controls, the text will get styling. Submit a link to your solution hosted on your github.

The HTML page fancifymytext.html contains a basic HTML shell and page header.

You will write a JavaScript file fancifymytext.js that will manipulate the text.

Download the HTML file: fancifymytext.html

The first task is to expand fancifymytext.html by adding UI controls. Add HTML code for the following:

    A field for users to enter large (multi-line) amounts of text.
        It should be 4 rows by 30 columns in size.
        Wrap it in a bordered field set box with the label "Text".
    Add a second bordered field set box labeled "Fancify" that contains the following controls:
        A button labeled: Bigger!
        Two radio buttons labeled "FancyShmancy" and "BoringBetty"

In JavaScript code create an alert box. This is just a test to make sure you're running JS code.
hello world

    Create a new file and save it as fancifymytext.js.
    Put the following line of code into the file:

    alert("Hello, world!");

    Now let's set up a very basic JS event handler. Modify your JS code and HTML so that the "Hello, world!" alert message won't pop up until the user clicks the "Bigger" button.
    hello world
        Modify your JS file to wrap the alert into a function.
        Add an onclick handler attribute to the "Bigger" button that calls your new function.
        Refresh your page in the browser. Click the button. Do you see the alert?  If yes, go to the next step.
    Link your HTML page to your JavaScript file using a script tag.
    Refresh your page in the browser. Do you see the alert message?  If yes, you're still on the right track!

Modify your JS code so that when the user clicks "Bigger", the text in the text area will get larger.

    Make sure your text area has an id attribute so your JS code can talk to it.
    Modify your JS function so that it now changes the text area's font size to 24pt .
    Hint: The syntax for accessing an element by ID and changing a style is:

    document.getElementById("elementID").style.propertyName = "value";

        Use proper units, such as "4em", and proper capitalization, such as backgroundColor .

Add an event handler so that when the user sets the "FancyShmancy" radio button, the text area will receive some styles.  If they set the "BoringBetty" radio button, the styles go away.

    Add an onchange on the radio button that calls a function that pops up an alert.
    Modify your new function to set the text area's font weight to bold.
        You can see if a radio button is set by checking its checked property. (Give it an id.)
        When the radio button is switched to the "BoringBetty", the font weight should go back to normal.
    Once the bold part works, let's add some additional styles to the text when "FancyShmancy" radio button is selected:
        change its color to blue
        underline the text (this is the CSS text-decoration 

        Links to an external site. property)
        Keep the bold styling as well -- in total selecting the "FancyShmancy" radio button, should make the text bold, underline, and blue.

    Add a new button to the HTML with the text "Moo" that, when clicked, uppercases the text in the text area.
        Use the value property of the text area.
    Modify your button so that it also adds a suffix of "-Moo" to the last word of each sentence.
        Consider a sentence to be a string of text that ends with a period character, "." .
        Use the String/array methods split and join. For example, to replace spaces with underscores:

        var str = "How are you?"
        var parts = str.split(" ");  // ["How", "are", "you?"]
        str = parts.join("_");       // "How_are_you?"
