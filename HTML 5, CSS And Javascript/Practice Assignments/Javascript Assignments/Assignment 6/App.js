const inputEl = document.querySelector('input');
const buttonEl = document.querySelector('button');

const checkLeapYearHandler = () => {
	let isLeapYear = false;
	if (inputEl.value) {
		const input = parseInt(inputEl.value.trim());
		isLeapYear = input % 4 === 0 && (input % 100 !== 0 || input % 400 === 0);
		const leapYearEl = document.createElement('h3');
		if (isLeapYear) {
			leapYearEl.textContent = `${input} is a leap year`;
		} else {
			leapYearEl.textContent = `${input} is not a leap year`;
		}
		document.querySelector('body').appendChild(leapYearEl);

		// after two seconds, the input will be cleared and the message also
		
		setTimeout(() => {
			inputEl.value = '';
			document.querySelector('body').removeChild(leapYearEl);
		}, 2000);
	}
};

buttonEl.addEventListener('click', checkLeapYearHandler);
