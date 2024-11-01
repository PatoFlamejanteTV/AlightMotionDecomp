package androidx.datastore.migrations;

import Q5.I;
import Q5.InterfaceC1416k;
import Q5.t;
import R5.AbstractC1435t;
import U5.d;
import V5.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.datastore.core.DataMigration;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
public final class SharedPreferencesMigration<T> implements DataMigration<T> {
    private final Context context;
    private final Set<String> keySet;
    private final InterfaceC2073o migrate;
    private final String name;
    private final InterfaceC1416k sharedPrefs$delegate;
    private final InterfaceC2072n shouldRunMigration;

    @f(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends l implements InterfaceC2072n {
        int label;

        AnonymousClass1(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(dVar);
        }

        public final Object invoke(T t8, d dVar) {
            return ((AnonymousClass1) create(t8, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label == 0) {
                t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((AnonymousClass1) obj, (d) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends l implements InterfaceC2072n {
        int label;

        AnonymousClass2(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass2(dVar);
        }

        public final Object invoke(T t8, d dVar) {
            return ((AnonymousClass2) create(t8, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label == 0) {
                t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((AnonymousClass2) obj, (d) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends l implements InterfaceC2072n {
        int label;

        AnonymousClass3(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass3(dVar);
        }

        public final Object invoke(T t8, d dVar) {
            return ((AnonymousClass3) create(t8, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label == 0) {
                t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((AnonymousClass3) obj, (d) obj2);
        }
    }

    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass4 extends AbstractC3293z implements Function0 {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $sharedPreferencesName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Context context, String str) {
            super(0);
            this.$context = context;
            this.$sharedPreferencesName = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.$context.getSharedPreferences(this.$sharedPreferencesName, 0);
            AbstractC3292y.h(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(24)
    /* loaded from: classes3.dex */
    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @DoNotInline
        public static final boolean deleteSharedPreferences(Context context, String name) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String sharedPreferencesName, InterfaceC2073o migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sharedPreferencesName, "sharedPreferencesName");
        AbstractC3292y.i(migrate, "migrate");
    }

    private final void deleteSharedPreferences(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.deleteSharedPreferences(context, str);
            return;
        }
        File sharedPrefsFile = getSharedPrefsFile(context, str);
        File sharedPrefsBackup = getSharedPrefsBackup(sharedPrefsFile);
        sharedPrefsFile.delete();
        sharedPrefsBackup.delete();
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs$delegate.getValue();
    }

    private final File getSharedPrefsBackup(File file) {
        return new File(file.getPath() + ".bak");
    }

    private final File getSharedPrefsFile(Context context, String str) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str + ".xml");
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(d dVar) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor edit = getSharedPrefs().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            edit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
        }
        if (edit.commit()) {
            if (getSharedPrefs().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
                deleteSharedPreferences(context, str);
            }
            Set<String> set2 = this.keySet;
            if (set2 != null) {
                set2.clear();
            }
            return I.f8786a;
        }
        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(T t8, d dVar) {
        return this.migrate.invoke(new SharedPreferencesView(getSharedPrefs(), this.keySet), t8, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:            if (r5.isEmpty() == false) goto L38;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.datastore.core.DataMigration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object shouldMigrate(T r5, U5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = (androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = new androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.datastore.migrations.SharedPreferencesMigration r5 = (androidx.datastore.migrations.SharedPreferencesMigration) r5
            Q5.t.b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            Q5.t.b(r6)
            c6.n r6 = r4.shouldRunMigration
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L54
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r0)
            return r5
        L54:
            java.util.Set<java.lang.String> r6 = r5.keySet
            if (r6 != 0) goto L6e
            android.content.SharedPreferences r5 = r5.getSharedPrefs()
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.AbstractC3292y.h(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6c
            goto L98
        L6c:
            r3 = 0
            goto L98
        L6e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            android.content.SharedPreferences r5 = r5.getSharedPrefs()
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L82
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L82
            goto L6c
        L82:
            java.util.Iterator r6 = r6.iterator()
        L86:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L86
        L98:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration.shouldMigrate(java.lang.Object, U5.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String sharedPreferencesName, Set<String> keysToMigrate, InterfaceC2073o migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sharedPreferencesName, "sharedPreferencesName");
        AbstractC3292y.i(keysToMigrate, "keysToMigrate");
        AbstractC3292y.i(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Function0 produceSharedPreferences, InterfaceC2073o migrate) {
        this(produceSharedPreferences, (Set) null, (InterfaceC2072n) null, migrate, 6, (AbstractC3284p) null);
        AbstractC3292y.i(produceSharedPreferences, "produceSharedPreferences");
        AbstractC3292y.i(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Function0 produceSharedPreferences, Set<String> keysToMigrate, InterfaceC2073o migrate) {
        this(produceSharedPreferences, keysToMigrate, (InterfaceC2072n) null, migrate, 4, (AbstractC3284p) null);
        AbstractC3292y.i(produceSharedPreferences, "produceSharedPreferences");
        AbstractC3292y.i(keysToMigrate, "keysToMigrate");
        AbstractC3292y.i(migrate, "migrate");
    }

    private SharedPreferencesMigration(Function0 function0, Set<String> set, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, Context context, String str) {
        this.shouldRunMigration = interfaceC2072n;
        this.migrate = interfaceC2073o;
        this.context = context;
        this.name = str;
        this.sharedPrefs$delegate = Q5.l.b(function0);
        this.keySet = set == SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() ? null : AbstractC1435t.a1(set);
    }

    /* synthetic */ SharedPreferencesMigration(Function0 function0, Set set, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, Context context, String str, int i8, AbstractC3284p abstractC3284p) {
        this(function0, (Set<String>) set, (i8 & 4) != 0 ? new AnonymousClass1(null) : interfaceC2072n, interfaceC2073o, context, str);
    }

    public /* synthetic */ SharedPreferencesMigration(Function0 function0, Set set, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, int i8, AbstractC3284p abstractC3284p) {
        this(function0, (Set<String>) ((i8 & 2) != 0 ? SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set), (i8 & 4) != 0 ? new AnonymousClass2(null) : interfaceC2072n, interfaceC2073o);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Function0 produceSharedPreferences, Set<String> keysToMigrate, InterfaceC2072n shouldRunMigration, InterfaceC2073o migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (Context) null, (String) null);
        AbstractC3292y.i(produceSharedPreferences, "produceSharedPreferences");
        AbstractC3292y.i(keysToMigrate, "keysToMigrate");
        AbstractC3292y.i(shouldRunMigration, "shouldRunMigration");
        AbstractC3292y.i(migrate, "migrate");
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, int i8, AbstractC3284p abstractC3284p) {
        this(context, str, (i8 & 4) != 0 ? SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set, (i8 & 8) != 0 ? new AnonymousClass3(null) : interfaceC2072n, interfaceC2073o);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String sharedPreferencesName, Set<String> keysToMigrate, InterfaceC2072n shouldRunMigration, InterfaceC2073o migrate) {
        this(new AnonymousClass4(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sharedPreferencesName, "sharedPreferencesName");
        AbstractC3292y.i(keysToMigrate, "keysToMigrate");
        AbstractC3292y.i(shouldRunMigration, "shouldRunMigration");
        AbstractC3292y.i(migrate, "migrate");
    }
}
