package paginasweb.pe.ejemplo_pasardatos_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText txtusu, txtclave;
	Button btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txtusu = (EditText) findViewById(R.id.txtUsu);
		txtclave = (EditText) findViewById(R.id.txtClave);
		btn = (Button) findViewById(R.id.btnLogin);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(txtusu.getText().toString().equals("") || txtclave.getText().toString().equals("") ){
					Toast.makeText(getApplicationContext(), "Ingrese usuario", Toast.LENGTH_SHORT).show();
				}
				else{
					if(txtusu.getText().toString().equals("paginasweb") && txtclave.getText().toString().equals("peru") ){
						
						Intent pasar =new Intent(getApplicationContext(),Activity_bienvenidos.class);
						pasar.putExtra("usu", txtusu.getText().toString());
						pasar.putExtra("clave", txtclave.getText().toString());
						startActivity(pasar);
					}
					else{
						Toast.makeText(getApplicationContext(), "Error, Verifique usuario y clave", Toast.LENGTH_SHORT).show();
					}
				}
			}
		});
	}

}
