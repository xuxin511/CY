package com.xx.chinetek.cyproduct.Billinstock;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import com.android.volley.Request;
import com.google.gson.reflect.TypeToken;
import com.xx.chinetek.adapter.product.BillsStockIn.BillAdapter;
import com.xx.chinetek.base.BaseActivity;
import com.xx.chinetek.base.BaseApplication;
import com.xx.chinetek.cyproduct.Receiption.CompleteProduct;
import com.xx.chinetek.cywms.Qc.QCBillChoice;
import com.xx.chinetek.cywms.R;
import com.xx.chinetek.model.Production.Wo.WoModel;
import com.xx.chinetek.model.Receiption.SupplierModel;
import com.xx.chinetek.model.ReturnMsgModelList;
import com.xx.chinetek.model.URLModel;
import com.xx.chinetek.model.WMS.OffShelf.OutStockTaskInfo_Model;
import com.xx.chinetek.util.Network.NetworkError;
import com.xx.chinetek.util.Network.RequestHandler;
import com.xx.chinetek.util.dialog.MessageBox;
import com.xx.chinetek.util.dialog.ToastUtil;
import com.xx.chinetek.util.function.CommonUtil;
import com.xx.chinetek.util.function.GsonUtil;
import com.xx.chinetek.util.log.LogUtil;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.xx.chinetek.cywms.R.id.mSwipeLayout;

/**
 * Created by ymh on 2017/8/22.
 */

@ContentView(R.layout.activity_product_bills_in)
public class BillsIn  extends BaseActivity {

    @ViewInject(R.id.mSwipeLayout)
    SwipeRefreshLayout mSwipeLayout;

    @ViewInject(R.id.lsvChoice)
    ListView lsvChoice;

    @ViewInject(R.id.edt_filterContent)
    EditText edt_filterContent;

    Context context = BillsIn.this;
    BillAdapter billAdapter;

    String TAG_GetT_InBill = "OffShelfBillChoice_GetT_InBill";
    private final int RESULT_GetT_InBill = 101;

    ArrayList<WoModel> WoModels;

    @Override
    public void onHandleMessage(Message msg) {
        mSwipeLayout.setRefreshing(false);
        switch (msg.what) {
            case RESULT_GetT_InBill:
                AnalysisGetT_RESULT_GetT_InBillADFJson((String) msg.obj);
                break;

            case NetworkError.NET_ERROR_CUSTOM:
                ToastUtil.show("获取请求失败_____"+ msg.obj);
                CommonUtil.setEditFocus(edt_filterContent);
                break;
        }
    }


    void AnalysisGetT_RESULT_GetT_InBillADFJson(String result){
        try {
            LogUtil.WriteLog(QCBillChoice.class, TAG_GetT_InBill, result);
            ReturnMsgModelList<WoModel> returnMsgModel = GsonUtil.getGsonUtil().fromJson(result, new TypeToken<ReturnMsgModelList<WoModel>>() {
            }.getType());
            if (returnMsgModel.getHeaderStatus().equals("S")) {
                WoModels = returnMsgModel.getModelJson();
            } else {
                MessageBox.Show(context, returnMsgModel.getMessage());
            }
            if (WoModels != null)
                BindListVIew(WoModels);
        }catch (Exception ex){
            MessageBox.Show(context, ex.getMessage());
        }
    }


    @Override
    protected void initViews() {
        super.initViews();
        BaseApplication.context = context;

        x.view().inject(this);
        getData();
//        List<SupplierModel> supplierModels=getData();
//        billAdapter=new BillAdapter(context,supplierModels);
//        lsvChoice.setAdapter(billAdapter);
    }

    /**
     * Listview item 点击事件
     */
    @Event(value = R.id.lsvChoice,type =  AdapterView.OnItemClickListener.class)
    private void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(context,CompleteProduct.class);
        WoModel Model= (WoModel)billAdapter.getItem(position);
        if(intent!=null)
            startActivityLeft(intent);

        Bundle bundle=new Bundle();
        bundle.putParcelable("WoModel",Model);
        intent.putExtras(bundle);
        startActivityLeft(intent);


//        intent.putExtra("MaterialNo","MaterialNo");
//        intent.putExtra("MaterialDesc","MaterialDesc");
//        intent.putExtra("MaterialBatch","MaterialBatch1");
//        intent.putExtra("MaterialBNumber","MaterialBNumber1");
//        startActivityLeft(intent);


    }

    void getData(){
        try {
//            String ModelJson = GsonUtil.parseModelToJson(outStockTaskInfoModel);
              Map<String, String> params = new HashMap<>();
//            params.put("UserJson", GsonUtil.parseModelToJson(BaseApplication.userInfo));
//            params.put("ModelJson", ModelJson);
//            LogUtil.WriteLog(OffShelfBillChoice.class, TAG_GetT_OutTaskListADF, ModelJson);
            RequestHandler.addRequestWithDialog(Request.Method.POST, TAG_GetT_InBill, getString(R.string.Msg_GetWOInfo), context, mHandler,
                    RESULT_GetT_InBill, null,  URLModel.GetURL().GetT_WoinfoModel, params, null);
        } catch (Exception ex) {
            mSwipeLayout.setRefreshing(false);
            MessageBox.Show(context, ex.getMessage());
        }
    }

//    List<SupplierModel> getData(){
//        List<SupplierModel> supplierModels = new ArrayList<>();
////        List<WoModel> WoModels = new ArrayList<>();
//        ArrayList<WoModel> woModels= null;
//
//
////        for(int i=0;i<woModels.size();i++){
////            SupplierModel supplierModel=new SupplierModel();
////            supplierModel.setSupplierID(woModels.get(i).getDisplayID());
////            supplierModel.setSupplierName("SupplierName");
////            supplierModel.setVoucherNo(woModels.get(i).getVoucherNo());
////            supplierModel.setERPVoucherNo(woModels.get(i).getBatchNo());
////            supplierModel.setStrVoucherType(woModels.get(i).getStrVoucherType());
////            supplierModel.setCompany("据点");
////            supplierModel.setDepartment("部门");
////            supplierModels.add(supplierModel);
////        }
//
//        for(int i=0;i<2;i++){
//            SupplierModel supplierModel=new SupplierModel();
//            supplierModel.setSupplierID("setSupplierID");
//            supplierModel.setSupplierName("SupplierName");
//            supplierModel.setVoucherNo("setSupplierID");
//            supplierModel.setERPVoucherNo("setSupplierID");
//            supplierModel.setStrVoucherType("setSupplierID");
//            supplierModel.setCompany("据点");
//            supplierModel.setDepartment("部门");
//            supplierModels.add(supplierModel);
//        }
//        return supplierModels;
//    }

    private void BindListVIew(List<WoModel> WoModels) {
        billAdapter=new BillAdapter(context,WoModels);
        lsvChoice.setAdapter(billAdapter);

    }




}