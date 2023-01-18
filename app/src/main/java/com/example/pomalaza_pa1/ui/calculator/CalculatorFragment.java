package com.example.pomalaza_pa1.ui.calculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pomalaza_pa1.R;
import com.example.pomalaza_pa1.databinding.FragmentCalculatorBinding;
import com.example.pomalaza_pa1.databinding.FragmentGalleryBinding;
import com.example.pomalaza_pa1.ui.gallery.GalleryViewModel;

public class CalculatorFragment extends Fragment {

    private FragmentCalculatorBinding binding;
      @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
          CalculatorViewModel calculatorViewModel =
                  new ViewModelProvider(this).get(CalculatorViewModel.class);

          binding = FragmentCalculatorBinding.inflate(inflater, container, false);
          View root = binding.getRoot();

          final EditText primerlado = binding.etPrimerlado;
          final EditText segundolado = binding.etSegundolado;
          final EditText base = binding.etBase;
          final EditText altura = binding.etAltura;
          final TextView result = binding.tvResult;
          final Button calcular = binding.btnCalcular;
          altura.setText("0");
          calcular.setOnClickListener(x->{


          float area =  calculatorViewModel.calcularArea(
                      Float.parseFloat(primerlado.getText().toString()),
                      Float.parseFloat(segundolado.getText().toString()),
                      Float.parseFloat(base.getText().toString()),
                      Float.parseFloat(altura.getText().toString()));
          result.setText("el resultado es:"+ area);


          });

          return root;

    }
}