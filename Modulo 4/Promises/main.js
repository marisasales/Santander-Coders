const ul = document.querySelector('ul');

function createNumberList(number, max, min) {
	const randomLength = Math.floor(Math.random() * (max - min) + min);
	const randomNumber = () => Math.floor(Math.random() * number);

	return Array.from({ length: randomLength }, randomNumber);
}

function createPromiseList(number, max, min) {
	let promiseList = [];

	for (let i = 0; i < number; i++) {
		const randomTime = Math.floor(Math.random() * (max - min) + min);
		let promise = new Promise((resolve) =>
			setTimeout(resolve, randomTime, createNumberList(10, 5, 2))
		);

		promiseList = [...promiseList, promise];
	}

	console.log(promiseList); // Just to check if the array is correct
	return promiseList;
}

function createListElement(result) {
	const li = document.createElement('li');
	li.innerText = result;
	ul.appendChild(li);
}

function generateList() {
	Promise.allSettled(createPromiseList(3, 3000, 1000)).then((results) => {
		let concatResults = [];

		results.forEach((result) => {
			if (result.status === 'fulfilled') {
				concatResults = [...concatResults, result.value];
			}
		});

		createListElement(concatResults);
	});
}

function clearLists() {
	while (ul.firstChild) {
		ul.removeChild(ul.firstChild);
	}
}
