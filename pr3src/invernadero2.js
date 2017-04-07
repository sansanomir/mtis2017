const stompitSend = require('stompit');
const stompitReceive = require('stompit');

var temperatura=1
var humedad=1;
var stopT=100;
var stopH=100;

stompitReceive.connect({ host: 'localhost', port: 61613 }, (err, client) => {
      client.subscribe({ destination: '/topic/ClientToInv2' }, (err, msg) => {
          msg.readString('UTF-8', (err, body) => {
            if(body[0] == 'T'){
              stopT = body.substring(1,body.length);
            }
            else if(body[0] == 'H'){
              stopH = body.substring(1,body.length);
            }
            else{
              console.log('Mensaje desconocido');
            }
            //client.disconnect();
            });
        });
});

setInterval(intervalFunc, 5000);
function intervalFunc () {
  stompitSend.connect({ host: 'localhost', port: 61613 }, (err, client) => {
    const frame = client.send({ destination: '/topic/Inv2ToClient' })
    if(temperatura > stopT){
      temperatura -= 1;
      console.log('Bajando la temperatura del Invernadero 2 t= '+temperatura);
      frame.write('T2='+temperatura);
      frame.write('?H2='+humedad);
    }

    if(humedad > stopH){
      humedad -= 1;
      console.log('Bajando la humedad del Invernadero 2 h= '+humedad);
      frame.write('T2='+temperatura);
      frame.write('?H2='+humedad);
    }
    if(temperatura <= stopT && humedad <= stopH){
      stopT = 100;
      stopH = 100;
      console.log('Envío valores del Invernadero 2 a Cliente: t='+temperatura+' h='+humedad);
      frame.write('T2='+temperatura);
      frame.write('?H2='+humedad);
      temperatura += 1;
      humedad += 1;
    }
    frame.end();
    client.disconnect();
  });
}
