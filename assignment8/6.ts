function removeDuplicates(arr: number[]): number[] {
  const uniqueSet = new Set(arr);
  const uniqueArray = Array.from(uniqueSet);
  return uniqueArray;
}
console.log(removeDuplicates([1, 2, 2, 3, 4, 4, 5]));