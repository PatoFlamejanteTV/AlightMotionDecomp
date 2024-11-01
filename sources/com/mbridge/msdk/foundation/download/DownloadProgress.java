package com.mbridge.msdk.foundation.download;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class DownloadProgress implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new Parcelable.Creator<DownloadProgress>() { // from class: com.mbridge.msdk.foundation.download.DownloadProgress.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadProgress createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadProgress[] newArray(int i8) {
            return new DownloadProgress[i8];
        }
    };
    private long current;
    private int currentDownloadRate;
    private long total;

    public DownloadProgress(long j8, long j9, int i8) {
        this.current = j8;
        this.total = j9;
        this.currentDownloadRate = i8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrent() {
        return this.current;
    }

    public int getCurrentDownloadRate() {
        return this.currentDownloadRate;
    }

    public long getTotal() {
        return this.total;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.current);
        parcel.writeLong(this.total);
        parcel.writeInt(this.currentDownloadRate);
    }

    protected DownloadProgress(Parcel parcel) {
        this.current = parcel.readLong();
        this.total = parcel.readLong();
        this.currentDownloadRate = parcel.readInt();
    }
}
