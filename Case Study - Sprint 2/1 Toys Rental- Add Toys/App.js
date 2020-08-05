const toyNameEl = document.getElementById('toyname');
const toyTypeEl = document.getElementById('toytype');
const priceEl = document.getElementById('price');
const quantityEl = document.getElementById('quantity');

const validate = () => {
  const toyName = toyNameEl.value;
  const toyType = toyTypeEl.value;
  const price = priceEl.value;
  const quantity = quantityEl.value;

  if (
    // Not going to use Regex validation for length checking : toy name and toy type
    toyName.length > 3 &&
    toyType.length > 3 &&
    !isNaN(price) &&
    !isNaN(quantity)
  ) {
    console.log('Form is submitted');
  } else {
    console.log('Form is invalid');
  }
};
