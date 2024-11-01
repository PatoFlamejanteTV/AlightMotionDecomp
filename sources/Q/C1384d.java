package Q;

import android.accounts.Account;
import android.view.View;
import androidx.collection.ArraySet;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import n0.C3382a;

/* renamed from: Q.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1384d {

    /* renamed from: a, reason: collision with root package name */
    private final Account f8213a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f8214b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f8215c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f8216d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8217e;

    /* renamed from: f, reason: collision with root package name */
    private final View f8218f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8219g;

    /* renamed from: h, reason: collision with root package name */
    private final String f8220h;

    /* renamed from: i, reason: collision with root package name */
    private final C3382a f8221i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f8222j;

    /* renamed from: Q.d$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f8223a;

        /* renamed from: b, reason: collision with root package name */
        private ArraySet f8224b;

        /* renamed from: c, reason: collision with root package name */
        private String f8225c;

        /* renamed from: d, reason: collision with root package name */
        private String f8226d;

        /* renamed from: e, reason: collision with root package name */
        private final C3382a f8227e = C3382a.f35053j;

        public C1384d a() {
            return new C1384d(this.f8223a, this.f8224b, null, 0, null, this.f8225c, this.f8226d, this.f8227e, false);
        }

        public a b(String str) {
            this.f8225c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f8224b == null) {
                this.f8224b = new ArraySet();
            }
            this.f8224b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f8223a = account;
            return this;
        }

        public final a e(String str) {
            this.f8226d = str;
            return this;
        }
    }

    public C1384d(Account account, Set set, Map map, int i8, View view, String str, String str2, C3382a c3382a, boolean z8) {
        Set unmodifiableSet;
        this.f8213a = account;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = DesugarCollections.unmodifiableSet(set);
        }
        this.f8214b = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.f8216d = map;
        this.f8218f = view;
        this.f8217e = i8;
        this.f8219g = str;
        this.f8220h = str2;
        this.f8221i = c3382a == null ? C3382a.f35053j : c3382a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f8215c = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            android.support.v4.media.a.a(it.next());
            throw null;
        }
    }

    public Account a() {
        return this.f8213a;
    }

    public String b() {
        Account account = this.f8213a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f8213a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    public Set d() {
        return this.f8215c;
    }

    public Set e(O.a aVar) {
        android.support.v4.media.a.a(this.f8216d.get(aVar));
        return this.f8214b;
    }

    public String f() {
        return this.f8219g;
    }

    public Set g() {
        return this.f8214b;
    }

    public final C3382a h() {
        return this.f8221i;
    }

    public final Integer i() {
        return this.f8222j;
    }

    public final String j() {
        return this.f8220h;
    }

    public final void k(Integer num) {
        this.f8222j = num;
    }
}
