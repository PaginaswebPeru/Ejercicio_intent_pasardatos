package paginasweb.pe.ejemplo_pasardatos_intent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Activity_bienvenidos extends Activity {
	
	String usuario,pass;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bienvenidos);
		
		Bundle extra=getIntent().getExtras();
		usuario = extra.getString("usu");
		pass = extra.getString("clave");
		
		Toast.makeText(getApplicationContext(), "Binvenido señor: " + usuario + " ,su clave es: " + pass, Toast.LENGTH_SHORT).show();
		
	}
}
