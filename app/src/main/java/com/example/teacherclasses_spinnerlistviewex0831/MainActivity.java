package com.example.teacherclasses_spinnerlistviewex0831;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {
    TextView tv1, tv2, tv3,tv4;
    Spinner spin;
    ListView lv;
    int helper;
    String[] classes = {"Choose a grade:", "chemistry", "biology", "physics", "cyber"};
    String[][] chemistry = {
            {"Dan", "Tom","Beatriz", "Gabriel", "Eric", "Fatima", "Hanna", "Ali", "Avner", "Ofer"},
            {"Alush", "Schechter", "Sabag", "Malul", "Sheetrit", "Shimoni", "Greenberg", "Habib", "Ora", "Anan"},
            {"07/03/2005", "12/06/2005", "11/07/2005", "13/02/2005", "29/11/2005", "30/09/2005", "12/05/2005", "04/04/2005", "11/08/2005", "31/08/2005"},
            {"0531457689", "0541237681","0541237681", "0531237681", "0546789435", "0509678812", "0521313134", "0528891223", "0513335411", "0521281681", "0526581681"}
    };
    String[][] biology = {
            {"Kfir", "Uzzi", "Shirli", "Orli", "Asaf", "Miron", "Amitai", "Ofira", "Yafa", "Merav"},
            {"Aliyah", "Yachin", "Eli", "Shira", "Tzofiya", "Raz", "Dori", "Almog", "Oz", "Navon"},
            {"11/03/2005", "15/06/2005", "21/07/2005", "23/02/2005", "19/11/2005", "10/09/2005", "17/05/2005", "06/04/2005", "14/08/2005", "02/08/2005", "03/11/2005"},
            {"0532257689", "0541239181", "0535237681", "0522789435", "0512378812", "0521345634", "0596131223","0523354511","0521277681", "0532981681"},
    };
    String[][] physics = {
            {"Amos","Ahava","Basya","Ariel","Gali","Shachar","Avram","Chanah","Anat","Sarit"},
            {"Levi", "Yedidya", "Rafael", "Ami", "Raanan", "Shiri", "Menachem", "Eliezer", "Shachar", "Yoni"},
            {"11/11/2005", "15/07/2005", "15/06/2005", "22/08/2005", "12/07/2005", "29/04/2005", "01/02/2005", "16/03/2005", "04/12/2005", "11/09/2005", "09/12/2005"},
            {"0533456789", "05429000681", "0514627181", "0546782635", "0501258812", "0521355134", "0528843223", "0513335811", "0521281671", "0526581682"},
    };
    String[][] cyber = {
            {"Hillel", "Yosef", "Dorit", "Shirli", "Adir", "Hadas", "Shir", "Orna", "Tamar", "Omer"},
            {"Shani", "Avishai", "Mordecai", "Yakov", "Itzhak", "Shalom", "Dalya", "Eliyahu", "Chaya", "Nitza"},
            {"07/05/2005", "12/01/2005", "12/06/2005", "09/02/2005", "29/11/2005", "12/11/2005", "01/01/2005", "22/04/2005", "11/06/2005", "02/07/2005"},
            {"0555457689", "0541674681", "0500037681", "0546780335", "0509678833", "0520203134", "0541135411","0595581681", "0520002312", "0523561223"},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        spin = (Spinner) findViewById(R.id.spin);
        lv = (ListView) findViewById(R.id.lv);

        spin.setOnItemSelectedListener(this);
        ArrayAdapter<String> adp1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,classes);
        spin.setAdapter(adp1);

        lv.setOnItemClickListener(this);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (helper == 1){
            tv1.setText("First Name:" + "\n" + chemistry[0][position]);
            tv2.setText("Last Name:" + "\n" + chemistry[1][position]);
            tv3.setText("Date of birth:" + "\n" + chemistry[2][position]);
            tv4.setText("Phone Number:" + "\n" + chemistry[3][position]);
        }
        else if (helper == 2){
            tv1.setText("First Name:" + "\n" + biology[0][position]);
            tv2.setText("Last Name:" + "\n" + biology[1][position]);
            tv3.setText("Date of birth:" + "\n" + biology[2][position]);
            tv4.setText("Phone Number:" + "\n" + biology[3][position]);

        }
        else if (helper == 3){
            tv1.setText("First Name:" + "\n" + physics[0][position]);
            tv2.setText("Last Name:" + "\n" +physics[1][position]);
            tv3.setText("Date of birth:" + "\n" + physics[2][position]);
            tv4.setText("Phone Number:" + "\n" + physics[3][position]);
        }
        else if (helper == 4) {
            tv1.setText("First Name:" + "\n" + cyber[0][position]);
            tv2.setText("Last Name:" + "\n" + cyber[1][position]);
            tv3.setText("Date of birth:" + "\n" + cyber[2][position]);
            tv4.setText("Phone Number:" + "\n" + cyber[3][position]);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position == 1) {
            ArrayAdapter<String> adp2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, chemistry[0]);
            lv.setAdapter(adp2);
            helper = 1;
        }
        else if (position == 2) {
            ArrayAdapter<String> adp2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, biology[0]);
            lv.setAdapter(adp2);
            helper = 2;
        }
        else if (position == 3) {
            ArrayAdapter<String> adp2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, physics[0]);
            lv.setAdapter(adp2);
            helper = 3;
        }
        else if (position == 4) {
            ArrayAdapter<String> adp2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cyber[0]);
            lv.setAdapter(adp2);
            helper = 4;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}