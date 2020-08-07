const firstNameEl = document.getElementById('first-name');
const lastNameEl = document.getElementById('last-name');
const ageEl = document.getElementById('age');
const degreeEls = document.getElementsByName('degree');
const submitBtnEl = document.querySelector('button');

const registerHandler = () => {
	const firstName = firstNameEl.value;
	const lastName = lastNameEl.value;
	const age = parseInt(ageEl.value);
	let degreeValue = '';
	for (let i = 0; degreeEls.length; i++) {
		if (degreeEls[i].checked) {
			degreeValue = degreeEls[i].value;
			break;
		}
	}
	if (firstName && lastName && age && degreeValue) {
		const registerEl = document.createElement('h4');
		registerEl.textContent =
			'firstName: ' +
			firstName +
			'  ' +
			'lastName: ' +
			lastName +
			'  ' +
			'age: ' +
			age +
			'  ' +
			'degreeValue: ' +
			degreeValue;
		document.querySelector('body').appendChild(registerEl);
	}
};

submitBtnEl.addEventListener('click', registerHandler);
