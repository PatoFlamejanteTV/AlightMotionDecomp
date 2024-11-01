package androidx.compose.runtime;

import d6.InterfaceC2767a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class SlotWriter$groupSlots$1 implements Iterator<Object>, InterfaceC2767a {
    final /* synthetic */ int $end;
    private int current;
    final /* synthetic */ SlotWriter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SlotWriter$groupSlots$1(int i8, int i9, SlotWriter slotWriter) {
        this.$end = i9;
        this.this$0 = slotWriter;
        this.current = i8;
    }

    public final int getCurrent() {
        return this.current;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.current < this.$end) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object[] objArr = this.this$0.slots;
            SlotWriter slotWriter = this.this$0;
            int i8 = this.current;
            this.current = i8 + 1;
            return objArr[slotWriter.dataIndexToDataAddress(i8)];
        }
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCurrent(int i8) {
        this.current = i8;
    }
}
