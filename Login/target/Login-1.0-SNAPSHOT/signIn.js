function togglePassword(Element){
    const password = document.getElementById('password');
    if (Element.type == 'text') {
        Element.type = 'password';
    } else {
        Element.type = 'text';
    }
}
document.getElementById('eye-button1').addEventListener('click', function() {
    togglePassword(document.getElementById('password'));
});
document.getElementById('eye-button2').addEventListener('click', function() {
    togglePassword(document.getElementById('re-password'));
});


function isEqualPassword(){
    if(document.getElementById('password').value == document.getElementById('re-password').value){
        console.log(true);
    }
    else{
        console.log(false);
    }
}
document.getElementById('re-password').addEventListener('input', function() {
    isEqualPassword();

    });

function hash(message) {
    return CryptoJS.SHA3(message, {outputLength: 512}).toString();
    }

function signup(){
    let userName = document.getElementById("name").value;
    let password = ""
    if (document.getElementById('password').value == document.getElementById('re-password').value){
        password = hash(document.getElementById('password').value);
    }
    var xhttp = new XMLHttpRequest();
    var formData = new FormData();
    formData.append("userName", userName)
    formData.append("password", password)
    xhttp.open("POST", "SignUp");
    xhttp.send(formData);
    xhttp.onload = function(){
        var res = xhttp.response;
        console.log(res);
    }
}

// function identifyStrength(givenPassword){
    // let specialCharacters = "!@#$%^&*()><,./?";
    // let containsSpecialCharacter = false;
    // let containsUppercase = false;
    // let containsDigit = false;
    // if(givenPassword.length>=8) {
    //     for (let i = 0; i < givenPassword.length; i++) {
    //             let c = password[i];
    //             console.log(c);
    //             if (/[!@#$%^&*(),.?":{}|<>]/.test(c)) {
    //               containsSpecialCharacter = true;
    //             } 
    //             else if (!isNaN(parseInt(c, 10))) {
    //                 containsDigit = true;
    //             }
    //             else if (c === c.toUpperCase() && c !== c.toLowerCase()) {
    //               containsUppercase = true;
    //             }
    //     }
    //     return (containsUppercase && containsDigit && containsSpecialCharacter);
    // }
    // return false;
// }
// console.log(identifyStrength("sdfghjk"));
// console.log(identifyStrength("sdfg1hjk"));
// console.log(identifyStrength("sdfghA1jk"));
// console.log(identifyStrength("sdfgDDW@#3hjk"));