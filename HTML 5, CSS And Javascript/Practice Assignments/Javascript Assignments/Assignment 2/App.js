const calculateBtnEl = document.querySelector('button');
const inputEl = document.querySelector('input');

const calculateSum = () => {
	const input = inputEl.value.toString();
	if (input && !isNaN(input)) {
		let sum = 0;
		let oddDigits = 'The odd digits are - ';
		for (let i = 0; i < input.length; i++) {
			if (i % 2 === 0) {
				// as the index starts from 0 - we have to take it as 1
				// for index 2, it will be 3
				oddDigits = oddDigits + ` ${input.charAt(i)}`;
				sum = sum + parseInt(input.charAt(i));
			}
		}
		const oddEl = document.createElement('p');
		oddEl.textContent = oddDigits;
		document.querySelector('body').appendChild(oddEl);
		const resultEl = document.createElement('h3');
		resultEl.textContent = `The result of the sum of the odd digits is ${sum}`;
		document.querySelector('body').appendChild(resultEl);
	}
};

calculateBtnEl.addEventListener('click', calculateSum);
