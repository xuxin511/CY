package com.xx.chinetek.model.QC;

import android.os.Parcel;
import android.os.Parcelable;

import com.xx.chinetek.model.Base_Model;

/**
 * Created by GHOST on 2017/6/28.
 */

public class QualityInfo_Model extends Base_Model implements Parcelable{

    private int IsDel;
    private int NoticeStatus;
    private int QualityType;
    private String MaterialNo;
    private String MaterialDesc;
    private Float InSQty;
    private String Unit;
    private String UnitName;
    private Float QuanQty;
    private Float UnQuanQty;
    private Float DesQty;
    private String WarehouseNo;
    private String BatchNo;
    /// <summary>
    /// ERP收货入库单
    /// </summary>
    private String ErpInVoucherNo;
    /// <summary>
    /// ERP检验单号
    /// </summary>
    private String ErpVoucherNo;
    /// <summary>
    /// 取样人编号
    /// </summary>
    private String QuanUserNo;


    public int getIsDel() {
        return IsDel;
    }

    public void setIsDel(int isDel) {
        IsDel = isDel;
    }

    public int getNoticeStatus() {
        return NoticeStatus;
    }

    public void setNoticeStatus(int noticeStatus) {
        NoticeStatus = noticeStatus;
    }

    public int getQualityType() {
        return QualityType;
    }

    public void setQualityType(int qualityType) {
        QualityType = qualityType;
    }

    public String getMaterialNo() {
        return MaterialNo;
    }

    public void setMaterialNo(String materialNo) {
        MaterialNo = materialNo;
    }

    public String getMaterialDesc() {
        return MaterialDesc;
    }

    public void setMaterialDesc(String materialDesc) {
        MaterialDesc = materialDesc;
    }

    public Float getInSQty() {
        return InSQty;
    }

    public void setInSQty(Float inSQty) {
        InSQty = inSQty;
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

    public Float getQuanQty() {
        return QuanQty;
    }

    public void setQuanQty(Float quanQty) {
        QuanQty = quanQty;
    }

    public Float getUnQuanQty() {
        return UnQuanQty;
    }

    public void setUnQuanQty(Float unQuanQty) {
        UnQuanQty = unQuanQty;
    }

    public Float getDesQty() {
        return DesQty;
    }

    public void setDesQty(Float desQty) {
        DesQty = desQty;
    }

    public String getWarehouseNo() {
        return WarehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        WarehouseNo = warehouseNo;
    }

    public String getBatchNo() {
        return BatchNo;
    }

    public void setBatchNo(String batchNo) {
        BatchNo = batchNo;
    }

    public String getErpInVoucherNo() {
        return ErpInVoucherNo;
    }

    public void setErpInVoucherNo(String erpInVoucherNo) {
        ErpInVoucherNo = erpInVoucherNo;
    }

    public String getErpVoucherNo() {
        return ErpVoucherNo;
    }

    public void setErpVoucherNo(String erpVoucherNo) {
        ErpVoucherNo = erpVoucherNo;
    }

    public String getQuanUserNo() {
        return QuanUserNo;
    }

    public void setQuanUserNo(String quanUserNo) {
        QuanUserNo = quanUserNo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.IsDel);
        dest.writeInt(this.NoticeStatus);
        dest.writeInt(this.QualityType);
        dest.writeString(this.MaterialNo);
        dest.writeString(this.MaterialDesc);
        dest.writeValue(this.InSQty);
        dest.writeString(this.Unit);
        dest.writeString(this.UnitName);
        dest.writeValue(this.QuanQty);
        dest.writeValue(this.UnQuanQty);
        dest.writeValue(this.DesQty);
        dest.writeString(this.WarehouseNo);
        dest.writeString(this.BatchNo);
        dest.writeString(this.ErpInVoucherNo);
        dest.writeString(this.ErpVoucherNo);
        dest.writeString(this.QuanUserNo);
    }

    public QualityInfo_Model() {
    }

    public QualityInfo_Model(String ErpVoucherNo){
        this.ErpVoucherNo=ErpVoucherNo;
    }

    protected QualityInfo_Model(Parcel in) {
        super(in);
        this.IsDel = in.readInt();
        this.NoticeStatus = in.readInt();
        this.QualityType = in.readInt();
        this.MaterialNo = in.readString();
        this.MaterialDesc = in.readString();
        this.InSQty = (Float) in.readValue(Float.class.getClassLoader());
        this.Unit = in.readString();
        this.UnitName = in.readString();
        this.QuanQty = (Float) in.readValue(Float.class.getClassLoader());
        this.UnQuanQty = (Float) in.readValue(Float.class.getClassLoader());
        this.DesQty = (Float) in.readValue(Float.class.getClassLoader());
        this.WarehouseNo = in.readString();
        this.BatchNo = in.readString();
        this.ErpInVoucherNo = in.readString();
        this.ErpVoucherNo = in.readString();
        this.QuanUserNo = in.readString();
    }

    public static final Creator<QualityInfo_Model> CREATOR = new Creator<QualityInfo_Model>() {
        @Override
        public QualityInfo_Model createFromParcel(Parcel source) {
            return new QualityInfo_Model(source);
        }

        @Override
        public QualityInfo_Model[] newArray(int size) {
            return new QualityInfo_Model[size];
        }
    };
}