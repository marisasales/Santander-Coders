const calculator = (() => {
	const _add = (x, y) => x + y;
	const _subtract = (x, y) => x - y;
	const _multiply = (x, y) => x * y;
	const _divide = (x, y) => x / y;
	const _remainder = (x, y) => x % y;
	const _exponent = (x, y) => x ** y;

	const _operators = {
		'+': _add,
		'-': _subtract,
		'*': _multiply,
		'/': _divide,
		'%': _remainder,
		'**': _exponent,
	};

	let _entries = [];
	let _equalsList = new Map();

	const enter = (value) => {
		if (isNaN(value) || value === '0') {
			return 'Invalid Entry!';
		}
		_entries = [..._entries, value];
	};

	const equals = (operator) => {
		const [x, y] = _entries;
		const _calcResult = _operators[operator](x, y);

		_equalsList.set(_entries.join(operator), _calcResult);
		_entries = [];

		return _calcResult;
	};

	const list = () => _equalsList;
	const reset = () => _equalsList = new Map();

	return {
		enter,
		equals,
		list,
		reset,
	};
})();