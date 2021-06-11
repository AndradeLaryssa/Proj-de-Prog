package com.example.prova.model;

public class Imc {
	
	private float peso;
	private float altura;
	private float imc;
	private String resultado;
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getImc() {
		return imc;
	}
	public void setImc(float imc) {
		this.imc = imc;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public Imc(float altura, float peso) {
        this.imc = peso / (altura * altura);
    }

    public String getResultado() {
        if(imc < 18.5) {
            this.resultado = "IMC: "+ imc +" .Abaixo do peso, risco de sáude elevado!";
        }else if(imc >= 18.5 && imc < 25) {
            this.resultado = "IMC: "+ imc +" .Peso ideal, risco de saúde inexistente!";
        }else if(imc >= 25 && imc < 30) {
            this.resultado = "IMC: "+ imc +" .Excesso de peso, risco de saúde elevado!";
        }else if(imc >= 30 && imc < 35) {
            this.resultado = "IMC: "+ imc +" .Obesidade grau 1, risco de saúde muito elevado!";
        }else if(imc >= 35 && imc < 40) {
            this.resultado = "IMC: "+ imc +" .Obesidade grau 2, risco de saúde muitíssimo elevado!";
        }else if(imc >= 40) {
            this.resultado = "IMC: "+ imc +" .Obesidade grau 3, risco de saúde obesidade mórbida!";
        }

        return resultado;
    }
	

}
