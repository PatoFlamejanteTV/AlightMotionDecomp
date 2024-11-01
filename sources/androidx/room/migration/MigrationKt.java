package androidx.room.migration;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class MigrationKt {
    public static final Migration Migration(int i8, int i9, Function1 migrate) {
        AbstractC3292y.i(migrate, "migrate");
        return new MigrationImpl(i8, i9, migrate);
    }
}
