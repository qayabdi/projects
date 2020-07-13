alert("This site is best viewed with JavaScript enabled.");

function validateForm() {
  var x = ocument.getElementById(myTextInput)
  if (x == "") {
    alert("Name must be filled out");
    return false;
  }
}