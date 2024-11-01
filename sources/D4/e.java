package d4;

import R5.AbstractC1435t;
import R5.N;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.i;
import i6.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f31433a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31434b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31435c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f31436d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f31431e = new a(null);
    public static final Parcelable.Creator<e> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final List f31432f = AbstractC1435t.m();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final e a(JSONObject jSONObject) {
            String optString = jSONObject.optString("name");
            if (optString.length() <= 64) {
                String optString2 = jSONObject.optString("id");
                if (optString2.length() <= 64) {
                    HashMap hashMap = new HashMap();
                    JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String optString3 = optJSONObject.optString(next);
                            if (optString3.length() <= 8059) {
                                AbstractC3292y.f(next);
                                AbstractC3292y.f(optString3);
                                hashMap.put(next, optString3);
                            } else {
                                throw c.f31408d.a("messageExtension.data.value");
                            }
                        }
                    }
                    AbstractC3292y.f(optString);
                    AbstractC3292y.f(optString2);
                    return new e(optString, optString2, jSONObject.optBoolean("criticalityIndicator"), hashMap);
                }
                throw c.f31408d.a("messageExtension.id");
            }
            throw c.f31408d.a("messageExtension.name");
        }

        public final List b(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            i s8 = m.s(0, jSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                JSONObject optJSONObject = jSONArray.optJSONObject(((N) it).nextInt());
                if (optJSONObject != null) {
                    arrayList.add(optJSONObject);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(e.f31431e.a((JSONObject) it2.next()));
            }
            if (arrayList2.size() <= 10) {
                return arrayList2;
            }
            throw c.f31408d.a("messageExtensions");
        }

        public final JSONArray c(List list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((e) it.next()).f());
            }
            return jSONArray;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            boolean z8;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new e(readString, readString2, z8, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(String name, String id, boolean z8, Map data) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(data, "data");
        this.f31433a = name;
        this.f31434b = id;
        this.f31435c = z8;
        this.f31436d = data;
    }

    public final boolean a() {
        return this.f31435c;
    }

    public final boolean b() {
        return f31432f.contains(this.f31433a);
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
        if (AbstractC3292y.d(this.f31433a, eVar.f31433a) && AbstractC3292y.d(this.f31434b, eVar.f31434b) && this.f31435c == eVar.f31435c && AbstractC3292y.d(this.f31436d, eVar.f31436d)) {
            return true;
        }
        return false;
    }

    public final JSONObject f() {
        JSONObject put = new JSONObject().put("name", this.f31433a).put("id", this.f31434b).put("criticalityIndicator", this.f31435c).put(DataSchemeDataSource.SCHEME_DATA, new JSONObject(this.f31436d));
        AbstractC3292y.h(put, "put(...)");
        return put;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f31433a.hashCode() * 31) + this.f31434b.hashCode()) * 31;
        boolean z8 = this.f31435c;
        int i8 = z8;
        if (z8 != 0) {
            i8 = 1;
        }
        return ((hashCode + i8) * 31) + this.f31436d.hashCode();
    }

    public String toString() {
        return "MessageExtension(name=" + this.f31433a + ", id=" + this.f31434b + ", criticalityIndicator=" + this.f31435c + ", data=" + this.f31436d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f31433a);
        out.writeString(this.f31434b);
        out.writeInt(this.f31435c ? 1 : 0);
        Map map = this.f31436d;
        out.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeString((String) entry.getValue());
        }
    }
}
