
function registerProduct() {
	var isValid = true;

	var name = document.getElementById('name');
	var brand = document.getElementById('brand');
	var stock = document.getElementById('stock');
	var price = document.getElementById('price');

	var nameError = document.getElementById('nameError');
	var brandError = document.getElementById('brandError');
	var stockError = document.getElementById('stockError');
	var priceError = document.getElementById('priceError');

	if (name.value == -1) {
		nameError.textContent = 'Seleccione una opción válida';
		isValid = false;
		event.preventDefault();
	} else {
		nameError.textContent = '';
	}

	if (brand.value == -1) {
		brandError.textContent = 'Seleccione una opción válida';
		isValid = false;
		event.preventDefault();
	} else {
		brandError.textContent = '';
	}

	var stockInput = document.getElementById('stock');
	var stockValue = parseFloat(stockInput.value);
	if (stockValue <= 0) {
		isValid = false;
		stockInput.classList.add('error');
		// Mostrar mensaje de error específico para el stock
		var stockError = document.getElementById('stockError');
		stockError.textContent = 'El stock debe ser mayor a 0';

	} else {
		stockInput.classList.remove('error');
		var stockError = document.getElementById('stockError');
		stockError.style.display = 'none';
	}

	var priceInput = document.getElementById('price');
	var priceValue = parseFloat(priceInput.value);
	if (priceValue <= 0) {
		isValid = false;
		priceInput.classList.add('error');
		// Mostrar mensaje de error específico para el precio
		var priceError = document.getElementById('priceError');
		priceError.textContent = 'Ingrese un precio valido';
		priceError.style.display = 'block';
	} else {
		priceInput.classList.remove('error');
		var priceError = document.getElementById('priceError');
		priceError.style.display = 'none';
	}

	if (isValid) {
		alert("Registro correcto")
	}
	return isValid;

}

/*Metodo para la paginacion*/

// Obtener la referencia a la tabla y los botones de paginación
var table = document.getElementById('id_table');
var prevBtn = document.getElementById('prevBtn');
var nextBtn = document.getElementById('nextBtn');
var currentPageElement = document.getElementById('currentPage');

// Definir el número de filas por página y la página actual
var rowsPerPage = 10;
var currentPage = 1;

// Calcular el número total de páginas
var totalRows = table.tBodies[0].rows.length;
var totalPages = Math.ceil(totalRows / rowsPerPage);

// Función para mostrar las filas correspondientes a la página actual
function showPage(page) {
	// Calcular el rango de filas a mostrar
	var startIndex = (page - 1) * rowsPerPage;
	var endIndex = startIndex + rowsPerPage;

	// Ocultar todas las filas de la tabla
	for (var i = 0; i < totalRows; i++) {
		var row = table.tBodies[0].rows[i];
		row.style.display = 'none';
	}

	// Mostrar las filas correspondientes a la página actual
	for (var j = startIndex; j < endIndex && j < totalRows; j++) {
		var row = table.tBodies[0].rows[j];
		row.style.display = '';
	}

	// Actualizar el número de página actual en el elemento correspondiente
	currentPageElement.textContent = 'Página ' + page + ' de ' + totalPages;
}

// Función para ir a la página anterior
function goToPrevPage() {
	if (currentPage > 1) {
		currentPage--;
		showPage(currentPage);
	}
}

// Función para ir a la página siguiente
function goToNextPage() {
	if (currentPage < totalPages) {
		currentPage++;
		showPage(currentPage);
	}
}

// Mostrar la primera página al cargar la página
showPage(currentPage);

// Agregar los controladores de eventos a los botones de paginación
prevBtn.addEventListener('click', goToPrevPage);
nextBtn.addEventListener('click', goToNextPage);

function confirmarEliminacion() {
	if (confirm("¿Estás seguro de que deseas eliminar este producto?")) {
		alert("Producto eliminado")
		return true;
	} else {
		return false;
	}
}
function confirmarEliminacion() {
	if (confirm("¿Estás seguro de que deseas eliminar este producto?")) {
		alert("Producto eliminado")
		return true;
	} else {
		return false;
	}
}
