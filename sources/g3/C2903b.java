package g3;

import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2903b implements z2.f {
    public static final Parcelable.Creator<C2903b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map f32090a;

    /* renamed from: g3.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2903b createFromParcel(Parcel parcel) {
            boolean z8;
            AbstractC3292y.i(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                linkedHashMap.put(readString, Boolean.valueOf(z8));
            }
            return new C2903b(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2903b[] newArray(int i8) {
            return new C2903b[i8];
        }
    }

    public C2903b(Map statuses) {
        AbstractC3292y.i(statuses, "statuses");
        this.f32090a = statuses;
    }

    public final /* synthetic */ boolean a(com.stripe.android.view.r bank) {
        AbstractC3292y.i(bank, "bank");
        Boolean bool = (Boolean) this.f32090a.get(bank.getId());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2903b) && AbstractC3292y.d(this.f32090a, ((C2903b) obj).f32090a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f32090a.hashCode();
    }

    public String toString() {
        return "BankStatuses(statuses=" + this.f32090a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        Map map = this.f32090a;
        out.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ C2903b(Map map, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? Q.h() : map);
    }
}
