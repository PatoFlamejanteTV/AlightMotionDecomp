package a6;

import java.io.File;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1682g extends AbstractC1681f {
    public static String a(File file) {
        AbstractC3292y.i(file, "<this>");
        String name = file.getName();
        AbstractC3292y.h(name, "getName(...)");
        return n.F0(name, '.', "");
    }
}
