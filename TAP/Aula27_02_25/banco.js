const Sequelize = require("sequelize")
const sequelize = new Sequelize('exemple','root','', {
    host: 'localhost',
    dialect: 'mysql',
})

sequelize.authenticate().then(function(){
    console.log("Conectado com sucesso")
}).catch(function(erro){
    console.log("Falha ao se conectar" + erro)
})

const Agendamentos = sequelize.define('agendamentos',{
    nome:{
        type: Sequelize.STRING
    },
    email:{
        type: Sequelize.STRING
    },
    telefone:{
        type: Sequelize.STRING
    },
    cpf:{
        type: Sequelize.STRING
    },
    data:{
        type: Sequelize.STRING
    },
    hora:{
        type: Sequelize.STRING
    },
})

//Agendamentos.sync({force: true})

Agendamentos.create({
    nome: 'Tiago Oliveira',
    email: 'tiago.oliveira@fatec.sp.gov.br',
    telefone: '11930267434',
    cpf: '23746234432',
    data: '2020-12-21',
    hora: '10:00'
})
