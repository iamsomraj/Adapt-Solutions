const customerNameEL = document.getElementById('customer-name');
const customerNameFeedbackEL = document.getElementById(
	'customer-name-feedback'
);

const rentStartDateEl = document.getElementById('rent-start-date');
const rentStartDateFeedbackEl = document.getElementById(
	'rent-start-date-feedback'
);

const tenureEl = document.getElementById('tenure');
const tenureFeedbackEl = document.getElementById('tenure-feedback');

customerNameEL.addEventListener('blur', (event) => {
	if (event.target.value) {
		const customerName = event.target.value;
		const newCustomerName = customerName.toUpperCase().trim();
		if (newCustomerName.length > 5) {
			if (/^[A-Z][A-Z\s]*$/.test(newCustomerName)) {
				customerNameFeedbackEL.style.color = 'green';
				customerNameFeedbackEL.textContent =
					'Customer Name contains only characters or spaces';
			} else {
				customerNameFeedbackEL.style.color = 'red';
				customerNameFeedbackEL.textContent =
					'Customer Name is in invalid format';
			}
		} else {
			customerNameFeedbackEL.style.color = 'red';
			customerNameFeedbackEL.textContent =
				'Customer Name is not above 5 in length';
		}
	}
});

rentStartDateEl.addEventListener('blur', (event) => {
	if (event.target.value) {
		const rentStartDate = new Date(event.target.value);
		const date = new Date();
		console.log('entered', rentStartDate.toISOString());
		console.log('date', date.toISOString());
		if (rentStartDate >= date) {
			rentStartDateFeedbackEl.style.color = 'green';
			rentStartDateFeedbackEl.textContent =
				'Rent start date is either current or future date';
		} else {
			rentStartDateFeedbackEl.style.color = 'red';
			rentStartDateFeedbackEl.textContent =
				'Rent start date is in invalid format';
		}
	}
});

tenureEl.addEventListener('blur', (event) => {
	if (event.target.value) {
		if (!isNaN(event.target.value)) {
			const tenure = +event.target.value;
			if (tenure < 30) {
				tenureFeedbackEl.style.color = 'green';
				tenureFeedbackEl.textContent = 'Tenure is less than 30 days';
			} else {
				tenureFeedbackEl.style.color = 'red';
				tenureFeedbackEl.textContent = 'We cannot rent over 30 days!';
			}
		} else {
			tenureFeedbackEl.style.color = 'red';
			tenureFeedbackEl.textContent = 'Tenure should be a number';
		}
	}
});

// could not do the on load event because input element does not support on load event
// source : https://stackoverflow.com/questions/3708850/is-there-an-onload-event-for-input-elements
// feel free to make a pull request if you have done this
// one can add load event to the body tag
