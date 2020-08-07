const selectEl = document.querySelector('select');
const inputEl = document.querySelector('input');
const submitBtnEl = document.querySelector('button');

const calculatePrice = () => {
	const optionEls = selectEl.options;
	let price = 0;
	for (let i = 0; i < optionEls.length; i++) {
		if (optionEls[i].selected) {
			switch (optionEls[i].value) {
				case 'typeOne':
					price = 10 * i;
					break;
				case 'typeTwo':
					price = 10 * i;
					break;
				case 'typeThree':
					price = 10 * i;
					break;
				case 'typeFour':
					price = 10 * i;
					break;
				case 'typeFive':
					price = 10 * i;
					break;
				default:
					price = 'Please select a type';
			}
		}
	}
	inputEl.value = price;
};

selectEl.addEventListener('change', calculatePrice);
