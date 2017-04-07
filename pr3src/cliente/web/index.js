function miFuncion(te1,hu1,te2,hu2){
  if(te1!=''){
    var t1 = parseInt(te1);
    var mensaje='T'+t1;
    console.log(mensaje)
    const ws = new WebSocket('ws://localhost:61614', 'stomp');
    ws.onopen = () => {
      ws.send('CONNECT\n\n\0');
      ws.send('SEND\ndestination:/topic/ClientToInv1\n\n'+mensaje+'\0');
      ws.send('DISCONNECT\n\n\0');
    };
  }

  if(hu1!=''){
    var h1 = parseInt(hu1);
    var mensaje='H'+h1;
    console.log(mensaje)
    const ws = new WebSocket('ws://localhost:61614', 'stomp');
    ws.onopen = () => {
      ws.send('CONNECT\n\n\0');
      ws.send('SEND\ndestination:/topic/ClientToInv1\n\n'+mensaje+'\0');
      ws.send('DISCONNECT\n\n\0');
    };
  }

  if(te2!=''){
    var t2 = parseInt(te2);
    var mensaje='T'+t2;
    console.log(mensaje)
    const ws = new WebSocket('ws://localhost:61614', 'stomp');
    ws.onopen = () => {
      ws.send('CONNECT\n\n\0');
      ws.send('SEND\ndestination:/topic/ClientToInv2\n\n'+mensaje+'\0');
      ws.send('DISCONNECT\n\n\0');
    };
  }

  if(hu2!=''){
    var h2 = parseInt(hu2);
    var mensaje='H'+h2;
    console.log(mensaje)
    const ws = new WebSocket('ws://localhost:61614', 'stomp');
    ws.onopen = () => {
      ws.send('CONNECT\n\n\0');
      ws.send('SEND\ndestination:/topic/ClientToInv2\n\n'+mensaje+'\0');
      ws.send('DISCONNECT\n\n\0');
    };
  }
}
