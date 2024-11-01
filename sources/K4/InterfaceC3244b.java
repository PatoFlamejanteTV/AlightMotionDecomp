package k4;

import Q5.I;
import U5.d;
import android.content.Context;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import p3.i;
import r4.C3923w;

/* renamed from: k4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3244b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34501a = a.f34502a;

    /* renamed from: k4.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f34502a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k4.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0788a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f34503a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0788a(Context context) {
                super(1);
                this.f34503a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PlacesClient invoke(Context it) {
                AbstractC3292y.i(it, "it");
                PlacesClient createClient = Places.createClient(this.f34503a);
                AbstractC3292y.h(createClient, "createClient(...)");
                return createClient;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k4.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0789b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f34504a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f34505b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0789b(Context context, String str) {
                super(0);
                this.f34504a = context;
                this.f34505b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5557invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5557invoke() {
                Places.initialize(this.f34504a, this.f34505b);
            }
        }

        private a() {
        }

        public static /* synthetic */ InterfaceC3244b b(a aVar, Context context, String str, r4.I i8, Function1 function1, Function0 function0, i iVar, int i9, Object obj) {
            if ((i9 & 4) != 0) {
                i8 = new C3923w();
            }
            r4.I i10 = i8;
            if ((i9 & 8) != 0) {
                function1 = new C0788a(context);
            }
            Function1 function12 = function1;
            if ((i9 & 16) != 0) {
                function0 = new C0789b(context, str);
            }
            return aVar.a(context, str, i10, function12, function0, iVar);
        }

        public static /* synthetic */ Integer d(a aVar, boolean z8, r4.I i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                i8 = new C3923w();
            }
            return aVar.c(z8, i8);
        }

        public final InterfaceC3244b a(Context context, String googlePlacesApiKey, r4.I isPlacesAvailable, Function1 clientFactory, Function0 initializer, i errorReporter) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(googlePlacesApiKey, "googlePlacesApiKey");
            AbstractC3292y.i(isPlacesAvailable, "isPlacesAvailable");
            AbstractC3292y.i(clientFactory, "clientFactory");
            AbstractC3292y.i(initializer, "initializer");
            AbstractC3292y.i(errorReporter, "errorReporter");
            if (isPlacesAvailable.invoke()) {
                initializer.invoke();
                return new C3243a((PlacesClient) clientFactory.invoke(context), errorReporter);
            }
            return new C3245c(errorReporter);
        }

        public final Integer c(boolean z8, r4.I isPlacesAvailable) {
            int i8;
            AbstractC3292y.i(isPlacesAvailable, "isPlacesAvailable");
            if (isPlacesAvailable.invoke()) {
                if (z8) {
                    i8 = R.drawable.places_powered_by_google_dark;
                } else {
                    i8 = R.drawable.places_powered_by_google_light;
                }
                return Integer.valueOf(i8);
            }
            return null;
        }
    }

    Object a(String str, d dVar);

    Object b(String str, String str2, int i8, d dVar);
}
