package c3;

import Q5.s;
import R5.AbstractC1435t;
import a6.AbstractC1677b;
import a6.AbstractC1684i;
import com.stripe.android.model.StripeIntent;
import j4.H0;
import j4.s0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import l6.C3338d;

/* renamed from: c3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2024d {

    /* renamed from: c3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f15460a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f15461b;

        /* renamed from: c, reason: collision with root package name */
        private final String f15462c;

        public a(List sharedDataSpecs, boolean z8, String str) {
            AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
            this.f15460a = sharedDataSpecs;
            this.f15461b = z8;
            this.f15462c = str;
        }

        public final String a() {
            return this.f15462c;
        }

        public final boolean b() {
            return this.f15461b;
        }

        public final List c() {
            return this.f15460a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3292y.d(this.f15460a, aVar.f15460a) && this.f15461b == aVar.f15461b && AbstractC3292y.d(this.f15462c, aVar.f15462c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f15460a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f15461b)) * 31;
            String str = this.f15462c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Result(sharedDataSpecs=" + this.f15460a + ", failedToParseServerResponse=" + this.f15461b + ", failedToParseServerErrorMessage=" + this.f15462c + ")";
        }
    }

    private final String a(InputStream inputStream) {
        BufferedReader bufferedReader;
        String f8;
        if (inputStream != null) {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C3338d.f34755b), 8192);
        } else {
            bufferedReader = null;
        }
        if (bufferedReader != null) {
            try {
                f8 = AbstractC1684i.f(bufferedReader);
            } finally {
            }
        } else {
            f8 = null;
        }
        AbstractC1677b.a(bufferedReader, null);
        return f8;
    }

    private final List c(InputStream inputStream) {
        List list;
        String a9 = a(inputStream);
        if (a9 != null) {
            Object a10 = s0.f34263a.a(a9);
            if (s.e(a10) != null) {
                a10 = AbstractC1435t.m();
            }
            list = (List) a10;
        } else {
            list = null;
        }
        if (list == null) {
            return AbstractC1435t.m();
        }
        return list;
    }

    private final List d() {
        ClassLoader classLoader = C2024d.class.getClassLoader();
        AbstractC3292y.f(classLoader);
        return c(classLoader.getResourceAsStream("lpms.json"));
    }

    public final a b(StripeIntent stripeIntent, String str) {
        boolean z8;
        AbstractC3292y.i(stripeIntent, "stripeIntent");
        List e8 = stripeIntent.e();
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        if (str != null && str.length() != 0) {
            Object a9 = s0.f34263a.a(str);
            z8 = s.g(a9);
            Throwable e9 = s.e(a9);
            if (e9 != null) {
                str2 = e9.getMessage();
            }
            if (s.e(a9) != null) {
                a9 = AbstractC1435t.m();
            }
            AbstractC1435t.C(arrayList, (Iterable) a9);
        } else {
            z8 = false;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((H0) it.next()).getType());
        }
        Set b12 = AbstractC1435t.b1(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : e8) {
            if (!b12.contains((String) obj)) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            List d8 = d();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : d8) {
                if (arrayList3.contains(((H0) obj2).getType())) {
                    arrayList4.add(obj2);
                }
            }
            AbstractC1435t.C(arrayList, arrayList4);
        }
        return new a(arrayList, z8, str2);
    }
}
