/*make a faulti calculator which gives 10% of its calculation wrong */
/*take to input number*/
/*wrong operation performs as follow....*/
/*
+  ----> -
*  ----> +
-  ----> /
/  ---->+
*/
let a,b;
const prompt  = require("prompt-sync")();
a= prompt("enter value of 'a' =");
b= prompt("enter value of 'b' =");

let c=Math.random();  /*Math.random() gives a randon number between 0 to 1 */
if(c>0.1){
    console.log("sum=",parseInt(a)+parseInt(b));
    console.log("multiplication=",a*b);
    console.log("substraction=",a-b);
    console.log("division=",a/b);
}
else{
    console.log("sum=",a-b);
    console.log("multiplication=",a+b);
    console.log("substraction=",a/b);
    console.log("division=",a+b);
}

