document.write("Welcome to JavaScript")
let x = "College"



function message(){
    alert("Is this working?")
    // inp()
    printA()
    printB()
    // NewFunction()
}
function printA(){
    alert("Print a")
}

function printB(){
    alert("Print b")
    
}

function NewFunction(){
    let y = 30
    // console.log(x + y)
    alert(x + y)
    document.getElementById("Tab1").innerHTML = 45+55
}

// function inp(){
//     var a = parseInt(prompt("Enter the value of a : "))
//     var b = parseInt(prompt("Enter the value of b : "))
//     alert(a+b)
// }

// function add(a, b)

function Get3(){
    var a = parseInt(prompt("Enter First Number : "))
    var b = parseInt(prompt("Enter Second Number : "))
    var c = parseInt(prompt("Enter Third Number : "))
    var max = 0
    if(a>b && a>c){
        max = a;
    }
    else{
        if(b>c){
            max = b
        }
        else{
            max = c
        }
    }

    window.alert("Max number is : " + max)
}
