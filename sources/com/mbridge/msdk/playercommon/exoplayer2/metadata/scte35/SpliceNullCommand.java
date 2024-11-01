package com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new Parcelable.Creator<SpliceNullCommand>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35.SpliceNullCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceNullCommand createFromParcel(Parcel parcel) {
            return new SpliceNullCommand();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceNullCommand[] newArray(int i8) {
            return new SpliceNullCommand[i8];
        }
    };

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
    }
}
