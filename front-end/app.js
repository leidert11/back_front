


// customer

// 1

document.querySelector('#botonBuscar').addEventListener('click', function() {
    var nombreProducto = document.querySelector('#nombreProducto').value;
    var token = sessionStorage.getItem('jwtToken');
    fetch('http://localhost:8080/productos/filtrar?nombre=' + nombreProducto, {
        headers: {
            'Authorization': `Bearer ${token}`
        }
    })
    .then(response => {
        if (!response.ok) {
            return response.text().then(text => { throw new Error(text) });
        }
        return response.json();
    })
    .then(data => {
        var resultadosBusqueda = document.querySelector('.info-data');
        resultadosBusqueda.innerHTML = '';
        data.forEach(function(producto) {
          var productoDiv = document.createElement('div');
          productoDiv.classList.add('card');
          productoDiv.innerHTML = `
            <div class="head">
                <div class="content-api">
                    <h5>${producto.nombre}</h5>
                    <p>${producto.descripcion}</p>
                    <p>${producto.precio}</p>
                </div>
            </div>
          `;
          resultadosBusqueda.appendChild(productoDiv);
        });
    })
    .catch(error => console.error('Error:', error));
});

