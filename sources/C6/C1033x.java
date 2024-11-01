package C6;

import Q5.InterfaceC1416k;
import R5.AbstractC1428l;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: C6.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1033x implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Enum[] f1125a;

    /* renamed from: b, reason: collision with root package name */
    private A6.f f1126b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f1127c;

    /* renamed from: C6.x$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1129b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f1129b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A6.f invoke() {
            A6.f fVar = C1033x.this.f1126b;
            if (fVar == null) {
                return C1033x.this.h(this.f1129b);
            }
            return fVar;
        }
    }

    public C1033x(String serialName, Enum[] values) {
        AbstractC3292y.i(serialName, "serialName");
        AbstractC3292y.i(values, "values");
        this.f1125a = values;
        this.f1127c = Q5.l.b(new a(serialName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final A6.f h(String str) {
        C1032w c1032w = new C1032w(str, this.f1125a.length);
        for (Enum r02 : this.f1125a) {
            C1014e0.l(c1032w, r02.name(), false, 2, null);
        }
        return c1032w;
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return (A6.f) this.f1127c.getValue();
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Enum d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        int i8 = decoder.i(a());
        if (i8 >= 0) {
            Enum[] enumArr = this.f1125a;
            if (i8 < enumArr.length) {
                return enumArr[i8];
            }
        }
        throw new y6.h(i8 + " is not among valid " + a().a() + " enum values, values size is " + this.f1125a.length);
    }

    @Override // y6.i
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void e(B6.f encoder, Enum value) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        int p02 = AbstractC1428l.p0(this.f1125a, value);
        if (p02 != -1) {
            encoder.A(a(), p02);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(a().a());
        sb.append(", must be one of ");
        String arrays = Arrays.toString(this.f1125a);
        AbstractC3292y.h(arrays, "toString(...)");
        sb.append(arrays);
        throw new y6.h(sb.toString());
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + a().a() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1033x(String serialName, Enum[] values, A6.f descriptor) {
        this(serialName, values);
        AbstractC3292y.i(serialName, "serialName");
        AbstractC3292y.i(values, "values");
        AbstractC3292y.i(descriptor, "descriptor");
        this.f1126b = descriptor;
    }
}
