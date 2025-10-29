const express = require('express');
const bodyParser = require('body-parser');
const cookieParser = require('cookie-parser');
const csrf = require('csurf');
const fs = require('fs'); 
const path = require('path'); 
const csrfProtection = csrf({ cookie: true });
const app = express();
const port = 8000;

app.use(bodyParser.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(csrfProtection);
const usuariosDB = [];

app.get('/usuarios/create', (req, res) => {
  fs.readFile(path.join(__dirname, 'index.html'), 'utf8', (err, htmlData) => {
    if (err) {
      console.error('Error al leer el archivo HTML:', err);
      return res.status(500).send('Error interno del servidor.');
    }

    const htmlConToken = htmlData.replace('__CSRF_TOKEN_PLACEHOLDER__', req.csrfToken());

    res.send(htmlConToken);
  });
});

app.post('/usuarios', (req, res) => {
  const { nombre, apellido, email, sexo, _token } = req.body;
  
  const nuevoUsuario = { nombre, apellido, email, sexo };
  usuariosDB.push(nuevoUsuario);
  
  console.log('Usuario registrado:', nuevoUsuario);
  console.log('Total de usuarios:', usuariosDB.length);
  
  res.send('¡Registro exitoso!');
});

app.use((err, req, res, next) => {
  if (err.code !== 'EBADCSRFTOKEN') return next(err);
  res.status(403).send('Token CSRF inválido.');
});

app.listen(port, () => {
  console.log(`Servidor corriendo en http://127.0.0.1:${port}/usuarios/create`);
});