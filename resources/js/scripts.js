			function msg() {
			    var text = document.getElementById("textbox").value;
			    alert(text);
			}

			function operacion() {
			    var operacion;
			    if (document.getElementById("seleccion").value == 'suma') {
			        operacion = Number(document.getElementById("numero1").value) + Number(document.getElementById("numero2").value);
			    } else if (document.getElementById("seleccion").value == 'resta') {
			        operacion = Number(document.getElementById("numero1").value) - Number(document.getElementById("numero2").value);
			    } else if (document.getElementById("seleccion").value == 'multiplicacion') {
			        operacion = Number(document.getElementById("numero1").value) * Number(document.getElementById("numero2").value);
			    } else {
			        operacion = Number(document.getElementById("numero1").value) / Number(document.getElementById("numero2").value);
			    }
			    alert(operacion);
			}