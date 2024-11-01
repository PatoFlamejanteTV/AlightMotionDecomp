package d4;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class c extends Exception {

    /* renamed from: d, reason: collision with root package name */
    public static final a f31408d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f31409a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31410b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31411c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final c a(String fieldName) {
            AbstractC3292y.i(fieldName, "fieldName");
            return new c(f.f31441g.b(), "Data element not in the required format or value is invalid as defined in Table A.1", fieldName);
        }

        public final c b(String fieldName) {
            AbstractC3292y.i(fieldName, "fieldName");
            return new c(f.f31439e.b(), "A message element required as defined in Table A.1 is missing from the message.", fieldName);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i8, String description, String detail) {
        super(i8 + " - " + description + " (" + detail + ")");
        AbstractC3292y.i(description, "description");
        AbstractC3292y.i(detail, "detail");
        this.f31409a = i8;
        this.f31410b = description;
        this.f31411c = detail;
    }

    public final int a() {
        return this.f31409a;
    }

    public final String b() {
        return this.f31410b;
    }

    public final String c() {
        return this.f31411c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(f protocolError, String detail) {
        this(protocolError.b(), protocolError.c(), detail);
        AbstractC3292y.i(protocolError, "protocolError");
        AbstractC3292y.i(detail, "detail");
    }
}
