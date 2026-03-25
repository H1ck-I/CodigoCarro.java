public class carro{
private boolean ligado= false;
private int velocidade = 0;
private int marcha = 0;

public boolean ligar(){
if(!ligado){
    ligado = true;
    System.out.println("O carro foi ligado!\n");
    return true;
}
else{
    System.out.println("O carro já está ligado!");
    return false;
}
}


public boolean desligar(){

if(ligado && velocidade ==0 && marcha ==0){
    ligado = false;
    System.out.println("O carro foi desligado!");
    return true;
}
else{
    System.out.println("O carro não pode ser desligado ou já está desligado. ");
    return false;
}
}

public boolean acelerar(){

if(!ligado){
    System.out.println("O carro está desligado!");
    return false;
}
if(marcha ==0){
    System.out.println("O carro está em ponto morto, não pode acelerar!");
    return false;
}
if (velocidade >= 120){
    System.out.println("Limite de velocidade atingido!");
    return false;
}
if (limiteMarcha (velocidade+1)){
    velocidade++;
    return true;
}
else{
    System.out.println("velocidade não permitida para essa marcha!");
    return false;
}
}

public boolean diminuirVelocidade(){
   if(!ligado){
    System.out.println("O carro está desligado!");
    return false;
   } 
   if(marcha ==0){
    System.out.println("O carro está em ponto morto, não pode reduzir!");
    return false;
}
if (velocidade ==0){
    System.out.println("Não é possivel reduzir pois o carro ja esta parado!");
    return false;
}
if (limiteMarcha (velocidade-1)){
    velocidade--;
    return true;
   }
   else{
    System.out.println("Reduza a marcha para poder reduzir a velocidade!");
    return false;
   }
 }
public boolean limiteMarcha(int velocidadeTeste){

    switch(marcha){

        case 0:
                System.out.println("O carro está em ponto morto, não pode acelerar!");
                return false;        
        
        case 1:
            if(velocidadeTeste <= 20 && velocidadeTeste >= 0){
                return true;
            }
            else{ 
                System.out.println("Velocidade não permitida para essa marcha!");
                return false;
            }
        
        case 2: 
            if ( velocidadeTeste >= 21 && velocidadeTeste <=40){
                return true;
            }
            else{
                System.out.println("Velocidade não permitida para essa marcha!");
                return false;
            }
        case 3:
            if( velocidadeTeste >=41 && velocidadeTeste <=60){
                return true;
            }
            else{
                System.out.println("Velocidade não permitida para essa marcha!");
                return false;
            }
        case 4:
            if(velocidadeTeste >=61 && velocidadeTeste <=80){
                return true;
            }
            else{
                System.out.println("velocidade não permitida para essa marcha!");
                return false;
            }
        case 5:
            if(velocidadeTeste >=81 && velocidadeTeste <=100){
                return true;
            }
            else{
                System.out.println("velocidade não permitida para essa marcha!");
                return false;
            }
        case 6:
            if(velocidadeTeste >=101 && velocidadeTeste <=120){
                return true;
            }
            else{
                System.out.println("velocidade não permitida para essa marcha!");
                return false;
            }
            
        }        
    return false;
}

public boolean virarDireita(){
    
    if(!ligado){
        System.out.println("O carro está desligado!");
        return false;
    }
    if(velocidade >=1 && velocidade <=40){
        System.out.println("Virando a direita!");
        return true;
    }
    else{
        System.out.println("Velocidade não permitida!");
        return false;
    }
}

public boolean virarEsquerda(){
    
    if(!ligado){
        System.out.println("O carro está desligado!");
        return false;
    }
    if(velocidade >=1 && velocidade <=40){
        System.out.println("Virando a esquerda!");
        return true;
    }
    else{
        System.out.println("Velocidade não permitida!");
        return false;
    }
}

public int verificarVelocidade(){

    if(!ligado){
        System.out.println("O carro está desligado!");
    }
    else{
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Marcha: " + marcha);
    }
    return velocidade;
    
}
public boolean subirMarcha(){

    if(!ligado){
        System.out.println("O carro está desligado!");
        return false;
    }

    if(marcha == 6){
        System.out.println("O carro já está na marcha máxima!");
        return false;
    }
        marcha++;
        System.out.println("Marcha atual: " + marcha);
        return true;

}

public boolean descerMarcha(){

    if(!ligado){
        System.out.println("O carro está desligado!");
        return false;
    }

    if(marcha == 0){
        System.out.println("O carro já está em ponto morto!");
        return false;
    }

    marcha--;
    System.out.println("Marcha atual: " + marcha);
    return true;
}
}
