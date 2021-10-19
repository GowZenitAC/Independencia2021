package armando.alpuche.independencia2021;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Independencia3 extends Activity {
    public static Activity In3;
    private RadioButton rb1;
    public int total2=0;
    public int total3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        In3=this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.independencia3);
        rb1=(RadioButton)findViewById(R.id.radio2);
        Bundle extras = getIntent().getExtras();
        if(extras !=null)
        {
            total2 = (Integer) extras.get("Resultados");
        }
    }
    public void independencia4 (View v) {
        if (rb1.isChecked() == true){
            total3 = total2 + 1;
        }
        Intent i=new Intent(this, Independencia4.class);
        i.putExtra("Resultados3",total3);
        startActivity(i);
    }
}
