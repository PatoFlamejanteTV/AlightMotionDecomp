package H3;

import G3.h;
import H3.f;
import H3.j;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;

/* loaded from: classes4.dex */
public abstract class b {

    /* loaded from: classes4.dex */
    private static final class a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private Application f3194a;

        private a() {
        }

        @Override // H3.f.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f3194a = (Application) z5.h.b(application);
            return this;
        }

        @Override // H3.f.a
        public f build() {
            z5.h.a(this.f3194a, Application.class);
            return new C0063b(new g(), this.f3194a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0063b implements f {

        /* renamed from: a, reason: collision with root package name */
        private final Application f3195a;

        /* renamed from: b, reason: collision with root package name */
        private final C0063b f3196b;

        /* renamed from: c, reason: collision with root package name */
        private z5.i f3197c;

        /* renamed from: d, reason: collision with root package name */
        private z5.i f3198d;

        /* renamed from: e, reason: collision with root package name */
        private z5.i f3199e;

        /* renamed from: f, reason: collision with root package name */
        private z5.i f3200f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: H3.b$b$a */
        /* loaded from: classes4.dex */
        public class a implements z5.i {
            a() {
            }

            @Override // N5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public j.a get() {
                return new c(C0063b.this.f3196b);
            }
        }

        private void e(g gVar, Application application) {
            this.f3197c = new a();
            z5.e a9 = z5.f.a(application);
            this.f3198d = a9;
            i a10 = i.a(gVar, a9);
            this.f3199e = a10;
            this.f3200f = h.a(gVar, a10);
        }

        @Override // H3.f
        public N5.a a() {
            return this.f3197c;
        }

        private C0063b(g gVar, Application application) {
            this.f3196b = this;
            this.f3195a = application;
            e(gVar, application);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class c implements j.a {

        /* renamed from: a, reason: collision with root package name */
        private final C0063b f3202a;

        /* renamed from: b, reason: collision with root package name */
        private SavedStateHandle f3203b;

        /* renamed from: c, reason: collision with root package name */
        private h.c f3204c;

        @Override // H3.j.a
        public j build() {
            z5.h.a(this.f3203b, SavedStateHandle.class);
            z5.h.a(this.f3204c, h.c.class);
            return new d(this.f3202a, this.f3203b, this.f3204c);
        }

        @Override // H3.j.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(h.c cVar) {
            this.f3204c = (h.c) z5.h.b(cVar);
            return this;
        }

        @Override // H3.j.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f3203b = (SavedStateHandle) z5.h.b(savedStateHandle);
            return this;
        }

        private c(C0063b c0063b) {
            this.f3202a = c0063b;
        }
    }

    /* loaded from: classes4.dex */
    private static final class d implements j {

        /* renamed from: a, reason: collision with root package name */
        private final h.c f3205a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f3206b;

        /* renamed from: c, reason: collision with root package name */
        private final C0063b f3207c;

        /* renamed from: d, reason: collision with root package name */
        private final d f3208d;

        @Override // H3.j
        public G3.h a() {
            return new G3.h(this.f3205a, this.f3207c.f3195a, this.f3207c.f3200f, this.f3206b);
        }

        private d(C0063b c0063b, SavedStateHandle savedStateHandle, h.c cVar) {
            this.f3208d = this;
            this.f3207c = c0063b;
            this.f3205a = cVar;
            this.f3206b = savedStateHandle;
        }
    }

    public static f.a a() {
        return new a();
    }
}
