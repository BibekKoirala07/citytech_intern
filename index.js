const args = process.argv.slice(2);

let array;
if (args.length === 0) {
  array = [7, 6, 5, 4, 3, 2, 1];
  console.log("No array provided. Using default array:" + array);
} else {
  array = args.map(Number);
  console.log("the given array is " + array);
}

const countInversion = (array) => {
  let count = 0;
  for (let i = 0; i < array.length; i++) {
    for (let j = i + 1; j < array.length; j++) {
      if (array[i] > array[j]) {
        count++;
      }
    }
  }
  return count;
};

const totalInversionOfArray = countInversion(array);
console.log("The total Inversion of Array is " + totalInversionOfArray);
