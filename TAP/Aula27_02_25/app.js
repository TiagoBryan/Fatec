const express = require('express')
const app = express()


app.get("/", function(req, res){
    res.send("Hello world")
})

app.listen(8081, function(){
    console.log("Server is running on port 8081")
}) 
