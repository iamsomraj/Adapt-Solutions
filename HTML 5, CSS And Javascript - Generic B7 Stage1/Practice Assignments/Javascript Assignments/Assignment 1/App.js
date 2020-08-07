const name = prompt('Enter your name');
confirm(`Your name is ${name}`);
alert(`Welcome to our website, ${name}`);
const nameEl = document.createElement('h1');
nameEl.textContent = `Welcome to our website, ${name}`;
document.querySelector('body').appendChild(nameEl);
