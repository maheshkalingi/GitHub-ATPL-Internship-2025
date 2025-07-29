function arraysEqual(firstArray: number[], secondArray: number[]): boolean {
  if (firstArray.length !== secondArray.length) {
    return false;
  }
  firstArray.sort();
  secondArray.sort();
  for (let i = 0; i < firstArray.length; i++) {
    if (firstArray[i] !== secondArray[i]) {
      return false; 
    }
  }
  return true;
}
console.log(arraysEqual([1, 2, 3], [3, 2, 1])); 
console.log(arraysEqual([1, 2, 3], [1, 2, 4]));