package com.senaigo.mobile.atividade01_pedido;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PedidoAdapter extends AppCompatActivity {

    protected List<HashMap<String, String>> colecao = new ArrayList<>();

    protected EditText txtCliente;
    protected EditText txtData;
    protected EditText txtValor;
    protected List<Pedido> lista = new ArrayList<>();
    protected ListView listaView;
    protected Pedido pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void adicionar(View view){

        txtCliente = findViewById(R.id.txtCliente);
        txtData = findViewById(R.id.txtData);
        txtValor = findViewById(R.id.txtValor);

        String cliente, data, valor;

        cliente = txtCliente.getText().toString();
        data = txtData.getText().toString();
        valor = txtValor.getText().toString();
        pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setData(data);
        pedido.setValor(valor);


        HashMap<String, String> listaMap = new HashMap<>();
        listaMap.put("labelClienteList", pedido.getCliente());
        listaMap.put("labelDataList", pedido.getData());
        listaMap.put("labelValorList", pedido.getValor());

        colecao.add(listaMap);

//        lista.add(pedido);

        String[] de = {"labelClienteList", "labelDataList", "labelValorList"};
        int[] para = {R.id.labelClienteList, R.id.labelDataList, R.id.labelValorList};

        listaView = findViewById(R.id.lista);

        SimpleAdapter adapter = new SimpleAdapter(this, colecao, R.layout.item_listview, de, para);

        listaView.setAdapter(adapter);

    }
}
