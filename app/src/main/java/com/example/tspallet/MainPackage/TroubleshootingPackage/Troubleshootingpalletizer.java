package com.example.tspallet.MainPackage.TroubleshootingPackage;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.tspallet.Fault;
import com.example.tspallet.ListFaultAdapter;
import com.example.tspallet.R;

import java.util.ArrayList;

public class Troubleshootingpalletizer extends AppCompatActivity {
    private ArrayList<Fault> mFaultList;

    private RecyclerView mRecyclerView;
    private ListFaultAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troubleshootingpalletizer);

        createExampleList();
        buildRecyclerView();

        EditText editText = findViewById(R.id.edittext);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

    }

    private void filter(String text) {
        ArrayList<Fault> filteredList = new ArrayList<>();

        for (Fault item : mFaultList) {
            if (item.getText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }

        mAdapter.filterList(filteredList);
    }

    private void createExampleList() {
        mFaultList = new ArrayList<>();
        mFaultList.add(new Fault(R.drawable.ic_bg, "F001", "   Lay-off table"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F002", "   "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F003", "   Bag correction"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F004", "D036-B01 Photocell Hoist roller conveyor Discharge not free"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F005", "   "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F006", "D055-B04 Photocell Separator Pallet on fork of the separator not detected"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F007", "   "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F011", "C003-F01 Control voltage  "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F012", "D820-D829 Motor protection Full pallet transport "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F013", "C001-Q02 - Q05 Motor protection Group switch "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F014", "D000-D032 Motor protection Palletpac bag transport "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F016", "D035-D100 Motor protection Hoist "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F017", "D050-D070 Motor protection Empty pallet transport "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F018", "D027-B01 Photocell Lay-off table Has to reference travel"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F019", "   Main control system"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F020", "C010-E01   "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F021", "   Control center"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F022", "D829-A01 Safety photocell Roller conveyor take-away Tripped"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F023", "D030-B01 Photocell Press element left Has to reference travel"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F024", "D031-B01 Photocell Press element right Has to reference travel"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F025", "D035-U01  Hoist Braking resistor"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F026", "D048-A01 Safety photocell Pallet pusher infeed Tripped"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F029", "C010-S08 Safetty switch Bag flattener "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F035", "C013-E01 Thermal protection  "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F036", "D027-R01 Thermal monitoring Lay-off table Braking resistor"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F037", "D035-R01 Thermal monitoring Hoist Braking resistor"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F040", "  Timing belt layer pusher side Timing belt layer pusher not detected"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F041", "  Timing belt lay-off able side bag gap not detected"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F046", "D820-D829  Full pallet transport Pallet full, need to be take away"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F047", "D050-D070  Empty pallet transport Pallet missing, need to be filled"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F048", "D050-B04 Photocell Pallet pusher hoist Occupied without permission"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F050", "D008 Photocell Distribution belt occupied"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F051", "D048-E01/E02 Induction loop Pallet pusher infeed Pallet feed occupied"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F054", "C004-F02 - F07 Control voltage  "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F071", "D014-B01 Timer Turning bar layer pusher side Runnig time"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F072", "D015-B01 Timer Turning bar lay-off table side Runnig time"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F073", "D009-B01 Timer Distributor plate Runnig time"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F074", "D055 Timer Separator Raise / lower"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F075", "D056 Timer Fork Runnig time"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F102", "D010-U01 Thermistor Timing belt layer pusher side  "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F103", "D011-U01 Thermistor Timing belt lay-off table side  "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F105", "D001-U01 Thermistor Timing belt before distribution "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F106", "D016-U01 Thermistor Bag row belt layer pusher side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F107", "D017-U01 Thermistor Bag row belt lay-off table side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F108", "D018-U01 Thermistor Layer belt layer pusher side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F109", "D019-U01 Thermistor Layer belt lay-off table side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F110", "D023-U01 Thermistor Layer pusher left "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F111", "D012-U01 Thermistor Alignment belt layer pusher side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F112", "D025-U01 Thermistor Layer pusher right "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F117", "D036-U01 Thermistor Roller conveyor hoist Hoist"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F118", "D100-U01 Thermistor Roller conveyor behind hoist Behind hoist"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F119", "D050-U01 Thermistor Pallet pusher "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F120", "D013-U01 Thermistor Alignment belt lay-off table side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F132", "D010-U01 Converter Timing belt layer pusher side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F133", "D011-U01 Converter Timing belt lay-off table side  "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F135", "D001-U01 Converter Timing belt before distribution "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F136", "D016-U01 Converter Bag row belt layer pusher side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F137", "D017-U01 Converter Bag row belt lay-off table side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F138", "D018-U01 Converter Layer belt layer pusher side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F139", "D019-U01 Converter Layer belt lay-off table side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F140", "D023-U01 Converter Layer pusher left "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F141", "D012-U01 Converter Alignment belt layer pusher side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F142", "D025-U01 Converter Layer pusher right "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F144", "D035-U01 Converter Hoist "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F147", "D036-U01 Converter Roller conveyor hoist "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F148", "D100-U01 Converter Roller conveyor behind hoist "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F149", "D050-U01 Converter Pallet pusher "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F150", "D013-U01 Converter Alignment belt lay-off table side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F151", "D027-U01 Converter Lay-off table "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F152", "D030-U01 Converter Press element left "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F153", "D031-U01 Converter Press element right "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F156", "   "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F157", "D016-B01 Photocell Bag row belt layer pusher side Too long occupied"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F158", "D012-B01 Photocell Counting  Bag row belt layer pusher side bag count error"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F159", "D013-B01 Photocell Counting  Bag row belt lay-off table side bag count error"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F160", "D008-B01 Photocell Distribution belt  Too long occupied"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F161", "D012-B01 Photocell Turning bar layer pusher side free"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F162", "D013-B01 Photocell Turning bar lay-off table side free"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F164", "D012-B02 Photocell Bag row belt layer pusher side Too long occupied"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F165", "D013-B02 Photocell Bag row belt lay-off table side Too long occupied"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F166", "D017-D019 Photocell Bag row belt lay-off table side Too long occupied"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F167", "D050-B05 Photocell Pallet pusher PALLET TOO FAR"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F168", "D055-B05 Photocell Separator "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F176", "D027-B03 / -B05 Photocell Lay-off table Without permission"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F177", "D035-B01 Photocell Hoist Impulse transmitter"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F179", "D035  Hoist turning wrong direction"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F181", "D035-K11 / K12  Hoist Not fallen"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F183", "D035-B04  Hoist "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F184", "D035-B03  Hoist "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F185", "D035  Hoist Under table"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F194", "D016-B12 Photocell Counting  Bag row belt layer pusher side Belt layer pusher side"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F195", "D017-B12 Photocell Counting  Bag row belt lay-off table side Belt table side"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F196", "D018-B12 Photocell Counting  Layer belt layer pusher side Layer pusher side"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F197", "D019-B12 Photocell Counting  Layer belt lay-off table side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F198", "D023-B12 Photocell Counting  Layer pusher left Left"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F199", "D025  Layer pusher right Wrong Direction"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F205", "D025-B12 Photocell Counting  Layer pusher right Right"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F206", "D025  Layer pusher right Wrong Direction"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F216", "D050-B12 Photocell Counting  Pallet pusher "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F217", "D050  Pallet pusher Wrong Direction"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F220", "D050  Pallet pusher Blocked Range"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F226", "D027-U01 Converter Lay-off table Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F227", "D030-U01 Converter Press element left Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F228", "D031-U01 Converter Press element right Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F229", "D001-U01 Converter Timing belt before distribution Station Failure "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F231", "D010-U01 Converter Timing belt layer pusher side Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F232", "D011-U01 Converter Timing belt lay-off table side Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F233", "D012-U01 Converter Alignment belt layer pusher side Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F234", "D013-U01 Converter Alignment belt lay-off table side Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F235", "D016-U01 Converter Bag row belt layer pusher side Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F236", "D017-U01 Converter Bag row belt lay-off table side Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F237", "D018-U01 Converter Layer belt layer pusher side Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F238", "D019-U01 Converter Layer belt lay-off table side Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F239", "D023-U01 Converter Layer pusher left Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F240", "D025-U01 Converter Layer pusher right Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F241", "D035-U01 Converter Hoist Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F245", "D023-B01 Impulse transmitter Transmitter layer pusher left Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F246", "D025-B01 Impulse transmitter Transmitter layer pusher right Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F247", "D035-B01 Impulse transmitter Transmitter hoist Station Failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F251", "D024  Layer pusher plate left Not in position (Manual function)"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F252", "D026  Layer pusher plate right Not in position (Manual function)"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F258", "D009-B01 Proximity Switch Distributor plate layer pusher side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F259", "D009-B02 Proximity Switch Distributor plate lay-off table side "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F263", "D023-B01 Proximity Switch Layer pusher left Home position"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F265", "D024-B04 Proximity Switch Layer pusher plate left Top control"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F266", "D024-B03 Proximity Switch Layer pusher plate left Bottom control"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F268", "D025-B01 Proximity Switch Layer pusher right Home position"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F270", "D026-B04 Proximity Switch Layer pusher plate right Top"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F271", "D026-B03 Proximity Switch Layer pusher plate right Bottom"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F272", "D030-B01 Proximity Switch Press element left Retracted"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F273", "D030-B02 Proximity Switch Press element left Pressed"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F275", "D031-B01 Proximity Switch Press element right Retracted"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F276", "D031-B02 Proximity Switch Press element right Pressed"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F290", "D024-B02 Proximity Switch Layer pusher plate left Top"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F291", "D024-B01 Proximity Switch Layer pusher plate left Bottom"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F292", "D026-B02 Proximity Switch Layer pusher plate right  Top"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F293", "D026-B01 Proximity Switch Layer pusher plate right Bottom"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F306", "D027-B01 Proximity Switch Lay-off table Open"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F310", "D035-B01 Proximity Switch Hoist Lower position"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F312", "D035-B02 Proximity Switch Hoist Upper position"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F316", "D035-B04 Proximity Switch Hoist "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F317", "D035-B03 Proximity Switch Hoist Chain monitoring"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F325", "D056-B01 Proximity Switch Fork Retracted"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F326", "D056-B02 Proximity Switch Fork Extended"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F327", "D055-B02 Proximity Switch Separator Bottom"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F328", "D055-B01 Proximity Switch Separator Top"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F329", "D055-B03 Proximity Switch Separator Home position"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F330", "D055-B05 Proximity Switch Separator  Chain monitoring"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F333", "D050-B03 Proximity Switch Pallet pusher hoist Take-over position"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F337", "D050-B06 Proximity Switch Pallet pusher hoist "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F340", "D050-B04 Photocell Pallet pusher hoist Hoist separator free fault"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F341", "D050-B06 Photocell Pallet pusher hoist Hoist separator free polluted"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F343", "D050-B05 Proximity Switch Pallet pusher hoist PALLET TOO FAR"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F344", "D048-B01 Proximity Switch Pallet pusher infeed Feeding position"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F346", "D048-B05 Proximity Switch Pallet pusher infeed Transfer position"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F347", "D048-B02 Proximity Switch Pallet pusher infeed Position 1 occupied"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F353", "D055-B07  Separator Occupied"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F356", "D820-B01 Proximity Switch Roller conveyor shuttle cart  Take-over position"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F357", "D820-B04 Proximity Switch Roller conveyor shuttle cart  Transfer position"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F358", "D823-B01 Proximity Switch Roller conveyor displacement cart Extended"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F360", "D050  Pallet pusher hoist wrong impulse sequence"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F371", "D000-B01 Photocell Storage roller conveyor adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F372", "D000-B01 Photocell Storage roller conveyor failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F373", "D001-B01 Photocell Timing belt before distribution adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F374", "D001-B01 Photocell Timing belt before distribution failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F375", "D008-B01 Photocell Distribution belt adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F376", "D008-B01 Photocell Distribution belt failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F377", "D010-B01 Photocell Timing belt layer pusher side  adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F378", "D010-B01 Photocell Timing belt layer pusher side  failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F379", "D011-B01 Photocell Timing belt lay-off table side  adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F380", "D011-B01 Photocell Timing belt lay-off table side  failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F381", "D012-B01 Photocell Turning bar layer pusher side adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F382", "D012-B01 Photocell Turning bar layer pusher side failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F383", "D012-B02 Photocell Alignment belt layer pusher side adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F384", "D012-B02 Photocell Alignment belt layer pusher side failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F385", "D013-B01 Photocell Turning bar lay-off table side adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F386", "D013-B01 Photocell Turning bar lay-off table side failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F387", "D013-B02 Photocell Alignment belt lay-off table side adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F388", "D013-B02 Photocell Alignment belt lay-off table side failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F389", "D016-B01 Photocell Layer belt layer pusher side  adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F390", "D016-B01 Photocell Layer belt layer pusher side  failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F391", "D017-B01 Photocell Layer belt lay-off table side adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F392", "D017-B01 Photocell Layer belt lay-off table side failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F395", "D027-B03 Photocell Hoist under lay-off table adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F396", "D027-B03 Photocell Hoist under lay-off table failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F397", "D027-B04 Photocell Hoist under lay-off table adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F398", "D027-B04 Photocell Hoist under lay-off table failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F399", "D036-B01 Photocell Hoist roller conveyor adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F400", "D036-B01 Photocell Hoist roller conveyor failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F401", "D036-B02 Photocell Hoist roller conveyor adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F402", "D036-B02 Photocell Hoist roller conveyor failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F403", "D100-B01 Photocell Roller conveyor behind hoist adjust"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F404", "D100-B01 Photocell Roller conveyor behind hoist failure"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F409", "D882-B01 Photocell Roller conveyor shuttle cart "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F410", "D824-B01 Photocell Roller conveyor displacement cart "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F411", "D825-B01 Photocell Roller conveyor next to displacement cart "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F412", "D826-B01 Photocell Roller conveyor 1 "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F413", "D827-B01 Photocell Roller conveyor 2 "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F414", "D828-B01 Photocell Roller conveyor before take-away "));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F415", "D829-B02 Photocell Roller conveyor take-away right"));
        mFaultList.add(new Fault(R.drawable.ic_bg, "F416", "D829-B01 Photocell Roller conveyor take-away left"));

    }

    private void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ListFaultAdapter(mFaultList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

}
