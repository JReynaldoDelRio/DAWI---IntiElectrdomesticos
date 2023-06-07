function openDialog() {
    document.getElementById('register-dialog').showModal();
  }
  
  function closeDialog() {
    document.getElementById('register-dialog').close();
  }
  
  function registerProduct() {
    // Obtener los valores ingresados en el formulario
    var name = document.getElementById('name').value;
    var brand = document.getElementById('brand').value;
    var stock = document.getElementById('stock').value;
    var price = document.getElementById('price').value;
  
    // Aquí puedes realizar la lógica para registrar el producto, por ejemplo, agregar una nueva fila a la tabla
  
    // Cerrar el diálogo después de registrar
    closeDialog();
}