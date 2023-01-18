package com.example.pomalaza_pa1.ui.calculator;

import androidx.lifecycle.ViewModel;

public class CalculatorViewModel extends ViewModel {

    public CalculatorViewModel() {


    }

    public float calcularAltura (float primerLado, float segundoLado, float base){

        float altura = 0;


        if (primerLado==segundoLado && segundoLado==base){

            altura= (float)Math.sqrt (Math.pow(primerLado,2)-Math.pow((double)(base/2),2));
        }

        if (primerLado==segundoLado && segundoLado!=base && primerLado!=base){

            altura= (float)Math.sqrt (Math.pow(primerLado,2)-Math.pow(base,2)/4);
        }




        return altura;

    }
    public float calcularArea (float primerLado, float segundoLado, float base, float altura){

        float result = 0;

            if(primerLado!=segundoLado && primerLado!=base && segundoLado!=base)

            {
                    result=base*altura/2;

            }
            else {
                            result= calcularAltura( primerLado,  segundoLado,  base)*base/2;
                 }

        return result;

    }


}
