const result = document.querySelector('#result');

const calculateSum = (number) => {
  let sum = 0;
  for (let i = 1; i <= number; i = i + 1) {
    if (i % 2 === 0) {
      sum += i;
    }
  }
  return sum;
};

let sum = calculateSum(20);

result.textContent = 'Total:' + sum;
