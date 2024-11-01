package l6;

import R5.AbstractC1417a;
import R5.AbstractC1419c;
import R5.AbstractC1435t;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import k6.AbstractC3258j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final Matcher f34773a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f34774b;

    /* renamed from: c, reason: collision with root package name */
    private final g f34775c;

    /* renamed from: d, reason: collision with root package name */
    private List f34776d;

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC1419c {
        a() {
        }

        public /* bridge */ boolean c(String str) {
            return super.contains(str);
        }

        @Override // R5.AbstractC1417a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return c((String) obj);
        }

        @Override // R5.AbstractC1419c, java.util.List
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String get(int i8) {
            String group = i.this.d().group(i8);
            if (group == null) {
                return "";
            }
            return group;
        }

        public /* bridge */ int g(String str) {
            return super.indexOf(str);
        }

        @Override // R5.AbstractC1419c, R5.AbstractC1417a
        public int getSize() {
            return i.this.d().groupCount() + 1;
        }

        @Override // R5.AbstractC1419c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return g((String) obj);
        }

        public /* bridge */ int j(String str) {
            return super.lastIndexOf(str);
        }

        @Override // R5.AbstractC1419c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return j((String) obj);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends AbstractC1417a implements g {

        /* loaded from: classes5.dex */
        static final class a extends AbstractC3293z implements Function1 {
            a() {
                super(1);
            }

            public final f a(int i8) {
                return b.this.e(i8);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        b() {
        }

        public /* bridge */ boolean c(f fVar) {
            return super.contains(fVar);
        }

        @Override // R5.AbstractC1417a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            boolean z8;
            if (obj == null) {
                z8 = true;
            } else {
                z8 = obj instanceof f;
            }
            if (!z8) {
                return false;
            }
            return c((f) obj);
        }

        public f e(int i8) {
            i6.i f8;
            f8 = k.f(i.this.d(), i8);
            if (f8.getStart().intValue() >= 0) {
                String group = i.this.d().group(i8);
                AbstractC3292y.h(group, "group(...)");
                return new f(group, f8);
            }
            return null;
        }

        @Override // R5.AbstractC1417a
        public int getSize() {
            return i.this.d().groupCount() + 1;
        }

        @Override // R5.AbstractC1417a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC3258j.y(AbstractC1435t.c0(AbstractC1435t.n(this)), new a()).iterator();
        }
    }

    public i(Matcher matcher, CharSequence input) {
        AbstractC3292y.i(matcher, "matcher");
        AbstractC3292y.i(input, "input");
        this.f34773a = matcher;
        this.f34774b = input;
        this.f34775c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult d() {
        return this.f34773a;
    }

    @Override // l6.h
    public List a() {
        if (this.f34776d == null) {
            this.f34776d = new a();
        }
        List list = this.f34776d;
        AbstractC3292y.f(list);
        return list;
    }

    @Override // l6.h
    public i6.i b() {
        i6.i e8;
        e8 = k.e(d());
        return e8;
    }

    @Override // l6.h
    public String getValue() {
        String group = d().group();
        AbstractC3292y.h(group, "group(...)");
        return group;
    }

    @Override // l6.h
    public h next() {
        int i8;
        h d8;
        int end = d().end();
        if (d().end() == d().start()) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        int i9 = end + i8;
        if (i9 <= this.f34774b.length()) {
            Matcher matcher = this.f34773a.pattern().matcher(this.f34774b);
            AbstractC3292y.h(matcher, "matcher(...)");
            d8 = k.d(matcher, i9, this.f34774b);
            return d8;
        }
        return null;
    }
}
