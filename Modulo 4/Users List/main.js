const usersList = document.querySelector('ul');
const form = document.querySelector('form');

function createUser(name) {
	const userWrapper = document.createElement('li');
	userWrapper.className = 'user';

	const userSpan = document.createElement('span');
	userSpan.textContent = name;

	const userRemoveBtn = document.createElement('button');
	userRemoveBtn.type = 'button';
	userRemoveBtn.className = 'btn-danger';
	userRemoveBtn.textContent = 'Remover';
	userRemoveBtn.onclick = function () {
		removeUser(this);
	};

	userWrapper.appendChild(userSpan);
	userWrapper.appendChild(userRemoveBtn);
	usersList.appendChild(userWrapper);
}

function removeUser(userRemoveBtn) {
	const userNodes = document.querySelectorAll('.user');
	userNodes.forEach((user) => {
		if (user === userRemoveBtn.parentNode) {
			user.remove();
		}
	});
}

form.addEventListener('submit', (evt) => {
	const userName = document.querySelector('input[name="inputName"]');
	createUser(userName.value);
	form.reset();
	evt.preventDefault();
});
