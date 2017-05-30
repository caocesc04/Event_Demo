package demo.dinhconghome.nvcar.event_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex09);

        TabHost th = (TabHost)findViewById(R.id.th1);

        TabHost.TabSpec ts1 = th.newTabSpec("tab1");
        TabHost.TabSpec ts2 = th.newTabSpec("tab2");
        TabHost.TabSpec ts3 = th.newTabSpec("tab3");

        th.addTab(ts1);
        th.addTab(ts2);
        th.addTab(ts3);

    }
}
