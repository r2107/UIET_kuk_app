package com.dsc.uiet;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class TnpBacktrack extends Activity{

    ListView list;
    String[] itemname ={
            "Wipro Limited",
            "Infosys Limited",
            "HCL Talentcare",
            "Asahi India Glass",
            "eCentricHR Pvt. Ltd.",
            "IDS Infotech Pvt. Ltd.",
            "Adani Gas Ltd.",
            "Code Brew Labs",
            "TOXSL Pvt.Ltd.",
            "OSAW Industrial Products Pvt. Ltd.",
            "Indian Army",
            "Newgen Softwar Technologies Ltd.",
            "Open Silicon Research Pvt. Ltd.",
            "OGS Pvt. Ltd.",
            "XL Dynamics India Pvt. Ltd.",
            "Mobile Tutor Pvt. Ltd.",
            "Tirupati Life Sciences Pvt. Ltd.",
            "Hinduston Times",
            "NAGGARO",
            "Denso Pvt. Ltd.",
            "Flour Daniel",
            "Techsavvy",
            "Airsoft",
            "FranConnect",
            "UST Global",
            "NEC Technologies",
            "L & T Infotech",
    };
    String[] itemvalue ={"71","55", "45", "1", "9", "5", "4", "4", "5", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A"};
    String[] itemvalue2 ={"N.A","53", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "4", "17", "2", "3", "3", "5", "20", "9", "4", "2", "5", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A", "N.A"};

    Integer[] imgid={
            R.drawable.wipro,
            R.drawable.infosis,
            R.drawable.hcl,
            R.drawable.asahi,
            R.drawable.ecentric,
            R.drawable.ids,
            R.drawable.adani,
            R.drawable.code,
            R.drawable.toxcl,
            R.drawable.indosaw,
            R.drawable.army,
            R.drawable.newgenlogo,
            R.drawable.osi_logo,
            R.drawable.ogs,
            R.drawable.xl,
            R.drawable.mtutor,
            R.drawable.trip,
            R.drawable.hind,
            R.drawable.nagaro,
            R.drawable.denso,
            R.drawable.fluor,
            R.drawable.techlogo,
            R.drawable.airo,
            R.drawable.fran,
            R.drawable.ust,
            R.drawable.nec,
            R.drawable.lnt,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tnp_backtrack);
        CustomListAdapter adapter=new CustomListAdapter(this, itemname,itemvalue,itemvalue2, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}