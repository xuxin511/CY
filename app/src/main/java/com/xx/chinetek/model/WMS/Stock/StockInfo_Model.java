package com.xx.chinetek.model.WMS.Stock;

import android.os.Parcel;
import android.os.Parcelable;

import com.xx.chinetek.model.Base_Model;

/**
 * Created by GHOST on 2017/1/13.
 */

public class StockInfo_Model extends Base_Model implements Parcelable {//
    public StockInfo_Model(){

    }

    public StockInfo_Model(String Barcode){
        this.Barcode=Barcode;
    }
    private String Barcode;
    private String SerialNo;
    private String MaterialNo;
    private String MaterialDesc;
    private String WarehouseNo;
    private String HouseNo;
    private String AreaNo;
    private Float Qty;
    private String TMaterialNo;
    private String TMaterialDesc;
    private String PickAreaNo;
    private String CelareaNo;
    private Float IsDel;
    private String BatchNo;
    private String SN;
    private String ReturnSupCode;
    private String ReturnReson;
    private String ReturnSupName;
    private Float OldStockID;
    private Float TaskDetailesID;
    private Float CheckID;
    private Float TransferDetailsID;
    private Float ReturnType;
    private String ReturnTypeDesc;
    private String Unit;
    private String SaleName;
    private String UnitName;
    private String PalletNo;
    private Float PalletQty;
    private Float ReceiveStatus;
    private String FromAreaNo;
    private String FromHouseNo;
    private String FromWareHouseNo;
    private int FromAreaID;
    private int FromHouseID;
    private int FromWareHouseID;
    private int WareHouseID;
    private int HouseID;
    private int AreaID;
    private String ErpVoucherNo;
    private int StockBarCodeStatus=0;//发货复核使用  0：未组托 1：已组托
    private String PartNo;
    private int PickModel; //下架方式 1-整托 2-整箱 3-零数
    private Float AmountQty;//零数

    public String getErpVoucherNo() {
        return ErpVoucherNo;
    }

    public void setErpVoucherNo(String erpVoucherNo) {
        ErpVoucherNo = erpVoucherNo;
    }

    public int getStockBarCodeStatus() {
        return StockBarCodeStatus;
    }

    public void setStockBarCodeStatus(int stockBarCodeStatus) {
        StockBarCodeStatus = stockBarCodeStatus;
    }

    public int getPickModel() {
        return PickModel;
    }

    public void setPickModel(int pickModel) {
        PickModel = pickModel;
    }

    public Float getAmountQty() {
        return AmountQty;
    }

    public void setAmountQty(Float amountQty) {
        AmountQty = amountQty;
    }

    public String getPartNo() {
        return PartNo;
    }

    public void setPartNo(String partNo) {
        PartNo = partNo;
    }

    public int getAreaID() {
        return AreaID;
    }

    public void setAreaID(int areaID) {
        AreaID = areaID;
    }

    public int getHouseID() {
        return HouseID;
    }

    public void setHouseID(int houseID) {
        HouseID = houseID;
    }

    public int getWareHouseID() {
        return WareHouseID;
    }

    public void setWareHouseID(int wareHouseID) {
        WareHouseID = wareHouseID;
    }

    public int getFromAreaID() {
        return FromAreaID;
    }

    public void setFromAreaID(int fromAreaID) {
        FromAreaID = fromAreaID;
    }

    public int getFromHouseID() {
        return FromHouseID;
    }

    public void setFromHouseID(int fromHouseID) {
        FromHouseID = fromHouseID;
    }

    public int getFromWareHouseID() {
        return FromWareHouseID;
    }

    public void setFromWareHouseID(int fromWareHouseID) {
        FromWareHouseID = fromWareHouseID;
    }

    public Float getPalletQty() {
        return PalletQty;
    }

    public void setPalletQty(Float palletQty) {
        PalletQty = palletQty;
    }

    public Float getPalletQTY() {
        return PalletQty;
    }

    public void setPalletQTY(Float palletQty) {
        PalletQty = palletQty;
    }

    public String getPickAreaNo() {
        return PickAreaNo;
    }

    public void setPickAreaNo(String pickAreaNo) {
        PickAreaNo = pickAreaNo;
    }

    public String getAreaNo() {
        return AreaNo;
    }

    public void setAreaNo(String areaNo) {
        AreaNo = areaNo;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }

    public String getBatchNo() {
        return BatchNo;
    }

