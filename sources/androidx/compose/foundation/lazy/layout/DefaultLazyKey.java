package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class DefaultLazyKey implements Parcelable {
    private final int index;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new Parcelable.Creator<DefaultLazyKey>() { // from class: androidx.compose.foundation.lazy.layout.DefaultLazyKey$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultLazyKey createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new DefaultLazyKey(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultLazyKey[] newArray(int i8) {
            return new DefaultLazyKey[i8];
        }
    };

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public DefaultLazyKey(int i8) {
        this.index = i8;
    }

    private final int component1() {
        return this.index;
    }

    public static /* synthetic */ DefaultLazyKey copy$default(DefaultLazyKey defaultLazyKey, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = defaultLazyKey.index;
        }
        return defaultLazyKey.copy(i8);
    }

    public final DefaultLazyKey copy(int i8) {
        return new DefaultLazyKey(i8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.index == ((DefaultLazyKey) obj).index;
    }

    public int hashCode() {
        return this.index;
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.index + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeInt(this.index);
    }
}
