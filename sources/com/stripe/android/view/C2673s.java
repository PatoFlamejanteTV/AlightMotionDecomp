package com.stripe.android.view;

import R5.AbstractC1435t;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: com.stripe.android.view.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2673s {

    /* renamed from: c, reason: collision with root package name */
    private static final b f29171c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f29172d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final a f29173e = new a("00", "Stripe Test Bank");

    /* renamed from: a, reason: collision with root package name */
    private final List f29174a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29175b;

    /* renamed from: com.stripe.android.view.s$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0692a();

        /* renamed from: a, reason: collision with root package name */
        private final String f29176a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29177b;

        /* renamed from: com.stripe.android.view.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0692a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String prefix, String name) {
            AbstractC3292y.i(prefix, "prefix");
            AbstractC3292y.i(name, "name");
            this.f29176a = prefix;
            this.f29177b = name;
        }

        public final String a() {
            return this.f29177b;
        }

        public final String b() {
            return this.f29176a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3292y.d(this.f29176a, aVar.f29176a) && AbstractC3292y.d(this.f29177b, aVar.f29177b);
        }

        public int hashCode() {
            return (this.f29176a.hashCode() * 31) + this.f29177b.hashCode();
        }

        public String toString() {
            return "Bank(prefix=" + this.f29176a + ", name=" + this.f29177b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f29176a);
            out.writeString(this.f29177b);
        }
    }

    /* renamed from: com.stripe.android.view.s$b */
    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List b(Context context) {
            Map b9 = z2.e.f41477a.b(new JSONObject(c(context)));
            if (b9 == null) {
                b9 = R5.Q.h();
            }
            ArrayList arrayList = new ArrayList(b9.size());
            for (Map.Entry entry : b9.entrySet()) {
                arrayList.add(new a((String) entry.getKey(), String.valueOf(entry.getValue())));
            }
            return arrayList;
        }

        private final String c(Context context) {
            String next = new Scanner(context.getResources().getAssets().open("au_becs_bsb.json")).useDelimiter("\\A").next();
            AbstractC3292y.h(next, "next(...)");
            return next;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C2673s(List banks, boolean z8) {
        AbstractC3292y.i(banks, "banks");
        this.f29174a = banks;
        this.f29175b = z8;
    }

    public final a a(String bsb) {
        AbstractC3292y.i(bsb, "bsb");
        List list = this.f29174a;
        a aVar = f29173e;
        Object obj = null;
        if (!this.f29175b) {
            aVar = null;
        }
        Iterator it = AbstractC1435t.G0(list, AbstractC1435t.q(aVar)).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (l6.n.B(bsb, ((a) next).b(), false, 2, null)) {
                obj = next;
                break;
            }
        }
        return (a) obj;
    }

    public /* synthetic */ C2673s(Context context, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this(context, (i8 & 2) != 0 ? true : z8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2673s(Context context, boolean z8) {
        this(f29171c.b(context), z8);
        AbstractC3292y.i(context, "context");
    }
}
