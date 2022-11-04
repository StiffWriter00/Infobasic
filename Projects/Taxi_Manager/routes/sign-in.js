var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('sign-in', { title: 'Taxi Manager - Sign in' });
});

router.post('/post', function(req, res, next) {
    const email = req.body.email;
    const password = req.body.password;
    if(email == "ale@test.com" && password == "test") {
      res.render('home');
    } else {
      res.render('sign-in', {error: "Si sbajat cujò"});
    }
});
module.exports = router;