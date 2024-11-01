package z5;

import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC4272a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f41552a;

    /* renamed from: z5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC0948a {

        /* renamed from: a, reason: collision with root package name */
        final LinkedHashMap f41553a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC0948a(int i8) {
            this.f41553a = b.b(i8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC0948a a(Object obj, i iVar) {
            this.f41553a.put(h.c(obj, LeanbackPreferenceDialogFragment.ARG_KEY), h.c(iVar, "provider"));
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4272a(Map map) {
        this.f41552a = DesugarCollections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map a() {
        return this.f41552a;
    }
}
