package j4;

import C6.AbstractC1012d0;
import C6.C;
import C6.C1013e;
import C6.C1014e0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import j4.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import r4.C3925y;
import r4.G;

@StabilityInferred(parameters = 0)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes4.dex */
public final class W extends AbstractC3179f0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34057a;

    /* renamed from: b, reason: collision with root package name */
    private final P0 f34058b;

    /* renamed from: c, reason: collision with root package name */
    private final List f34059c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f34055d = 8;
    public static final Parcelable.Creator<W> CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final y6.b[] f34056e = {null, P0.Companion.serializer(), new C1013e(V.a.f34053a)};

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34060a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f34061b;

        static {
            a aVar = new a();
            f34060a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.DropdownSpec", aVar, 3);
            c1014e0.k("api_path", false);
            c1014e0.k("translation_id", false);
            c1014e0.k("items", false);
            f34061b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f34061b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            y6.b[] bVarArr = W.f34056e;
            return new y6.b[]{G.a.f38016a, bVarArr[1], bVarArr[2]};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public W d(B6.e decoder) {
            int i8;
            r4.G g8;
            P0 p02;
            List list;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = W.f34056e;
            r4.G g9 = null;
            if (c8.z()) {
                r4.G g10 = (r4.G) c8.p(a9, 0, G.a.f38016a, null);
                P0 p03 = (P0) c8.p(a9, 1, bVarArr[1], null);
                list = (List) c8.p(a9, 2, bVarArr[2], null);
                g8 = g10;
                p02 = p03;
                i8 = 7;
            } else {
                P0 p04 = null;
                List list2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 != 1) {
                                if (y8 == 2) {
                                    list2 = (List) c8.p(a9, 2, bVarArr[2], list2);
                                    i9 |= 4;
                                } else {
                                    throw new y6.l(y8);
                                }
                            } else {
                                p04 = (P0) c8.p(a9, 1, bVarArr[1], p04);
                                i9 |= 2;
                            }
                        } else {
                            g9 = (r4.G) c8.p(a9, 0, G.a.f38016a, g9);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                g8 = g9;
                p02 = p04;
                list = list2;
            }
            c8.a(a9);
            return new W(i8, g8, p02, list, null);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, W value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            W.p(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f34060a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            r4.G g8 = (r4.G) parcel.readParcelable(W.class.getClassLoader());
            P0 valueOf = P0.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(V.CREATOR.createFromParcel(parcel));
            }
            return new W(g8, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final W[] newArray(int i8) {
            return new W[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(int i8, r4.G g8, P0 p02, List list, C6.n0 n0Var) {
        super(null);
        if (7 != (i8 & 7)) {
            AbstractC1012d0.a(i8, 7, a.f34060a.a());
        }
        this.f34057a = g8;
        this.f34058b = p02;
        this.f34059c = list;
    }

    public static final /* synthetic */ void p(W w8, B6.d dVar, A6.f fVar) {
        y6.b[] bVarArr = f34056e;
        dVar.n(fVar, 0, G.a.f38016a, w8.i());
        dVar.n(fVar, 1, bVarArr[1], w8.f34058b);
        dVar.n(fVar, 2, bVarArr[2], w8.f34059c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w8 = (W) obj;
        if (AbstractC3292y.d(this.f34057a, w8.f34057a) && this.f34058b == w8.f34058b && AbstractC3292y.d(this.f34059c, w8.f34059c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f34057a.hashCode() * 31) + this.f34058b.hashCode()) * 31) + this.f34059c.hashCode();
    }

    public r4.G i() {
        return this.f34057a;
    }

    public final r4.h0 l(Map initialValues) {
        AbstractC3292y.i(initialValues, "initialValues");
        return AbstractC3179f0.f(this, new K0(i(), new C3925y(new J0(this.f34058b.c(), this.f34059c), (String) initialValues.get(i()))), null, 2, null);
    }

    public String toString() {
        return "DropdownSpec(apiPath=" + this.f34057a + ", labelTranslationId=" + this.f34058b + ", items=" + this.f34059c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f34057a, i8);
        out.writeString(this.f34058b.name());
        List list = this.f34059c;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((V) it.next()).writeToParcel(out, i8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(r4.G apiPath, P0 labelTranslationId, List items) {
        super(null);
        AbstractC3292y.i(apiPath, "apiPath");
        AbstractC3292y.i(labelTranslationId, "labelTranslationId");
        AbstractC3292y.i(items, "items");
        this.f34057a = apiPath;
        this.f34058b = labelTranslationId;
        this.f34059c = items;
    }
}
