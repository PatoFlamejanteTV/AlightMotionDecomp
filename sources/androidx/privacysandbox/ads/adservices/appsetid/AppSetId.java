package androidx.privacysandbox.ads.adservices.appsetid;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class AppSetId {
    public static final Companion Companion = new Companion(null);
    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;
    private final String id;
    private final int scope;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public AppSetId(String id, int i8) {
        AbstractC3292y.i(id, "id");
        this.id = id;
        this.scope = i8;
        if (i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("Scope undefined.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        if (AbstractC3292y.d(this.id, appSetId.id) && this.scope == appSetId.scope) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final int getScope() {
        return this.scope;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.scope;
    }

    public String toString() {
        String str;
        if (this.scope == 1) {
            str = "SCOPE_APP";
        } else {
            str = "SCOPE_DEVELOPER";
        }
        return "AppSetId: id=" + this.id + ", scope=" + str;
    }
}
