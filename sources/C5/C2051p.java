package c5;

import R5.AbstractC1435t;
import android.text.SpannableStringBuilder;
import c5.C2051p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import k6.AbstractC3258j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: c5.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2051p {

    /* renamed from: f, reason: collision with root package name */
    public static final a f15893f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f15894a;

    /* renamed from: b, reason: collision with root package name */
    private String f15895b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f15896c;

    /* renamed from: d, reason: collision with root package name */
    private String f15897d;

    /* renamed from: e, reason: collision with root package name */
    private String f15898e;

    /* renamed from: c5.p$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: c5.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0375a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return T5.a.a(Integer.valueOf(((C2051p) obj).b()), Integer.valueOf(((C2051p) obj2).b()));
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C2051p e(l6.h it) {
            AbstractC3292y.i(it, "it");
            return new C2051p(it.b().e(), (String) it.a().get(0), (String) it.a().get(1), it.getValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence h(l6.h it) {
            AbstractC3292y.i(it, "it");
            return (CharSequence) it.a().get(3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence i(l6.h it) {
            AbstractC3292y.i(it, "it");
            return (CharSequence) it.a().get(2);
        }

        public final List d(String inputText, String tag) {
            AbstractC3292y.i(inputText, "inputText");
            AbstractC3292y.i(tag, "tag");
            return AbstractC3258j.D(AbstractC3258j.y(l6.j.d(new l6.j(tag), inputText, 0, 2, null), new Function1() { // from class: c5.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    C2051p e8;
                    e8 = C2051p.a.e((l6.h) obj);
                    return e8;
                }
            }));
        }

        public final List f(String inputText) {
            AbstractC3292y.i(inputText, "inputText");
            ArrayList arrayList = new ArrayList();
            for (l6.h hVar : l6.j.d(new l6.j("\\[(\\w+)=([\\w\\d]*)](.*?)\\[/(\\w+)]"), inputText, 0, 2, null)) {
                int e8 = hVar.b().e();
                String str = (String) hVar.a().get(1);
                long parseLong = Long.parseLong((String) hVar.a().get(2));
                arrayList.add(new C2051p(e8, str, Long.valueOf(parseLong), (String) hVar.a().get(3), hVar.getValue()));
            }
            for (l6.h hVar2 : l6.j.d(new l6.j("<(\\w+)>(.*?)</(\\w+)>"), inputText, 0, 2, null)) {
                arrayList.add(new C2051p(hVar2.b().e(), (String) hVar2.a().get(1), (String) hVar2.a().get(2), hVar2.getValue()));
            }
            return AbstractC1435t.P0(arrayList, new C0375a());
        }

        public final String g(SpannableStringBuilder spannableStringBuilder) {
            AbstractC3292y.i(spannableStringBuilder, "<this>");
            return l6.n.z(new l6.j("<(\\w+)>(.*?)</(\\w+)>").g(new l6.j("\\[(\\w+)=([\\w\\d]*)](.*?)\\[/(\\w+)]").g(spannableStringBuilder, new Function1() { // from class: c5.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence h8;
                    h8 = C2051p.a.h((l6.h) obj);
                    return h8;
                }
            }), new Function1() { // from class: c5.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence i8;
                    i8 = C2051p.a.i((l6.h) obj);
                    return i8;
                }
            }), "<br />", "", false, 4, null);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C2051p(int i8, String tagType, Long l8, String text, String str) {
        AbstractC3292y.i(tagType, "tagType");
        AbstractC3292y.i(text, "text");
        this.f15894a = i8;
        this.f15895b = tagType;
        this.f15896c = l8;
        this.f15897d = text;
        this.f15898e = str;
    }

    public final Long a() {
        return this.f15896c;
    }

    public final int b() {
        return this.f15894a;
    }

    public final String c() {
        return this.f15895b;
    }

    public final String d() {
        return this.f15897d;
    }

    public final String e() {
        return this.f15898e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2051p(int i8, String tagType, String text, String str) {
        this(i8, tagType, null, text, str);
        AbstractC3292y.i(tagType, "tagType");
        AbstractC3292y.i(text, "text");
    }
}
