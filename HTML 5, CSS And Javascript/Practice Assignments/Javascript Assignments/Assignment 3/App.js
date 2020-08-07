const usernameEl = document.getElementById('username');
const passwordEl = document.getElementById('password');
const submitBtnEl = document.querySelector('button');

const validateHandler = () => {
	let username = usernameEl.value.trim();
	let password = passwordEl.value.trim();
	if (document.querySelector('h3')) {
		document.querySelector('body').removeChild(document.querySelector('h3'));
	}
	const alertEl = document.createElement('h3');
	if (username && password) {
		if (username === 'admin' && password === 'admin') {
			alertEl.textContent = 'Valid user';
		} else {
			alertEl.textContent = 'Invalid user';
		}
	} else {
		alertEl.textContent = 'Fields are blank';
	}
	document.querySelector('body').appendChild(alertEl);
};

submitBtnEl.addEventListener('click', validateHandler);
