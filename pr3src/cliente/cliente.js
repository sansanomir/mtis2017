var express = require('express');
var app = express();
app.use('/web', express.static('web'));
app.set('view engine', 'html');
app.engine('html', require('hbs').__express);

var request = require('request');
app.get('/index', function(pet, resp) {
	console.log("index.html")
	resp.render('index');
});

app.listen(4000, function(){
	console.log("Web Express en el puerto");
});

const stompitSend = require('stompit');
const stompitReceive = require('stompit');
const stompitReceive2 = require('stompit')

var tMax=10;
var hMax=10;

stompitReceive.connect({host: 'localhost', port: 61613 }, (err, client) => {
  client.subscribe({destination: '/topic/Inv1ToClient' }, (err, msg) => {
      msg.readString('UTF-8', (err, body) => {
          procesarMensaje(body);
          //client.disconnect();
        });
    });
});

stompitReceive.connect({host: 'localhost', port: 61613 }, (err, client) => {
    client.subscribe({ destination: '/topic/Inv2ToClient' }, (err, msg) => {
        msg.readString('UTF-8', (err, body) => {
            procesarMensaje(body);
            //client.disconnect();
          });
      });
  });

function procesarMensaje(body){
  var numeroInv = body[1];
  var tActual = body.substring(3,body.indexOf('?'));
  var hActual = body.substring(body.indexOf('?')+4,body.length+1);
  console.log('Invernadero: '+ numeroInv);
  console.log('T= '+ tActual);
  console.log('Hu= '+ hActual);
  console.log('');

  if(tActual >= tMax){
    actualizarValor(numeroInv,'Temperatura');
  }
  if(hActual >= hMax){
    actualizarValor(numeroInv,'Humedad');
  }

}

function actualizarValor(numeroInv,mecanismo){
  stompitSend.connect({ host: 'localhost', port: 61613 }, (err, client) => {
    console.log('Inv to Cli');
    const frame = client.send({ destination: '/topic/ClientToInv'+numeroInv });
    frame.write(mecanismo[0]+1);
    frame.end();
    client.disconnect();
  });
}
