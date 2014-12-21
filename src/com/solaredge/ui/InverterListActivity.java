package com.solaredge.ui;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.solaredge.R;
import com.solaredge.entity.Inverter;
import com.solaredge.ui.adapter.InverterListAdapter;

public class InverterListActivity extends BaseActivity {

	private ListView mList;
	private InverterListAdapter mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		setContentView(R.layout.activity_inverter_list);
		super.onCreate(savedInstanceState);

		List<Inverter> list = new ArrayList<Inverter>();
		Inverter inverter = new Inverter();
		inverter.setInverterId("001");
		inverter.setInverterName("逆变器1");
		inverter.setmGroupNumber(10);
		inverter.setmClusterNumber(8);
		inverter.setmAngle(0);
		list.add(inverter);

		inverter = new Inverter();
		inverter.setInverterId("002");
		inverter.setInverterName("逆变器2");
		inverter.setmGroupNumber(5);
		inverter.setmClusterNumber(10);
		inverter.setmAngle(90);
		list.add(inverter);
		mAdapter = new InverterListAdapter(this, list);
		mList.setAdapter(mAdapter);
	}

	@Override
	protected void initWidgetEvent() {
		super.initWidgetEvent();
	}

	@Override
	protected void initWidgetProperty() {
		super.initWidgetProperty();

		mList = (ListView) findViewById(R.id.l_power_station_list);

		mServiceTitle.setText("集能易");
		mXFunc2.setVisibility(View.VISIBLE);
		mXFunc2.setImageResource(R.drawable.drw_confirm);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b_func2:
			jumpToPage(InverterLayoutActivity.class);
			break;

		default:
			break;
		}
		super.onClick(v);
	}
}