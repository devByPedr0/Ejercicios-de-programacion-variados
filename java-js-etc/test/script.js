// archivo: script.js

// Selecciona el input donde se muestra la operación
let display = document.getElementById('display');

// Agrega el valor del botón al display
function appendValue(value) {
  display.value += value;
}

// Limpia el display
function clearDisplay() {
  display.value = '';
}

// Calcula el resultado usando eval
function calculate() {
  try {
    display.value = eval(display.value);
  } catch {
    display.value = 'Error';
  }
}