const users = [
{ name: "mahesh", age: 21 },
{ name: "divya", age: 21 },
{ name: "dileep", age: 21 },
{ name: "naveen", age: 21 }
];


let container = document.createElement("section");


for(user of users){
    let divt=document.createElement("div");
    let h1t=document.createElement("h1");
    let h2t=document.createElement("h2");
    h1t.innerText=`${user.name}`;
    h2t.innerText=`${user.age}`;
    divt.appendChild(h1t);
    divt.appendChild(h2t);
    container.appendChild(divt);
  
}
  document.body.appendChild(container);