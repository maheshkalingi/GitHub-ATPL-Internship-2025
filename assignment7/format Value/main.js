function formatValue(value) {
    if (typeof value === 'string') {
        return value.toUpperCase();
    }
    else if (typeof value === 'number') {
        return value * 2;
    }
    else {
        throw new Error('Input must be a string or a number.');
    }
}
var result = formatValue(10);
document.getElementById('output').textContent = result.toString();
