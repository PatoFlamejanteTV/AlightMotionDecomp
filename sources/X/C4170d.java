package x;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4170d {

    /* renamed from: c, reason: collision with root package name */
    private static final C4170d f40810c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f40811a;

    /* renamed from: b, reason: collision with root package name */
    private final List f40812b;

    /* renamed from: x.d$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f40813a = "";

        /* renamed from: b, reason: collision with root package name */
        private List f40814b = new ArrayList();

        a() {
        }

        public C4170d a() {
            return new C4170d(this.f40813a, DesugarCollections.unmodifiableList(this.f40814b));
        }

        public a b(List list) {
            this.f40814b = list;
            return this;
        }

        public a c(String str) {
            this.f40813a = str;
            return this;
        }
    }

    C4170d(String str, List list) {
        this.f40811a = str;
        this.f40812b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f40812b;
    }

    public String b() {
        return this.f40811a;
    }
}
