package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new Parcelable.Creator<BatchReportMessage>() { // from class: com.mbridge.msdk.foundation.same.report.BatchReportMessage.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BatchReportMessage[] newArray(int i8) {
            return new BatchReportMessage[i8];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private String f21041a;

    /* renamed from: b, reason: collision with root package name */
    private long f21042b;

    /* renamed from: c, reason: collision with root package name */
    private String f21043c;

    public BatchReportMessage(String str, String str2, long j8) {
        this.f21043c = str;
        this.f21041a = str2;
        this.f21042b = j8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f21041a;
    }

    public long getTimestamp() {
        return this.f21042b;
    }

    public String getUuid() {
        return this.f21043c;
    }

    public void setReportMessage(String str) {
        this.f21041a = str;
    }

    public void setTimestamp(long j8) {
        this.f21042b = j8;
    }

    public void setUuid(String str) {
        this.f21043c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f21043c);
        parcel.writeString(this.f21041a);
        parcel.writeLong(this.f21042b);
    }

    protected BatchReportMessage(Parcel parcel) {
        this.f21043c = parcel.readString();
        this.f21041a = parcel.readString();
        this.f21042b = parcel.readLong();
    }
}
