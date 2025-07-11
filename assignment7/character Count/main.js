var textArea = document.getElementById("myTextArea");
var characterCounter = document.getElementById("charCount");
textArea.addEventListener("input", function () {
    var currentLength = textArea.value.length;
    characterCounter.textContent = "Characters:" + currentLength;
});
