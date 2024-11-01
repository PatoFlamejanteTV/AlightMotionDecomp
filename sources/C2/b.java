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
public final class b implements c {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f773a;

    /* renamed from: b, reason: collision with root package name */
    private final List f774b;

    /* renamed from: c, reason: collision with root package name */
    private final List f775c;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i8 = 0; i8 != readInt2; i8++) {
                arrayList.add(parcel.readParcelable(b.class.getClassLoader()));
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            for (int i9 = 0; i9 != readInt3; i9++) {
                arrayList2.add(parcel.readValue(b.class.getClassLoader()));
            }
            return new b(readInt, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i8) {
            return new b[i8];
        }
    }

    public b(int i8, List transformations, List args) {
        AbstractC3292y.i(transformations, "transformations");
        AbstractC3292y.i(args, "args");
        this.f773a = i8;
        this.f774b = transformations;
        this.f775c = args;
    }

    @Override // C2.c
    public String R(Context context) {
        AbstractC3292y.i(context, "context");
        List list = this.f774b;
        int i8 = this.f773a;
        Object[] h8 = d.h(context, this.f775c);
        String string = context.getString(i8, Arrays.copyOf(h8, h8.length));
        AbstractC3292y.h(string, "getString(...)");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            string = ((D2.b) it.next()).O(string);
        }
        return string;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f773a == bVar.f773a && AbstractC3292y.d(this.f774b, bVar.f774b) && AbstractC3292y.d(this.f775c, bVar.f775c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f773a * 31) + this.f774b.hashCode()) * 31) + this.f775c.hashCode();
    }

    public String toString() {
        return "IdentifierResolvableString(id=" + this.f773a + ", transformations=" + this.f774b + ", args=" + this.f775c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeInt(this.f773a);
        List list = this.f774b;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        List list2 = this.f775c;
        out.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            out.writeValue(it2.next());
        }
    }
}
