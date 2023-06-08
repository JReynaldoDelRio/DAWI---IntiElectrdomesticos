function openDialog() {
	document.getElementById('register-dialog').showModal();
}

function closeDialog() {
	document.getElementById('register-dialog').close();
}

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
		Swal.fire('¡Registro correcto!', '', 'success');
	}
	return isValid;
	
}
function confirmAction(id) {
  Swal.fire({
    title: 'Confirmar eliminación',
    text: '¿Estás seguro de que deseas eliminar este elemento?',
    icon: 'warning',
    showCancelButton: true,
    confirmButtonColor: '#3085d6',
    cancelButtonColor: '#d33',
    confirmButtonText: 'Sí, eliminar',
    cancelButtonText: 'Cancelar'
  }).then((result) => {
    if (result.isConfirmed) {
      axios.delete(`/eliminar/${id}`)
        .then(() => {
          Swal.fire('Eliminado', 'El elemento ha sido eliminado correctamente', 'success')
            .then(() => {
              window.location.href = '/producto/listado';
            });
        })
        .catch((error) => {
          Swal.fire('Error', 'Ocurrió un error al eliminar el elemento', 'error');
          console.error(error);
        });
    }
  });
}