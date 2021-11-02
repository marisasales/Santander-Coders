const form = document.querySelector('form');

let total = 0;

function changeTotal(total) {
	const inputTotal = document.querySelector('#total');
	inputTotal.value = total;
}

function enterButton() {
	const inputNumber = document.querySelector('#number');
	calculator.enter(Number(inputNumber.value));
	inputNumber.value = '';
}

function equalsButton() {
	const operator = document.querySelector('option:checked').value;
	changeTotal(calculator.equals(operator));
}

function createHistory() {
	const ul = document.createElement('ul');

	Array.from(calculator.list()).forEach((item) => {
		const li = document.createElement('li');

		li.textContent = item
			.toString()
			.replace(',', ' = ')
			.replace('/', '÷')
			.replace('*', '×');

		ul.appendChild(li);
	});

	return ul;
}

function listButton() {
	Swal.fire({
		title: 'Histórico',
		html: createHistory(),
		showCloseButton: true,
		focusConfirm: false,
		confirmButtonColor: '#1e90ff',
	});
}

function clearHistory() {
	Swal.fire({
		title: 'Tem certeza?',
		text: 'Você não poderá reverter essa ação!',
		icon: 'warning',
		showCancelButton: true,
		confirmButtonColor: '#1e90ff',
		cancelButtonColor: '#d33',
		cancelButtonText: 'Cancelar',
		confirmButtonText: 'Sim, tenho certeza',
	}).then((result) => {
		if (result.isConfirmed) {
			calculator.reset();
			Swal.fire({
				title: 'Feito',
				text: 'Todo o histórico foi excluído!',
				icon: 'success',
				confirmButtonColor: '#1e90ff',
			});
		}
	});
}
