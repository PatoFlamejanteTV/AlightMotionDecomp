package androidx.compose.ui.input.key;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class KeyEvent {
    private final android.view.KeyEvent nativeKeyEvent;

    private /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEvent m3859boximpl(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static android.view.KeyEvent m3860constructorimpl(android.view.KeyEvent keyEvent) {
        return keyEvent;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3861equalsimpl(android.view.KeyEvent keyEvent, Object obj) {
        return (obj instanceof KeyEvent) && AbstractC3292y.d(keyEvent, ((KeyEvent) obj).m3865unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3862equalsimpl0(android.view.KeyEvent keyEvent, android.view.KeyEvent keyEvent2) {
        return AbstractC3292y.d(keyEvent, keyEvent2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3863hashCodeimpl(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3864toStringimpl(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m3861equalsimpl(this.nativeKeyEvent, obj);
    }

    public final android.view.KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    public int hashCode() {
        return m3863hashCodeimpl(this.nativeKeyEvent);
    }

    public String toString() {
        return m3864toStringimpl(this.nativeKeyEvent);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ android.view.KeyEvent m3865unboximpl() {
        return this.nativeKeyEvent;
    }
}
