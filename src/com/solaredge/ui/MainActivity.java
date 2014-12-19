package com.solaredge.ui;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.solaredge.R;
import com.solaredge.entity.JsonResponse;
import com.solaredge.entity.PowerStation;
import com.solaredge.fusion.FusionField;
import com.solaredge.fusion.SvcNames;
import com.solaredge.server.response.AlaResponse;
import com.solaredge.ui.adapter.PowerStationListAdapter;

public class MainActivity extends BaseActivity {

	private ListView mList;
	private PowerStationListAdapter mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_main);
		super.onCreate(savedInstanceState);

		if (!FusionField.solarUser.isUserLogin()) {
			// jumpToPage(LoginActivity.class, true);
		}

		mBaseHandler.postDelayed(new Runnable() {

			@Override
			public void run() {
				// mSolarManager.getStationList();
			}
		}, 200);

		List<PowerStation> list = new ArrayList<PowerStation>();
		PowerStation station = new PowerStation();
		station.setStationId("001");
		station.setStationName("赛拉弗");
		list.add(station);

		station = new PowerStation();
		station.setStationId("002");
		station.setStationName("东方电气");
		list.add(station);
		mAdapter = new PowerStationListAdapter(this, list);
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
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b_func2:
			jumpToPage(SelectLanguageActivity.class);
			break;

		default:
			break;
		}
		super.onClick(v);
	}

	@Override
	public void handleEvent(int resultCode, AlaResponse response) {
		if (!analyzeAsyncResultCode(resultCode, response)) {
			return;
		}

		int action = response.getResponseEvent();
		JsonResponse jr = response.getResponseContent();
		switch (action) {
		case SvcNames.WSN_GET_STATION_LIST:
			handleStationList(jr);
			break;
		default:
			break;
		}
	}

	private void handleStationList(JsonResponse jr) {
		if (jr == null) {
			return;
		}

	}

}
