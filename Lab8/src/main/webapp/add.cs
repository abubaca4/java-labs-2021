* {
    box-sizing: border-box;
}

a {
    text-decoration: none;
}

.navbar {
    justify-content: center;
    align-items: center;
    width: 100%;
    height: 7vh;
    background-color: whitesmoke;
    border-bottom: 1px solid black;
}

.navbar-main {
    text-align: left;
    padding-left: 2%;
    padding-top: 5px;
    height: 100%;
}

.navbar-main a {
    font-size: large;
    color: black;
    text-decoration: none;
}

.navbar-main a:hover {
    text-decoration: underline;
}

body {
  background-color: whitesmoke;
  font-family: 'Niramit', sans-serif;
}

.ui-form {
  max-width: 350px;
  padding: 80px 30px 30px;
  margin: 50px auto 30px;
  background: white;
}

.ui-form h3 {
  position: relative;
  z-index: 5;
  margin: 0 0 60px;
  text-align: center;
  color: black;
  font-size: 30px;
  font-weight: normal;
}

.form-row {
  position: relative;
  margin-bottom: 40px;
}

.form-row input {
  display: block;
  width: 100%;
  padding: 0 10px;
  line-height: 40px;
  font-family: 'Niramit', sans-serif;
  background: none;
  border-width: 0;
  border-bottom: 2px solid black;
  transition: all 0.2s ease;
}

.form-row label {
  position: absolute;
  left: 13px;
  color: #9d959d;
  font-size: 20px;
  font-weight: 300;
  transform: translateY(-35px);
  transition: all 0.2s ease;
}

.form-row input:focus {
  outline: 0;
  border-color: #F77A52;
}

.form-row input:focus + label, 
.form-row input:valid + label {
  transform: translateY(-60px);
  margin-left: -14px;
  font-size: 14px;
  font-weight: 400;
  outline: 0;
  border-color: #F77A52;
  color: #F77A52;
}

.ui-form input[type="submit"] {
  width: 100%;
  padding: 0;
  line-height: 42px;
  background: black;
  border-width: 0;
  color: white;
  font-size: 20px;
}

.ui-form p {
  margin: 0;
  padding-top: 10px;
}

input:hover, label:hover {
    cursor: pointer;
}

input:focus {
    cursor: text;
}