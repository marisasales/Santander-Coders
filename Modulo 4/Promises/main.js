const ul = document.querySelector('ul');
const divList = document.querySelector('#list');

function createNumberList() {
	const randomLength = Math.floor(Math.random() * (10 - 2) + 2);
	const randomNumber = () => Math.floor(Math.random() * 10);

	return Array.from({ length: randomLength }, randomNumber);
}

function createPromiseList(number, max, min) {
	let promiseList = [];

	for (let i = 0; i < number; i++) {
		const randomTime = Math.floor(Math.random() * (max - min) + min);
		let promise = new Promise((resolve) => setTimeout(resolve, randomTime));
		promiseList = [...promiseList, promise];
	}

	return promiseList;
}

function createListElement() {
	const li = document.createElement('li');
	li.innerText = createNumberList();
	ul.appendChild(li);
}

function generateList() {
	Promise.allSettled(createPromiseList(3, 3000, 1000)).then(() =>
		createListElement()
	);
}
