const usernameEl = document.getElementById('username');
const passwordEl = document.getElementById('password');
const confirmPasswordEl = document.getElementById('confirm-password');
const mobileNumberEl = document.getElementById('mobile-number');

const usernameFeedbackEl = document.getElementById('username-feedback');
const passwordFeedbackEl = document.getElementById('password-feedback');
const confirmPasswordFeedbackEl = document.getElementById(
	'confirm-password-feedback'
);
const mobileNumberFeedbackEl = document.getElementById(
	'mobile-number-feedback'
);

const usernameHandler = (event) => {
	if (event.target.value) {
		if (event.target.value.length > 6) {
			usernameFeedbackEl.style.color = 'green';
			usernameFeedbackEl.textContent = 'Name has more than six characters';
		} else {
			usernameFeedbackEl.style.color = 'red';
			usernameFeedbackEl.textContent =
				'Name does not have more than six characters';
		}
	}
};

const passwordHandler = (event) => {
	if (event.target.value) {
		if (/^[ A-Za-z0-9_@./#&*()+-]*$/.test(event.target.value)) {
			passwordFeedbackEl.style.color = 'green';
			passwordFeedbackEl.textContent =
				'Password contains alphanumeric and special characters';
		} else {
			passwordFeedbackEl.style.color = 'red';
			passwordFeedbackEl.textContent =
				'Password does not contain alphanumeric and special characters';
		}
	}
};

const confirmPasswordHandler = (event) => {
	if (event.target.value && passwordEl.value) {
		if (event.target.value === passwordEl.value) {
			confirmPasswordFeedbackEl.style.color = 'green';
			confirmPasswordFeedbackEl.textContent =
				'Password and Confirm Password matches with each other';
		} else {
			confirmPasswordFeedbackEl.style.color = 'red';
			confirmPasswordFeedbackEl.textContent =
				'Password and Confirm Password does not match with each other';
		}
	}
};

const mobileNumberHandler = (event) => {
	if (event.target.value) {
		if (event.target.value.length === 10) {
			let firstNumber = event.target.value.charAt(0);
			firstNumber = +firstNumber;
			if (firstNumber >= 6 && firstNumber <= 9) {
				mobileNumberFeedbackEl.style.color = 'green';
				mobileNumberFeedbackEl.textContent = 'Mobile Number is a valid number';
			} else {
				mobileNumberFeedbackEl.style.color = 'red';
				mobileNumberFeedbackEl.textContent = 'Mobile Number is invalid';
			}
		} else {
			mobileNumberFeedbackEl.style.color = 'red';
			mobileNumberFeedbackEl.textContent =
				'Mobile Number does not have 10 digits';
		}
	}
};

usernameEl.addEventListener('blur', usernameHandler);
passwordEl.addEventListener('blur', passwordHandler);
confirmPasswordEl.addEventListener('blur', confirmPasswordHandler);
mobileNumberEl.addEventListener('blur', mobileNumberHandler);
