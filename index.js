const countInversion = (arr) => {
  for (let i = 0; i < array.length; i++) {
    for (let j = i + 1; j < array.length; j++) {
      if (arr[i] > arr[j]) {
        count++;
      }
    }
  }
};

const totalInversionOfArray = countInversion([1, 2, 3, 4]);
