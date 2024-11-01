package E6;

import Q5.C1413h;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class Q extends AbstractC1043a {

    /* renamed from: e, reason: collision with root package name */
    private final String f2047e;

    public Q(String source) {
        AbstractC3292y.i(source, "source");
        this.f2047e = source;
    }

    @Override // E6.AbstractC1043a
    public String E(String keyToMatch, boolean z8) {
        AbstractC3292y.i(keyToMatch, "keyToMatch");
        int i8 = this.f2058a;
        try {
            if (j() == 6 && AbstractC3292y.d(G(z8), keyToMatch)) {
                t();
                if (j() == 5) {
                    return G(z8);
                }
            }
            return null;
        } finally {
            this.f2058a = i8;
            t();
        }
    }

    @Override // E6.AbstractC1043a
    public int H(int i8) {
        if (i8 >= C().length()) {
            return -1;
        }
        return i8;
    }

    @Override // E6.AbstractC1043a
    public int J() {
        char charAt;
        int i8 = this.f2058a;
        if (i8 == -1) {
            return i8;
        }
        while (i8 < C().length() && ((charAt = C().charAt(i8)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i8++;
        }
        this.f2058a = i8;
        return i8;
    }

    @Override // E6.AbstractC1043a
    public boolean M() {
        int J8 = J();
        if (J8 == C().length() || J8 == -1 || C().charAt(J8) != ',') {
            return false;
        }
        this.f2058a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // E6.AbstractC1043a
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public String C() {
        return this.f2047e;
    }

    @Override // E6.AbstractC1043a
    public boolean e() {
        int i8 = this.f2058a;
        if (i8 == -1) {
            return false;
        }
        while (i8 < C().length()) {
            char charAt = C().charAt(i8);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f2058a = i8;
                return D(charAt);
            }
            i8++;
        }
        this.f2058a = i8;
        return false;
    }

    @Override // E6.AbstractC1043a
    public String i() {
        l('\"');
        int i8 = this.f2058a;
        int Q8 = l6.n.Q(C(), '\"', i8, false, 4, null);
        if (Q8 != -1) {
            for (int i9 = i8; i9 < Q8; i9++) {
                if (C().charAt(i9) == '\\') {
                    return p(C(), this.f2058a, i9);
                }
            }
            this.f2058a = Q8 + 1;
            String substring = C().substring(i8, Q8);
            AbstractC3292y.h(substring, "substring(...)");
            return substring;
        }
        q();
        y((byte) 1, false);
        throw new C1413h();
    }

    @Override // E6.AbstractC1043a
    public byte j() {
        byte a9;
        String C8 = C();
        do {
            int i8 = this.f2058a;
            if (i8 != -1 && i8 < C8.length()) {
                int i9 = this.f2058a;
                this.f2058a = i9 + 1;
                a9 = AbstractC1044b.a(C8.charAt(i9));
            } else {
                return (byte) 10;
            }
        } while (a9 == 3);
        return a9;
    }

    @Override // E6.AbstractC1043a
    public void l(char c8) {
        if (this.f2058a == -1) {
            P(c8);
        }
        String C8 = C();
        while (this.f2058a < C8.length()) {
            int i8 = this.f2058a;
            this.f2058a = i8 + 1;
            char charAt = C8.charAt(i8);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c8) {
                    return;
                } else {
                    P(c8);
                }
            }
        }
        this.f2058a = -1;
        P(c8);
    }
}
