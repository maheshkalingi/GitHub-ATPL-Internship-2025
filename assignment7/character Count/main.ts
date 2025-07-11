const  textArea  =document.getElementById("myTextArea") as HTMLTextAreaElement;
const  characterCounter  =document.getElementById("charCount") as HTMLParagraphElement;

textArea.addEventListener("input",()=>{
    const currentLength = textArea.value.length ;
    characterCounter.textContent="Characters:"+ currentLength ;
});

