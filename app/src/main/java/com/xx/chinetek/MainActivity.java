package com.xx.chinetek;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xx.chinetek.Box.Boxing;
import com.xx.chinetek.FillPrint.FillPrint;
import com.xx.chinetek.Pallet.CombinPallet;
import com.xx.chinetek.Pallet.CombinPalletSupplier;
import com.xx.chinetek.Pallet.DismantlePallet;
import com.xx.chinetek.adapter.GridViewItemAdapter;
import com.xx.chinetek.base.BaseActivity;
import com.xx.chinetek.base.BaseApplication;
import com.xx.chinetek.base.ToolBarTitle;
import com.xx.chinetek.cyproduct.Adjust.AdjustCP;
import com.xx.chinetek.cyproduct.Billinstock.BillsIn;
import com.xx.chinetek.cyproduct.LineStockIn.LineStockInMaterial;
import com.xx.chinetek.cyproduct.LineStockIn.LineStockInProduct;
import com.xx.chinetek.cyproduct.LineStockOut.LineStockOutProduct;
import com.xx.chinetek.cyproduct.LineStockOut.LineStockOutReturnBillChoice;
import com.xx.chinetek.cyproduct.LineStockOut.Zcj;
import com.xx.chinetek.cyproduct.Manage.LineManage;
import com.xx.chinetek.cyproduct.WoBillChoice;
import com.xx.chinetek.cywms.InnerMove.InnerMoveScan;
import com.xx.chinetek.cywms.Intentory.InventoryBillChoice;
import com.xx.chinetek.cywms.MaterialChange.MaterialChangeReceiptBillChoice;
import com.xx.chinetek.cywms.OffShelf.OffShelfBillChoice;
import com.xx.chinetek.cywms.Qc.QCBillChoice;
import com.xx.chinetek.cywms.Query.QueryMain;
import com.xx.chinetek.cywms.R;
import com.xx.chinetek.cywms.Receiption.ReceiptBillChoice;
import com.xx.chinetek.cywms.Review.ReviewBillChoice;
import com.xx.chinetek.cywms.Stock.AdjustStock;
import com.xx.chinetek.cywms.UpShelf.UpShelfBillChoice;
import com.xx.chinetek.model.User.MenuInfo;
import com.xx.chinetek.util.function.CommonUtil;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@ContentView(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @ViewInject(R.id.gv_Function)
    GridView gridView;
    GridViewItemAdapter adapter;
    Context context = MainActivity.this;

    @Override
    protected void initViews() {
        super.initViews();
        BaseApplication.context = context;
        BaseApplication.toolBarTitle = new ToolBarTitle(getString(R.string.app_name)+"-"+BaseApplication.userInfo.getWarehouseName(),false);
        x.view().inject(this);
        List<Map<String, Object>> data_list = getData();
        adapter = new GridViewItemAdapter(context,data_list);
        gridView.setAdapter(adapter);
    }


    @Event(value = R.id.gv_Function,type = AdapterView.OnItemClickListener.class)
    private void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        LinearLayout linearLayout=(LinearLayout) gridView.getAdapter().getView(position,view,null);
        TextView textView=(TextView)linearLayout.getChildAt(1);
        Intent intent = new Intent();
        if(textView.getText().toString().equals("质检"))
            intent.setClass(context, QCBillChoice.class);
        else if(textView.getText().toString().equals("收货"))
            intent.setClass(context, ReceiptBillChoice.class);
        else if(textView.getText().toString().equals("上架"))
            intent.setClass(context, UpShelfBillChoice.class);
        else if(textView.getText().toString().equals("下架"))
            intent.setClass(context, OffShelfBillChoice.class);
        else if(textView.getText().toString().equals("发货复核"))
            intent.setClass(context, ReviewBillChoice.class);
        else if(textView.getText().toString().equals("移库"))
            intent.setClass(context, InnerMoveScan.class);
        else if(textView.getText().toString().equals("盘点")) {
            intent.setClass(context, InventoryBillChoice.class);
            intent.putExtra("model",1);
        }
        else if(textView.getText().toString().equals("财务盘点")) {
            intent.setClass(context, InventoryBillChoice.class);
            intent.putExtra("model",2);
        }
        else if(textView.getText().toString().equals("查询"))
            intent.setClass(context, QueryMain.class);
        else if(textView.getText().toString().equals("组托"))
            intent.setClass(context, CombinPallet.class);
        else if(textView.getText().toString().equals("拆托"))
            intent.setClass(context, DismantlePallet.class);
        else if(textView.getText().toString().equals("装箱拆箱"))
            intent.setClass(context, Boxing.class);
        else if(textView.getText().toString().equals("物料转换"))
            intent.setClass(context, MaterialChangeReceiptBillChoice.class);
        else if(textView.getText().toString().equals("标签补打"))
            intent.setClass(context, FillPrint.class);
        else if(textView.getText().toString().equals("库存调整"))
            intent.setClass(context, AdjustStock.class);
        else if(textView.getText().toString().equals("调拨出库"))
            intent.setClass(context, AdjustCP.class);
        else if(textView.getText().toString().equals("交接入库"))
            intent.setClass(context, LineStockInProduct.class);
        else if(textView.getText().toString().equals("发料接收"))
            intent.setClass(context, LineStockInMaterial.class);
        else if(textView.getText().toString().equals("退料入库")) {
            BaseApplication.toolBarTitle=new ToolBarTitle(getString(R.string.LineStockInReturnBillChoice),true);
            intent.setClass(context, WoBillChoice.class);
        }
        else if(textView.getText().toString().equals("退料出库"))
            intent.setClass(context, LineStockOutReturnBillChoice.class);
        else if(textView.getText().toString().equals("装车扫描"))
            intent.setClass(context, LineStockOutProduct.class);
        else if(textView.getText().toString().equals("领料出库")) {
            BaseApplication.toolBarTitle=new ToolBarTitle(getString(R.string.LineStockOutMaterial),true);
            intent.setClass(context, WoBillChoice.class);
        }
        else if(textView.getText().toString().equals("产线生产"))
            intent.setClass(context, BillsIn.class);
        else if(textView.getText().toString().equals("生产记录"))
            intent.setClass(context, LineManage.class);
        else if(textView.getText().toString().equals("制成检"))
            intent.setClass(context, Zcj.class);
        else if(textView.getText().toString().equals("供应商组托"))
            intent.setClass(context, CombinPalletSupplier.class);
        else if(textView.getText().toString().equals("第三方移库")) {
            intent.setClass(context, InnerMoveScan.class);
            intent.putExtra("FunctionType",1);
        }
        if(intent!=null)
            startActivityLeft(intent);
    }


    @Override
    protected void initData() {
        super.initData();

    }

    public List<Map<String, Object>> getData(){
        List<Map<String, Object>> data_list = new ArrayList<Map<String, Object>>();
        ArrayList<Integer>  itemIconList=new ArrayList<>();
        ArrayList<String>  itemNamesList=new ArrayList<>();
        List<MenuInfo> menuInfos=BaseApplication.userInfo.getLstMenu();
        if(menuInfos!=null) {
            for (int i = 0; i < menuInfos.size(); i++) {
                String nodUrl = menuInfos.get(i).getNodeUrl();
                if(!CommonUtil.isNumeric(nodUrl)) continue;
                int Node = Integer.parseInt(nodUrl);
                switch (Node) {
                    case 1:
                        itemIconList.add(R.drawable.qc);
                        itemNamesList.add("质检");
                        break;
                    case 2:
                        itemIconList.add(R.drawable.receiption);
                        itemNamesList.add("收货");
                        break;
                    case 3:
                        itemIconList.add(R.drawable.upshelves);
                        itemNamesList.add("上架");
                        break;
                    case 4:
                        itemIconList.add(R.drawable.offshelf);
                        itemNamesList.add("下架");
                        break;
                    case 5:
                        itemIconList.add(R.drawable.review);
                        itemNamesList.add("发货复核");
                        break;
                    case 6:
                        itemIconList.add(R.drawable.innermove);
                        itemNamesList.add("移库");
                        break;
                    case 7:
                        itemIconList.add(R.drawable.inventory);
                        itemNamesList.add("盘点");
                        itemIconList.add(R.drawable.intentoryfinc);
                        itemNamesList.add("财务盘点");
                        break;
                    case 8:
                        itemIconList.add(R.drawable.query);
                        itemNamesList.add("查询");
                        break;
                    case 9:
                        itemIconList.add(R.drawable.combinepallet);
                        itemNamesList.add("组托");
                        break;
                    case 10:
                        itemIconList.add(R.drawable.dismantlepallet);
                        itemNamesList.add("拆托");
                        break;
                    case 11:
                        itemIconList.add(R.drawable.dismounting);
                        itemNamesList.add("装箱拆箱");
                        break;
                    case 12:
                        itemIconList.add(R.drawable.materiel);
                        itemNamesList.add("物料转换");
                        break;
                    case 13:
                        itemIconList.add(R.drawable.fillprint);
                        itemNamesList.add("标签补打");
                        break;
                    case 14:
                        itemIconList.add(R.drawable.adjustment);
                        itemNamesList.add("库存调整");
                        break;
                    case 15:
                        itemIconList.add(R.drawable.receiption);
                        itemNamesList.add("发料接收");
                        break;
                    case 16:
                        itemIconList.add(R.drawable.returnmaterial);
                        itemNamesList.add("退料入库");
                        break;
                    case 17:
                        itemIconList.add(R.drawable.receiptsemiproduct);
                        itemNamesList.add("交接入库");
                        break;
                    case 18:
                        itemIconList.add(R.drawable.packagematerial);
                        itemNamesList.add("领料出库");
                        break;
                    case 19:
                        itemIconList.add(R.drawable.semiproduct);
                        itemNamesList.add("退料出库");
                        break;
                    case 20:
                        itemIconList.add(R.drawable.deliveryproduct);
                        itemNamesList.add("装车扫描");
                        break;
                    case 21:
                        itemIconList.add(R.drawable.productmanage);
                        itemNamesList.add("生产记录");
                        break;
                    case 22:
                        itemIconList.add(R.drawable.receiptproduct);
                        itemNamesList.add("产线生产");
                        break;
                    case 25:
                        itemIconList.add(R.drawable.adjustment);
                        itemNamesList.add("调拨出库");
                        break;
                    case 26:
                        itemIconList.add(R.drawable.qc);
                        itemNamesList.add("制成检");
                        break;
                    case 27:
                        itemIconList.add(R.drawable.combinepallet);
                        itemNamesList.add("供应商组托");
                        break;
                    case 33:
                        itemIconList.add(R.drawable.innermove);
                        itemNamesList.add("第三方移库");
                        break;
                }
            }
            //cion和iconName的长度是相同的，这里任选其一都可以
            for (int i = 0; i < itemIconList.size(); i++) {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("image", itemIconList.get(i));
                map.put("text", itemNamesList.get(i));
                data_list.add(map);
            }
        }

        return data_list;
    }
}
