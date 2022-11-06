class Carro{
    String marca, modelo;
    Proprietario proprietario;
    Placa placa;
    Motor motor;

    Carro(String marca, String modelo, Proprietario proprietario, Placa placa, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.proprietario = proprietario;
        this.placa = placa;
        this.motor = motor;
    }
    String getDescricao(){
        return "Carro "+this.marca+"/"+this.modelo+". "+proprietario.getDescricao()+" "+placa.getDescricao()+" "+motor.getDescricao();
    }
}