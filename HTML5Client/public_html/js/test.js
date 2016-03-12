(function ($) {
    // Hace referencia al boton con id = find
    $('#find').click(function (e) {
        e.preventDefault();
        $.ajax('http://localhost:8084/RestEasyPrueba/rest/product/getAllproducts')
        .done(function (data) {
            for(var idx in data) {
                for (var idy in data[idx]) {
                    alert(idx + ' >> ' + data [idx][idy]);
                }
            }
        })
        .fail(function (err) {
            alert('Error buscando');
        });
    });
    // Hace referencia al boton con id = findcode
    $('#findcode').click(function (e) {
        e.preventDefault();
        $.ajax('http://localhost:8084/RestEasyPrueba/rest/product/getProduct', {data:'code=10'})
        .done(function (data) {
            for(var idx in data) {
                alert(idx + ' >> ' + data [idx]);
            }
        })
        .fail(function (err) {
            alert('Error buscando');
        });
    });
    // Hace referencia al boton con id = updatecode
    $('#updatecode').click(function (e) {
        e.preventDefault();
        $.ajax('http://localhost:8084/RestEasyPrueba/rest/product/updateProduc', {
          type : "PUT",
          contentType : "application/json",
          data : '{"code":"10","name":"Rocas","cost":100}'
        })
        .done(function (data) {
            alert("Update exitoso");
        })
        .fail(function (err) {
            alert('Error buscando');
        });
    });
    
    
} (jQuery));