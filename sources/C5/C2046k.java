package c5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: c5.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2046k implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private int f15884a;

    /* renamed from: b, reason: collision with root package name */
    private String f15885b;

    /* renamed from: c, reason: collision with root package name */
    private String f15886c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15887d;

    /* renamed from: e, reason: collision with root package name */
    private int f15888e;

    /* renamed from: f, reason: collision with root package name */
    private int f15889f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f15883g = new b(null);
    public static Parcelable.Creator<C2046k> CREATOR = new a();

    /* renamed from: c5.k$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2046k createFromParcel(Parcel source) {
            AbstractC3292y.i(source, "source");
            return new C2046k(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2046k[] newArray(int i8) {
            return new C2046k[i8];
        }
    }

    /* renamed from: c5.k$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public static /* synthetic */ ArrayList b(b bVar, String str, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                i8 = 0;
            }
            return bVar.a(str, i8);
        }

        public final ArrayList a(String json, int i8) {
            AbstractC3292y.i(json, "json");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONObject(json).getJSONArray(DataSchemeDataSource.SCHEME_DATA);
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i9);
                C2046k c2046k = new C2046k(0, null, null, 7, null);
                AbstractC3292y.f(jSONObject);
                c2046k.w(jSONObject, i8);
                arrayList.add(c2046k);
            }
            return arrayList;
        }

        public final ArrayList c(String json) {
            AbstractC3292y.i(json, "json");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONObject(json).getJSONArray(DataSchemeDataSource.SCHEME_DATA);
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i8);
                C2046k c2046k = new C2046k(0, null, null, 7, null);
                AbstractC3292y.f(jSONObject);
                c2046k.x(jSONObject);
                arrayList.add(c2046k);
            }
            return arrayList;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C2046k(int i8, String str, String str2) {
        this.f15884a = i8;
        this.f15885b = str;
        this.f15886c = str2;
    }

    public final void I(boolean z8) {
        this.f15887d = z8;
    }

    public final void Q(int i8) {
        this.f15884a = i8;
    }

    public final void U(String str) {
        this.f15885b = str;
    }

    public final void W(int i8) {
        this.f15888e = i8;
    }

    public final String a() {
        return this.f15886c;
    }

    public final int b() {
        return this.f15884a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final int f() {
        int i8 = this.f15884a;
        if (i8 != 648 && i8 != 567 && i8 != 563) {
            return 20;
        }
        return 12;
    }

    public final String h() {
        return this.f15885b;
    }

    public final int i() {
        return this.f15888e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l() {
        /*
            r3 = this;
            int r0 = r3.f15888e
            r1 = 523(0x20b, float:7.33E-43)
            r2 = 1
            if (r0 != r1) goto L1e
            int r0 = r3.f15884a
            r1 = 568(0x238, float:7.96E-43)
            if (r0 == r1) goto L1e
            r1 = 593(0x251, float:8.31E-43)
            if (r0 == r1) goto L1e
            r1 = 645(0x285, float:9.04E-43)
            if (r0 == r1) goto L1e
            switch(r0) {
                case 558: goto L1d;
                case 559: goto L1d;
                case 560: goto L1d;
                case 561: goto L1e;
                case 562: goto L1d;
                default: goto L18;
            }
        L18:
            switch(r0) {
                case 564: goto L1d;
                case 565: goto L1d;
                case 566: goto L1d;
                default: goto L1b;
            }
        L1b:
            r2 = 6
            goto L1e
        L1d:
            r2 = 5
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.C2046k.l():int");
    }

    public final boolean p() {
        if (this.f15888e != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        return this.f15887d;
    }

    public final int u() {
        return this.f15889f;
    }

    public final void v(JSONObject jsonObjectData) {
        AbstractC3292y.i(jsonObjectData, "jsonObjectData");
        if (!jsonObjectData.isNull("name")) {
            this.f15885b = jsonObjectData.getString("name");
        }
        if (!jsonObjectData.isNull("id")) {
            this.f15884a = jsonObjectData.getInt("id");
        }
        if (!jsonObjectData.isNull("isGame")) {
            this.f15889f = jsonObjectData.getInt("isGame");
        }
    }

    public final void w(JSONObject jsonObjectData, int i8) {
        AbstractC3292y.i(jsonObjectData, "jsonObjectData");
        if (!jsonObjectData.isNull("name")) {
            this.f15885b = jsonObjectData.getString("name");
        }
        if (!jsonObjectData.isNull("id")) {
            this.f15884a = jsonObjectData.getInt("id");
        }
        this.f15888e = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeInt(this.f15884a);
        parcel.writeString(this.f15885b);
        parcel.writeString(this.f15886c);
        parcel.writeBooleanArray(new boolean[]{this.f15887d});
        parcel.writeInt(this.f15888e);
        parcel.writeInt(this.f15889f);
    }

    public final void x(JSONObject jsonObjectData) {
        AbstractC3292y.i(jsonObjectData, "jsonObjectData");
        if (!jsonObjectData.isNull("id")) {
            this.f15884a = jsonObjectData.getInt("id");
        }
        if (!jsonObjectData.isNull("name")) {
            this.f15885b = jsonObjectData.getString("name");
        } else if (!jsonObjectData.isNull("value")) {
            this.f15885b = jsonObjectData.getString("value");
        }
        if (!jsonObjectData.isNull("description")) {
            this.f15886c = jsonObjectData.getString("description");
        }
        this.f15887d = true;
    }

    public final void y(Bundle arg) {
        AbstractC3292y.i(arg, "arg");
        this.f15884a = arg.getInt("id");
        this.f15885b = arg.getString("name");
        this.f15886c = arg.getString("description");
        this.f15887d = arg.getBoolean("isFloating");
        this.f15888e = arg.getInt("parentCategoryId");
        this.f15889f = arg.getInt("isGame");
    }

    public final Bundle z() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f15884a);
        bundle.putString("name", this.f15885b);
        bundle.putString("description", this.f15886c);
        bundle.putBoolean("isFloating", this.f15887d);
        bundle.putInt("parentCategoryId", this.f15888e);
        bundle.putInt("isGame", this.f15889f);
        return bundle;
    }

    public /* synthetic */ C2046k(int i8, String str, String str2, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 0 : i8, (i9 & 2) != 0 ? null : str, (i9 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2046k(Parcel source) {
        this(0, null, null, 7, null);
        AbstractC3292y.i(source, "source");
        this.f15884a = source.readInt();
        this.f15885b = source.readString();
        this.f15886c = source.readString();
        boolean[] zArr = new boolean[1];
        source.readBooleanArray(zArr);
        this.f15887d = zArr[0];
        this.f15888e = source.readInt();
        this.f15889f = source.readInt();
    }
}
