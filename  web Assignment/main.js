 const r1=document.getElementById("r1");
 const r2=document.getElementById("r2");
 const r3=document.getElementById("r3");
 r1.addEventListener("click", () => {
    r1.style.backgroundColor="black";
    r2.style.backgroundColor="white";
    r3.style.backgroundColor="white";
 });
 r2.addEventListener("click", () => {
    r1.style.backgroundColor="white";
    r2.style.backgroundColor="black";
    r3.style.backgroundColor="white";
 });
 r3.addEventListener("click", () => {
    r1.style.backgroundColor="white";
    r2.style.backgroundColor="white";
    r3.style.backgroundColor="black";
 });


