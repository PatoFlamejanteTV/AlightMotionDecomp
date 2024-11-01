package C2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class e implements c {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f776a;

    /* renamed from: b, reason: collision with root package name */
    private final List f777b;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readValue(e.class.getClassLoader()));
            }
            return new e(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(String value, List args) {
        AbstractC3292y.i(value, "value");
        AbstractC3292y.i(args, "args");
        this.f776a = value;
        this.f777b = args;
    }

    @Override // C2.c
    public String R(Context context) {
        AbstractC3292y.i(context, "context");
        String str = this.f776a;
        Object[] h8 = d.h(context, this.f777b);
        Object[] copyOf = Arrays.copyOf(h8, h8.length);
        String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        AbstractC3292y.h(format, "format(...)");
        return format;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3292y.d(this.f776a, eVar.f776a) && AbstractC3292y.d(this.f777b, eVar.f777b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f776a.hashCode() * 31) + this.f777b.hashCode();
    }

    public String toString() {
        return "StaticResolvableString(value=" + this.f776a + ", args=" + this.f777b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f776a);
        List list = this.f777b;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeValue(it.next());
        }
    }
}
