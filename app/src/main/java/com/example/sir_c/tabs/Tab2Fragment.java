package com.example.sir_c.tabs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Tab2Fragment extends Fragment {

    EditText editText;
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        final View view = inflater.inflate(R.layout.fragment_tab2, container, false);
        if (view!=null){
            editText = (EditText) view.findViewById(R.id.edtNumero);
            button = (Button)view.findViewById(R.id.btnToast);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String strMensaje ="";
                    if (!editText.getText().toString().isEmpty()){
                        strMensaje = editText.getText().toString();
                    } else{
                        strMensaje = "Cadena vacia";
                    }
                    Toast.makeText(getContext(), strMensaje, Toast.LENGTH_SHORT).show();
                }
            });
        }
        return view;

    }

}