    public void setBatchNo(String batchNo) {
        BatchNo = batchNo;
    }

    public String getCelareaNo() {
        return CelareaNo;
    }

    public void setCelareaNo(String celareaNo) {
        CelareaNo = celareaNo;
    }

    public Float getCheckID() {
        return CheckID;
    }

    public void setCheckID(Float checkID) {
        CheckID = checkID;
    }

    public String getFromAreaNo() {
        return FromAreaNo;
    }

    public void setFromAreaNo(String fromAreaNo) {
        FromAreaNo = fromAreaNo;
    }

    public String getFromHouseNo() {
        return FromHouseNo;
    }

    public void setFromHouseNo(String fromHouseNo) {
        FromHouseNo = fromHouseNo;
    }

    public String getFromWareHouseNo() {
        return FromWareHouseNo;
    }

    public void setFromWareHouseNo(String fromWareHouseNo) {
        FromWareHouseNo = fromWareHouseNo;
    }

    public String getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(String houseNo) {
        HouseNo = houseNo;
    }

    public Float getIsDel() {
        return IsDel;
    }

    public void setIsDel(Float isDel) {
        IsDel = isDel;
    }

    public String getMaterialDesc() {
        return MaterialDesc;
    }

    public void setMaterialDesc(String materialDesc) {
        MaterialDesc = materialDesc;
    }

    public String getMaterialNo() {
        return MaterialNo;
    }

    public void setMaterialNo(String materialNo) {
        MaterialNo = materialNo;
    }

    public Float getOldStockID() {
        return OldStockID;
    }

    public void setOldStockID(Float oldStockID) {
        OldStockID = oldStockID;
    }

    public String getPalletNo() {
        return PalletNo;
    }

    public void setPalletNo(String palletNo) {
        PalletNo = palletNo;
    }

    public Float getQty() {
        return Qty;
    }

    public void setQty(Float qty) {
        Qty = qty;
    }

    public Float getReceiveStatus() {
        return ReceiveStatus;
    }

    public void setReceiveStatus(Float receiveStatus) {
        ReceiveStatus = receiveStatus;
    }

    public String getReturnReson() {
        return ReturnReson;
    }

    public void setReturnReson(String returnReson) {
        ReturnReson = returnReson;
    }

    public String getReturnSupCode() {
        return ReturnSupCode;
    }

    public void setReturnSupCode(String returnSupCode) {
        ReturnSupCode = returnSupCode;
    }

    public String getReturnSupName() {
        return ReturnSupName;
    }

    public void setReturnSupName(String returnSupName) {
        ReturnSupName = returnSupName;
    }

    public Float getReturnType() {
        return ReturnType;
    }

    public void setReturnType(Float returnType) {
        ReturnType = returnType;
    }

    public String getReturnTypeDesc() {
        return ReturnTypeDesc;
    }

    public void setReturnTypeDesc(String returnTypeDesc) {
        ReturnTypeDesc = returnTypeDesc;
    }

    public String getSaleName() {
        return SaleName;
    }

    public void setSaleName(String saleName) {
        SaleName = saleName;
    }

    public String getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(String serialNo) {
        SerialNo = serialNo;
    }

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public Float getTaskDetailesID() {
        return TaskDetailesID;
    }

    public void setTaskDetailesID(Float taskDetailesID) {
        TaskDetailesID = taskDetailesID;
    }

    public String getTMaterialDesc() {
        return TMaterialDesc;
    }

    public void setTMaterialDesc(String TMaterialDesc) {
        this.TMaterialDesc = TMaterialDesc;
    }

    public String getTMaterialNo() {
        return TMaterialNo;
    }

    public void setTMaterialNo(String TMaterialNo) {
        this.TMaterialNo = TMaterialNo;
    }

    public Float getTransferDetailsID() {
        return TransferDetailsID;
    }

    public void setTransferDetailsID(Float transferDetailsID) {
        TransferDetailsID = transferDetailsID;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }

