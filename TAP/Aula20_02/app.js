const express = require("express")
const app = express()

app.get("/", function(req, res){
    res.sendFile(__dirname + "/html/index.html")
})

app.get("/contato", function(req, res){
    res.send("Pagina de contato aaaaaaaaaaaaa")
})

app.get("/produtos/:item/:qtd", function(req, res){
    res.send("Item: " + req.params.item + " Quantidade: " + req.params.qtd)
})


app.listen(8081, function(){
    console.log("Servidor Iniciado")
})