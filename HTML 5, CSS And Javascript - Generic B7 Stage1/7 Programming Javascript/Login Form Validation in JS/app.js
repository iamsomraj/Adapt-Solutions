const usernameEl = document.getElementById('username');
const passwordEl = document.getElementById('password');
const infoEl = document.getElementById('info');

console.log(usernameEl, passwordEl, infoEl);

const UserLogin = () => {
  const username = usernameEl.value;
  const password = passwordEl.value;

  if (username === 'admin') {
    infoEl.textContent = 'Valid User';
  } else {
    infoEl.textContent = 'Invalid User';
  }
};