    public String getWarehouseNo() {
        return WarehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        WarehouseNo = warehouseNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockInfo_Model that = (StockInfo_Model) o;

        return SerialNo.equals(that.SerialNo);

    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.Barcode);
        dest.writeString(this.SerialNo);
        dest.writeString(this.MaterialNo);
        dest.writeString(this.MaterialDesc);
        dest.writeString(this.WarehouseNo);
        dest.writeString(this.HouseNo);
        dest.writeString(this.AreaNo);
        dest.writeValue(this.Qty);
        dest.writeString(this.TMaterialNo);
        dest.writeString(this.TMaterialDesc);
        dest.writeString(this.PickAreaNo);
        dest.writeString(this.CelareaNo);
        dest.writeValue(this.IsDel);
        dest.writeString(this.BatchNo);
        dest.writeString(this.SN);
        dest.writeString(this.ReturnSupCode);
        dest.writeString(this.ReturnReson);
        dest.writeString(this.ReturnSupName);
        dest.writeValue(this.OldStockID);
        dest.writeValue(this.TaskDetailesID);
        dest.writeValue(this.CheckID);
        dest.writeValue(this.TransferDetailsID);
        dest.writeValue(this.ReturnType);
        dest.writeString(this.ReturnTypeDesc);
        dest.writeString(this.Unit);
        dest.writeString(this.SaleName);
        dest.writeString(this.UnitName);
        dest.writeString(this.PalletNo);
        dest.writeValue(this.PalletQty);
        dest.writeValue(this.ReceiveStatus);
        dest.writeString(this.FromAreaNo);
        dest.writeString(this.FromHouseNo);
        dest.writeString(this.FromWareHouseNo);
        dest.writeInt(this.FromAreaID);
        dest.writeInt(this.FromHouseID);
        dest.writeInt(this.FromWareHouseID);
        dest.writeInt(this.WareHouseID);
        dest.writeInt(this.HouseID);
        dest.writeInt(this.AreaID);
        dest.writeString(this.ErpVoucherNo);
        dest.writeInt(this.StockBarCodeStatus);
        dest.writeString(this.PartNo);
        dest.writeInt(this.PickModel);
        dest.writeValue(this.AmountQty);
    }

    protected StockInfo_Model(Parcel in) {
        super(in);
        this.Barcode = in.readString();
        this.SerialNo = in.readString();
        this.MaterialNo = in.readString();
        this.MaterialDesc = in.readString();
        this.WarehouseNo = in.readString();
        this.HouseNo = in.readString();
        this.AreaNo = in.readString();
        this.Qty = (Float) in.readValue(Float.class.getClassLoader());
        this.TMaterialNo = in.readString();
        this.TMaterialDesc = in.readString();
        this.PickAreaNo = in.readString();
        this.CelareaNo = in.readString();
        this.IsDel = (Float) in.readValue(Float.class.getClassLoader());
        this.BatchNo = in.readString();
        this.SN = in.readString();
        this.ReturnSupCode = in.readString();
        this.ReturnReson = in.readString();
        this.ReturnSupName = in.readString();
        this.OldStockID = (Float) in.readValue(Float.class.getClassLoader());
        this.TaskDetailesID = (Float) in.readValue(Float.class.getClassLoader());
        this.CheckID = (Float) in.readValue(Float.class.getClassLoader());
        this.TransferDetailsID = (Float) in.readValue(Float.class.getClassLoader());
        this.ReturnType = (Float) in.readValue(Float.class.getClassLoader());
        this.ReturnTypeDesc = in.readString();
        this.Unit = in.readString();
        this.SaleName = in.readString();
        this.UnitName = in.readString();
        this.PalletNo = in.readString();
        this.PalletQty = (Float) in.readValue(Float.class.getClassLoader());
        this.ReceiveStatus = (Float) in.readValue(Float.class.getClassLoader());
        this.FromAreaNo = in.readString();
        this.FromHouseNo = in.readString();
        this.FromWareHouseNo = in.readString();
        this.FromAreaID = in.readInt();
        this.FromHouseID = in.readInt();
        this.FromWareHouseID = in.readInt();
        this.WareHouseID = in.readInt();
        this.HouseID = in.readInt();
        this.AreaID = in.readInt();
        this.ErpVoucherNo = in.readString();
        this.StockBarCodeStatus = in.readInt();
        this.PartNo = in.readString();
        this.PickModel = in.readInt();
        this.AmountQty = (Float) in.readValue(Float.class.getClassLoader());
    }

    public static final Creator<StockInfo_Model> CREATOR = new Creator<StockInfo_Model>() {
        @Override
        public StockInfo_Model createFromParcel(Parcel source) {
            return new StockInfo_Model(source);
        }

        @Override
        public StockInfo_Model[] newArray(int size) {
            return new StockInfo_Model[size];
        }
    };
}