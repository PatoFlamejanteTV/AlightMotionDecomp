package c5;

import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class V implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f15705a;

    /* renamed from: b, reason: collision with root package name */
    private String f15706b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f15704c = new b(null);
    public static Parcelable.Creator<V> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public V createFromParcel(Parcel source) {
            AbstractC3292y.i(source, "source");
            return new V(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public V[] newArray(int i8) {
            return new V[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final V a(JSONObject jsonObjectVideo) {
            AbstractC3292y.i(jsonObjectVideo, "jsonObjectVideo");
            V v8 = new V();
            if (!jsonObjectVideo.isNull("youtubeID")) {
                v8.b(jsonObjectVideo.getString("youtubeID"));
            }
            if (!jsonObjectVideo.isNull("image")) {
                v8.f(jsonObjectVideo.getString("image"));
            }
            return v8;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public V() {
    }

    public final String a() {
        if (this.f15706b != null) {
            return this.f15706b + UptodownApp.f29249C.r() + ":webp";
        }
        return null;
    }

    public final void b(String str) {
        this.f15705a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final void f(String str) {
        this.f15706b = str;
    }

    public final String getId() {
        return this.f15705a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeString(this.f15705a);
        parcel.writeString(this.f15706b);
    }

    public V(Parcel source) {
        AbstractC3292y.i(source, "source");
        this.f15705a = source.readString();
        this.f15706b = source.readString();
    }
}
